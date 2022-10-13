package com.java.notify;

import java.util.ArrayList;

public class Table {
	String[] dishNames = { "donut", "donut", "burger" }; // 음식의 종류
	final int MAX_FOOD = 6; // 음식의 갯수

	private ArrayList<String> dishes = new ArrayList<String>(); // 접시 음식배열 맥스 6개 들어간다.

	public synchronized void add(String dish) { // 접시에 음식을 추가하는 것. //cook역할
		
		while (dishes.size() >= MAX_FOOD) { //접시에 6개 이상 있다면 작동 안함. 해당 와일 문은 접시에 음식이 먹고 사라질때 
			String name = Thread.currentThread().getName();
			System.out.println(name + " is waiting");

			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		dishes.add(dish); //음식을 추가해준다.
		notify();
		System.out.println("Dishes : " + dishes.toString());
	}

	public synchronized void remove(String dishName) { // 고객이 음식을 먹는다. 음식을 먹으면 접시를 빼준다. //customer역할
		String name = Thread.currentThread().getName();
		
		while(dishes.size() == 0) { //처음에 음식이 없을 때만 동작  remove선언 , 있으면 동작 안함.
			System.out.println(name + " is waiting");
			
			try {
				wait();  //wait();만있으면 웨이트 걸리니 슬립을 설정해놔야 요리 만들 시간을 충분히 주는것이다.
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while(true) {  //음식먹는 구문
			for(int i=0;i<dishes.size();i++) {
				if(dishName.equals(dishes.get(i))) {
					dishes.remove(i);  
					notify();
					return;  //음식 먹는것 강제종료.
				}
			}
			
			try {
				System.out.println(name + " is waiting");
				wait();  //wait();만있으면 웨이트 걸리니 슬립을 설정해놔야 요리 만들 시간을 충분히 주는것이다.
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public int dishName() { // 현재 배열의 크기(재료의 갯수)를 반환하는 역할
		return dishNames.length;
	}

}
