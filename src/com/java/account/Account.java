package com.java.account;


import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Account { //���࿡�� ������ ���α׷�
	private int balance = 1000;
	        //��ٴ�. -> -�� �ȳ����� 0���� ������.
	public /*synchronized*/ void withdraw(int money) { //����ȭ : ������ ���Ѽ� ����ϰ� �Ѵ�.
		synchronized(this) { //�����ϰ� ���� �Ŵ¹���̰� �� �� ���� ������ ��� ������.
		if(balance >= money) {
			try {                          
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			balance -= money;
		 }
	} 
	} //Ǯ���ش�.
}
