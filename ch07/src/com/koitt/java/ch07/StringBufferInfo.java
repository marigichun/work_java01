package com.koitt.java.ch07;

public class StringBufferInfo {
	public static void main(String[] args) {
		StringBuffer pg = new StringBuffer("Java");				//용량 16
		
		System.out.println(pg.capacity());						//
		System.out.println(pg.append(" language"));				//
		System.out.println(pg.insert(5,  "prigramming "));		//5(index 번호)번째칸에 Programming을 넣는다.
		System.out.println(pg.capacity());						//기존 문자입력 칸수에 크기를 계산해서 기존 칸수의 2배 설정을 크기에 따라 증가
		System.out.println(pg);									//
		System.out.println(pg.replace(0, 4, "objective-C"));	//기존 문자의 위치열에 대체하라는(replace)
		System.out.println(pg.substring(0, 9));					//0~9까지 문자을 대입해서 (substring)
		System.out.println(pg);									//
		System.out.println(pg.charAt(10));						//10번째의 칸에 있는 문자을 출력하라는
		pg.setCharAt(10,  'D');									//10번째 칸의 문자를 D로 바꿔서 출력하라는
		System.out.println(pg);									//
	}
}
