package com.koitt.java.ch06;

import java.util.Date;

import inheritance.access.Account;

public class TestAccess extends Account {
	 
	private String text;
	
	public TestAccess(String name, int number) {
		super(name, number);
		Date a = this.getOpen();
	}
	public static void main(String[] args) {
		Account account = new Account();//public범위만
		String name = account.name;
		//account.open;
		/*Date a1 = account.open; 
		접근 불가능(상속받지 않은 클래스를 이용해서 객체를 생성했기 때문에)*/
		TestAccess t = new TestAccess("홍길동",1000);
		/*
		 * 접근 가능(부모의 생성자가 public은 어디서든 접근이 가능)
		 */
		String a = t.name;
		
		/*
		 * 접근 가능 (부모의 생성자가 protected 상속받은 클래스,패키지를 이용해서 객체를 생성했기 때문에)
		 */
		Date b = t.getOpen();
		
		/*
		 * 접근 불가능 (같은 패키지가 아니므로)
		 */
		//int c = t.number;
		
		//접근 불가능 (클래스 내부에만 사용가능하므로)
		//long d = t.balance; - 부모가 private 이므로.
	}
}





