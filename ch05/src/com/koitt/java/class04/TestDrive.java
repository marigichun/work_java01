package com.koitt.java.class04;

import obj.constructor.Car;

public class TestDrive {


	private static Car[] car1;

	public static void main(String[] args) {

		// 1. 차를 만든다.
		Car gene = new Car("현대 제네시스", 220);
		// 2. 차를 담을 배열을 만든다.
		Car[] car2 = new Car[1];
		// 3. 만든 배열에 차량을 집어 넣는다.
		car2[0] = gene;
		// 4. Owner 생성자를 통해서 만든 배열을 김지수에게 집어 넣는다.
		Owner jisoo = new Owner("김지수", car2);
		//5.차량소개
		jisoo.introCar();


		Car mini = new Car("미니 쿠퍼", 220);
		Car[] car3 = new Car[1];
		car3[0] = mini;
		Owner sooji = new Owner("김수지", car3);
		sooji.introCar();
		/*
		//1. 차량 한대 생성
		Car mini11 = new Car("mini 쿠페", 220);
		//2. 차주의 차량을 교체
		Car[] car4 = new Car[1];
		sooji.setCar(car1);
		//3.교체한  차량을 소개
		sooji.introCar();*/


		/*
		//4.차량 3대를 생성하세요.
		Car[] car1 = new Car[3];
		car1[0] = new Car("기아 스팅어", 190);
		car1[1] = new Car("현대 Genesis", 220);
		car1[2] = new Car("Gm 말리부", 180);
		//5.생성한 차량3대를 김지수 차량으로 변경하세요.
		jisoo.setCar(car1);
		//6.변경한 차량을 소개하세요.
		jisoo.introCar();*/

		
		//4.차량 3대를 생성하세요.
		Car[] car1 = new Car[3];
		car1[0] = new Car("그랜져", 200);
		car1[1] = new Car("스타렉스", 180);
		car1[2] = new Car("티뷰론", 220);
		//5.생성한 차량3대를 김지수 차량으로 변경하세요.
		jisoo.setCar(car1);
		//6.변경한 차량을 소개하세요.
		jisoo.introCar();
	}
}