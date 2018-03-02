package com.koitt.java.class02;
//child 클래스는  Parent클래스를 상속받는다
public class child extends Parent {
	
	//Child클래스 생성자
	public child() {
		super(); //부모의 기본 생성자 호출:작성을 안하면 컴파이러가 자동으로 추가한다.
		System.out.println("child 기본생성자 호출 ....");
	}
	
	public child(String msg) {
		super(); //부모의 기본 생성자 호출:작성을 안하면 컴파이러가 자동으로 추가한다.
		System.out.println("child(String msg) 생성자 호출 .../" + msg);
	}
	
	public child(int num) {
		this("화이팅!");
		System.out.println("child(int num) 생성자 호출.../" + num);
	}
}
