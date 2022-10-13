package com.java.thread;

import javax.swing.JOptionPane;

public class ThreadTest {

	public static void main(String[] args) {
		//프로그램 -> 프로세스 -> 스레드(멀티스레드) : 동작하면 멀티 태스킹
		//모든 프로그램은 기본적으로 스레드가 동작한다.(최소 1개 이상의 스레드가 있다.)
		//스레드 만드는 방법
		//1.Thread클래스를 상속
		//2.Runnable인터페이스를 상속
		
		/**원 스레드 방식*/
//		for(int i=0;i<10;i++) {
//			System.out.println(i);
//		}
//		for(int j=0;j<10;j++) {
//			System.out.println(j);  //i->j순차적으로 출력
//		}
		
		/**멀티스레드 방식*/
//		//Count 스레드클래스를 상속받은 경우
//		Count cnt = new Count();
//		cnt.start();
//		
//		//Runnable 인터페이스를 상속받은경우
//		Runnable r = new Count2();
//		Thread cnt2 = new Thread(r);
//		cnt2.start();
//		
//		String input = JOptionPane.showInputDialog("아무값이나 입력");
//		System.out.println("입력값은 : " + input + "입니다.");
		
//		//스레드는 스타트가 누구인지 소용없고 병합된다. 결과 값을 예측할 수 없다.
//		Threadex5 th = new Threadex5(); //세로찍기> Threadex5 클래스를 생성하여 호출하고 출력
//		th.start();
//		
//		for(int i=0;i<500;i++) {  //가로찍기 출력
//			System.out.print("-");
//		}  
		
		//Runnable sleep() 테스트
		Runnable r = new Threadex6();
		Thread th1 = new Thread(r,"*");
		Thread th2 = new Thread(r,"**");
		Thread th3 = new Thread(r,"***");
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);  //현재 자신을 호출한 스레드를  sleep한다.(일시정지)
			th1.suspend();       //스레드 일시정지
			Thread.sleep(2000); 
			th2.suspend();
			Thread.sleep(3000); 
			th1.resume();        //스레드 실행대기상태
			Thread.sleep(3000);
			th2.resume();
			Thread.sleep(3000);
			th1.stop();
			th2.stop();          //누가 먼저 빠지는지 장담할 수 없다.
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		

		
	}

}
