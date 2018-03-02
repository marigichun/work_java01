package com.koitt.java.ch08;

public class ExceptionType2 {
	public static void main(String[] args) {
		String str[] = {"안녕하세요!", "Hello!"};
		
		System.out.println(str[0]);
		System.out.println(str[2]);	//예외발생--> 유효한 첨자 범위를 벗어나 첨자 값 2 생성
		System.out.println(str[1]);
	}
}
