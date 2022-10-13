package com.java.account;

public class AccountHolderTest {

	public static void main(String[] args) {
		Runnable r = new AccountHolder();
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);
		
		th1.start();
		th2.start();

	}

}
