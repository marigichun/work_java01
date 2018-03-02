package com.koitt.java.class01;

public class Teacher extends Person{

	/*Animal과 Person의 필드값을 상속받기 때문에
	 * 중복으로 작성하지 않아도 된다.
	 */
	private String subject;		//담당과목
	private int year;			//강의 경력
	private String group;		//소속

	//기본 생성자 (Default Constructor)
	//코드 부여
	public Teacher(  ) {
		
	}
	//다형성(polymorphism)의 예
	//메소드 오더로딩(Method Overloading)-상속과 관계 없다.
	//생성자 : 필드 subject만 초기화하는 생성자
	public Teacher(String subject) {
		this.subject = subject;
	}
	
	//생성자  필드(subject,year) 만 초기화하는 생성자
	public Teacher(String subject , int year) {
		this.subject = subject;
		this.year = year;
	}
	//생성자:필드 전체를 초기화하는 생성자
	public Teacher(String subject , int year,String group) {
		this.subject = subject;
		this.year = year;
		this.group = group;
	}
	//메소드(method);
	public String getSubject() {
		//return sanghoon.subject;
		return this.subject;
	}
	public void setSubject(String subject) {
		//sanghoon.subject ="프로그래밍";
		this.subject = subject;
	}
	//메소드(method)
	public int getYear() {
		//return sanghoon.year;
		return this.year;
	}
	public void setYear(int year) {
		//sanghoon.year =1;
		this.year = year;
	}
	//메소드(method)
	public String getGroup() {
		//return sanghoon.group;
		return this.group;
	}
	public void setGroup(String group) {
		//sanghoon.group ="한국아이티인재개발학원";
		this.group = group;
	}
	/*
	 * 다형성
	 * 메소드 오버라이딩(Method Overriding) - 상속관계가 성립
	 * 메소드 재정의 
	 */
	@Override//(없어도 무방하다 구분을 주기위해 해주는것이 좋다  //오버라이딩을 했다는 표시를 위한 애노테이션(Annotation)
	public void print() {
		System.out.println("주민등록번호: " + this.getSsn() + ", " + 
					"주소: " +this.getAddress() + ", " +
					"과목: " +this.subject + ", " );
	}
	
}
