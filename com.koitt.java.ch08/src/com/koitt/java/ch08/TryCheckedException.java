package com.koitt.java.ch08;

public class TryCheckedException {
	public static void main(String[] args) {
		//메소드Class.forName() 을 사용하려면 반드시 예외처를 해야함
		try {
		System.out.println(Class.forName("java.lang.Object"));	
		}
		catch(ClassNotFoundException ex) {
			System.out.println(ex);
		}
	}	
}
