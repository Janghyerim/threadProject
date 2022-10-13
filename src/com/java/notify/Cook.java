package com.java.notify;

public class Cook implements Runnable {

	private Table table; // 테이블 변수선언

	public Cook(Table table) {
		super();
		this.table = table;
	}

	@Override
	public void run() {
		while (true) {
			int idx = (int) (Math.random() * table.dishName()); // 0 ~ 2까지의 난수를 만든다.
			table.add(table.dishNames[idx]); // 요리사가 테이블에 요리를 만드는 작업
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
