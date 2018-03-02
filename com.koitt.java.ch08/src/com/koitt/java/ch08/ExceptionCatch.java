package com.koitt.java.ch08;

public class ExceptionCatch {
	public static void main(String[] args) {
		int data = 0;
		
		//catch 여러 개 구성
		try {
			data = Integer.parseInt("1123.45");	//예외 발생
		}
		//발생한 예외인 NumberFormatException의 상위 클래스이므로 이 블록이 실행함
		catch (ClassCastException e) {
			//
			System.out.println("예외 발생 1: " + e);
			System.out.println("e.getMessage(): " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("예외 발생 2: " + e);
			//예외에서 주로 이요하는 메소드 getMessage()와 printStatckTrace()	
			System.out.println("e.getMessage(): " + e.getMessage());
			System.out.println("e.printStackTrace(): ");
			e.printStackTrace();
			}
		System.out.printf("data = %d %n", data);
	}
}
