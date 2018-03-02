package com.koitt.java.class04;

import obj.constructor.Car;

public class Owner {
	private String name;
	private Car[] car;



	public Owner(String name, Car[] gene) {
		this.name = name;
		this.car = gene;
	}



	public void setCar1(Car[] mini) {
		this.car = mini;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car[] getCar() {
		return car;
	}

	public void setCar(Car[] car1) {
		this.car = car1;
	}

	public void introCar() {
		System.out.print(this.name + "의 자동차의 브랜드 이름은");
		for (int i = 0; i < car.length; i++) {
			System.out.print(car[i].getBrandName() + " 이고, 최고속도는 ");
			System.out.println(car[i].getMaxSpeed() + "km/h 입니다.");

		}
	}
}









