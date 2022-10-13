package com.java.notify;

public class CookTest {

	public static void main(String[] args) {
		Table table = new Table();

		new Thread(new Cook(table), "Cook1").start();
		new Thread(new Customer(table, "donut"), "Cus1").start();
		new Thread(new Customer(table, "burger"), "Cus2").start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.exit(0);
	}

}
