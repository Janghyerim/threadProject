package com.java.thread;

public class Threadex6 implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());  //���� ���ư��� �������� �̸��� ���
			try {                   //try-catch ���� �ʼ���.
				Thread.sleep(1000); //���۽�Ű���ʰ� �����ð����� ���� ���� Ű����
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
