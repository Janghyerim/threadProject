package com.java.thread;

public class Count extends Thread{ //스레드 클래스를 상속

	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();  //실제 프로그램 작성을 하고 테스트문에서 실행만 하면된다. 각각 자신만의 고유한 스레드를 가지게됨.
			}
		}
		
		
	} 
	

}
