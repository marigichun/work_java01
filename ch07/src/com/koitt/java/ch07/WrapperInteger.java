package com.koitt.java.ch07;

public class WrapperInteger {
	public static void main(String[] args) {
		Integer age = new Integer(20);
		Integer snum = new Integer("20121105");
		
		System.out.println("나이:" + age.intValue());		//int형 숫자를 리턴해주는 것
		System.out.println("학번: " + snum.intValue());
		System.out.println(age.equals(snum));			//age는 필드 변수
		
		System.out.println(Integer.parseInt("24567", 10));	//10진수로 	
		System.out.println(Integer.parseInt("ff" , 16));	//16진수를 10진수로
		System.out.println(Integer.toBinaryString(255));	//정수를 이진수 문자열로
		System.out.println(Integer.toString(255, 16));		//16진수를  10진수로
	}
}


