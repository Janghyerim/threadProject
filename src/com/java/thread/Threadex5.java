package com.java.thread;

public class Threadex5 extends Thread {

	@Override
	public void run() {
		for(int i=0;i<500;i++) {
			System.out.print("|");
		}
		
	}

}
