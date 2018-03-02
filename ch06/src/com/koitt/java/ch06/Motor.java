package com.koitt.java.ch06;
//public을 사용해서 캡슐화에 위배 (객체 지향적이지 못하기 때문 148p~153p참조)
public class Motor extends Vehicle{
	public String name = "자동차";	//이름 Vehicle의 name이  하위클래스의 name으로 상속때는 사용안함 다시 덮어쓴것
	public int displacement;		//배기량
	
	public void printInfo( ) {
		System.out.print("name: " + this.name);	// 의 name은  Motor의 name으로 Vehicle의 name과 다르다.
		System.out.println(", 최대속도: " + this.maxSpeed + " km");//maxSpeed는 클래스명 extends Vehicle의 maxSpeed이다.
		System.out.print("정원: "+ this.seater + " 명");
		System.out.println(", 배기량: " + displacement + " cc");
	}
	
	public static void main(String[] agrs) {
		Motor myCar = new Motor();	//객체생성
		myCar.maxSpeed = 160;
		myCar.seater = 5;
		myCar.displacement = 1500;
		myCar.printInfo();
	}
}
