package com.koitt.java.class01;
/*
 * Object 클래스
 * -자바에서 모드 클래스가 기본으로 상속받는 클래스
 * -이미 기본으로 구현되어 있는 클래스
 * -extends로 선언하지 않아도 기본으로 상속받는 클래스
 * 
 * 접근 제한자
 * -private:같은 클래스 내부에서만 사용가능
 * -(default):같은 패키지(폴더) 내부에서만 사용가능
 * -protected:default범위 + 상속받은 클래스까지 사용가능
 * -public: 어느 곳이든 사용 가능
 */
public class Animal {

	//필드(Field)
	private String name;
	private int age;
	private String gender;

	//메소드(method)
	public String getName() {
		//return sanghoon.name;
		return this.name;
	}
	public void setName(String name) {
		//sanghoon.name = "정상훈"
		this.name = name;
	}
	//메소드(method)
	public int getAge() {
		//return sanghoon.age;
		return this.age;
	}
	public void setAge(int age) {
		//sanghoon.age = 32;
		this.age = age;
	}
	//메소드(method)
	public String getGender() {
		//return sanghoon.gender;
		return this.gender;
	}
	public void setGender(String gender) {
		//sanghoon.gender = "남";
		this.gender = gender;
	}
}