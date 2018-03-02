package com.koitt.java.ch07;

public class ObjectMath {
	public static void main(String[] args) {
		
		Object obj = new Object();
		System.out.println(obj.getClass());	//클래스의 전체 이름
		System.out.println(obj.hashCode());	//가짜 주소값
		System.out.println(obj.toString());	//직접 가서 살펴보기
		System.out.println(obj.getClass().getName());
		
		//Math m = new Math(); 					//오류 발생, 생성자가 안 보임으로 뜸(접근이 안됨) 접근 제한자가 다르다
		System.out.println(Math.PI);			//객체를 못 만듬 바로 접근해서 만든것
		System.out.println(Math.round(-3.5));	//반올림
		System.out.println(Math.abs(-3.4));		//절대값
		System.out.println(Math.pow(3, 4));		//3의 네제곱
		

	}
}

