package com.java.thread;

import javax.swing.JOptionPane;

public class ThreadTest {

	public static void main(String[] args) {
		//���α׷� -> ���μ��� -> ������(��Ƽ������) : �����ϸ� ��Ƽ �½�ŷ
		//��� ���α׷��� �⺻������ �����尡 �����Ѵ�.(�ּ� 1�� �̻��� �����尡 �ִ�.)
		//������ ����� ���
		//1.ThreadŬ������ ���
		//2.Runnable�������̽��� ���
		
		/**�� ������ ���*/
//		for(int i=0;i<10;i++) {
//			System.out.println(i);
//		}
//		for(int j=0;j<10;j++) {
//			System.out.println(j);  //i->j���������� ���
//		}
		
		/**��Ƽ������ ���*/
//		//Count ������Ŭ������ ��ӹ��� ���
//		Count cnt = new Count();
//		cnt.start();
//		
//		//Runnable �������̽��� ��ӹ������
//		Runnable r = new Count2();
//		Thread cnt2 = new Thread(r);
//		cnt2.start();
//		
//		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է�");
//		System.out.println("�Է°��� : " + input + "�Դϴ�.");
		
//		//������� ��ŸƮ�� �������� �ҿ���� ���յȴ�. ��� ���� ������ �� ����.
//		Threadex5 th = new Threadex5(); //�������> Threadex5 Ŭ������ �����Ͽ� ȣ���ϰ� ���
//		th.start();
//		
//		for(int i=0;i<500;i++) {  //������� ���
//			System.out.print("-");
//		}  
		
		//Runnable sleep() �׽�Ʈ
		Runnable r = new Threadex6();
		Thread th1 = new Thread(r,"*");
		Thread th2 = new Thread(r,"**");
		Thread th3 = new Thread(r,"***");
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);  //���� �ڽ��� ȣ���� �����带  sleep�Ѵ�.(�Ͻ�����)
			th1.suspend();       //������ �Ͻ�����
			Thread.sleep(2000); 
			th2.suspend();
			Thread.sleep(3000); 
			th1.resume();        //������ ���������
			Thread.sleep(3000);
			th2.resume();
			Thread.sleep(3000);
			th1.stop();
			th2.stop();          //���� ���� �������� ����� �� ����.
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		

		
	}

}
