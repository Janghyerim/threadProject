package com.java.notify;

public class Customer implements Runnable {

	private Table table; // 테이블 변수선언
	private String food; // 음식 선언

	public Customer(Table table, String food) { // 테이블 생성자
		super();
		this.table = table;
		this.food = food;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String name = Thread.currentThread().getName();
			table.remove(food);
			System.out.println(name + " ate " + food);
		}
	}

}
