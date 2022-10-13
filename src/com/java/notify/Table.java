package com.java.notify;

import java.util.ArrayList;

public class Table {
	String[] dishNames = { "donut", "donut", "burger" }; // ������ ����
	final int MAX_FOOD = 6; // ������ ����

	private ArrayList<String> dishes = new ArrayList<String>(); // ���� ���Ĺ迭 �ƽ� 6�� ����.

	public synchronized void add(String dish) { // ���ÿ� ������ �߰��ϴ� ��. //cook����
		
		while (dishes.size() >= MAX_FOOD) { //���ÿ� 6�� �̻� �ִٸ� �۵� ����. �ش� ���� ���� ���ÿ� ������ �԰� ������� 
			String name = Thread.currentThread().getName();
			System.out.println(name + " is waiting");

			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		dishes.add(dish); //������ �߰����ش�.
		notify();
		System.out.println("Dishes : " + dishes.toString());
	}

	public synchronized void remove(String dishName) { // ���� ������ �Դ´�. ������ ������ ���ø� ���ش�. //customer����
		String name = Thread.currentThread().getName();
		
		while(dishes.size() == 0) { //ó���� ������ ���� ���� ����  remove���� , ������ ���� ����.
			System.out.println(name + " is waiting");
			
			try {
				wait();  //wait();�������� ����Ʈ �ɸ��� ������ �����س��� �丮 ���� �ð��� ����� �ִ°��̴�.
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while(true) {  //���ĸԴ� ����
			for(int i=0;i<dishes.size();i++) {
				if(dishName.equals(dishes.get(i))) {
					dishes.remove(i);  
					notify();
					return;  //���� �Դ°� ��������.
				}
			}
			
			try {
				System.out.println(name + " is waiting");
				wait();  //wait();�������� ����Ʈ �ɸ��� ������ �����س��� �丮 ���� �ð��� ����� �ִ°��̴�.
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public int dishName() { // ���� �迭�� ũ��(����� ����)�� ��ȯ�ϴ� ����
		return dishNames.length;
	}

}
