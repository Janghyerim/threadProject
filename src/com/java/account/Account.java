package com.java.account;


import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Account { //은행에서 돈빼는 프로그램
	private int balance = 1000;
	        //잠근다. -> -가 안나오고 0으로 떨어짐.
	public /*synchronized*/ void withdraw(int money) { //동기화 : 순서를 지켜서 사용하게 한다.
		synchronized(this) { //완전하게 락을 거는방법이고 좀 더 넓은 범위로 사용 가능함.
		if(balance >= money) {
			try {                          
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			balance -= money;
		 }
	} 
	} //풀어준다.
}
