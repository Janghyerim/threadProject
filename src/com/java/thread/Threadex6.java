package com.java.thread;

public class Threadex6 implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());  //현재 돌아가는 스레드의 이름을 출력
			try {                   //try-catch 구문 필수임.
				Thread.sleep(1000); //동작시키지않고 일정시간동안 멈춰 놓는 키워드
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
