package com.koitt.java.ch07;

public class BoxingUnboxing {
	public static void main(String[] args) {
		//Double radius = new Double(2.59); //JDK 1.5 버전
		double radius =2.59;				//boxing(포장한다는 뜻)
		//double r = radius.doubleValue(); 	//JDK 1.5 버전
		double r = radius;					//unboxing(포장을 푼다는 뜻)
		System.out.print("반지름: " + r + ", 원 면적: ");
		System.out.println(radius*radius*Math.PI);
		
		Integer x = 5, y = 3;								//boxing
		System.out.printf("%d + %d = %d %n", x, y, x+y);	//unboxing
		Boolean b = true;									//boxing
		System.out.printf("%d %n", b);						//unboxing
	}
}
