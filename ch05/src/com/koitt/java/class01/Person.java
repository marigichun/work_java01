package com.koitt.java.class01;

public class Person extends Animal {

	/*부모인 Animal의 필드를 상속받기 때문에
	 * 중복으로  작성하지 않아도 된다.
	 */
	 private String ssn; 		//주민등록 번호
	 private String address;	//주소

	
	//메소드(method)
	public String getSsn() {
		//return sanghoon.ssn;
		return this.ssn;
	}
	public void setSsn(String ssn) {
		//sanghoon.ssn = 861201
		this.ssn = ssn;
	}
	//메소드(method)
	public String getAddress() {
		//return sanghoon.address;
		return this.address;
	}
	public void setAddress(String address) {
		//sanghoon.address = "상도동"
		this.address = address;
	}
	//메소드 - Person의 내용을 출력
	public void print() {
		System.out.println("주민등록번호: " + this.ssn + ", 주소" + this.address); 
	}
}
