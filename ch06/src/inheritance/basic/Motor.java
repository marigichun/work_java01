package inheritance.basic;

import com.koitt.java.ch06.Vehicle;
/*
 * java는 c 언어와 다르게 상속을 하나의 클래스만 받을 수 있다.
 */
public class Motor extends Vehicle {
	public String name = "자동차";	//이름		
	private int displacement;		//배기량
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void setSeater(int seater) {
		this.seater = seater;
	}
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	
	public void printInfo( ) {
		System.out.print(super.name + ": " + this.name);
		System.out.println(", 최대속도: " + maxSpeed + " km");
		System.out.print("정원: "+ seater + " 명");
		System.out.println(", 배기량: " + displacement + " cc");
	}
	
	public static void main(String[] agrs) {
		Motor myCar = new Motor();
		myCar.setMaxSpeed(300);
		myCar.setSeater(2);
		myCar.setDisplacement(3500);
		myCar.printInfo();
	}
}
