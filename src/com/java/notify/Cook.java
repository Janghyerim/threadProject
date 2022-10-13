package com.java.notify;

public class Cook implements Runnable {

	private Table table; // ���̺� ��������

	public Cook(Table table) {
		super();
		this.table = table;
	}

	@Override
	public void run() {
		while (true) {
			int idx = (int) (Math.random() * table.dishName()); // 0 ~ 2������ ������ �����.
			table.add(table.dishNames[idx]); // �丮�簡 ���̺� �丮�� ����� �۾�
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
