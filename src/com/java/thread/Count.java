package com.java.thread;

public class Count extends Thread{ //������ Ŭ������ ���

	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();  //���� ���α׷� �ۼ��� �ϰ� �׽�Ʈ������ ���ุ �ϸ�ȴ�. ���� �ڽŸ��� ������ �����带 �����Ե�.
			}
		}
		
		
	} 
	

}
