package com.koitt.java.class01;

public class TestDrive {

	public static void main(String[] args) {
		//강사 sanghoon 생성-Teacher클래스의 객체(Object-sanghoon)를 생성
		Teacher sanghoon = new Teacher();//기본 생성자를 호출 생성자() 생성하고 호출한것임
		
		/*기본 생성자
		 * 만약  구현된 생성자가 없다면
		 * 컴파일러가 기본 생성자를 자동으로 생성한다.
		 */
		//다른 Teacher라도 생성하면 다양하게 생성
		Teacher changmok = new Teacher("수학");
		Teacher gildong = new Teacher("국어",3);
		Teacher younghee = new Teacher("영어",10,"영희선생 어학원");
		
	
		//강사 sanghoon의 정보 입력
		sanghoon.setAddress ("상도동");
		sanghoon.setAge(32); 
		sanghoon.setGender("남");
		sanghoon.setGroup("한국아이티인재개발학원");
		sanghoon.setName("정상훈");
		sanghoon.setSsn("861201");
		sanghoon.setSubject("프로그래밍");
		sanghoon.setYear(1);
		
		//Person의 print()메소드 호출
		sanghoon.print();			//person의 print() 메소드 호출
		sanghoon.print();	//Tercher의 pdintTeacher()메소드 호출

		//학생  taehyun 생성-Student클래스의 객체(Object-taehyun)를 생성
		Student taehyun = new Student();	

		//학생 taehyun의 정보 입력
		taehyun.setAddress("서울");
		taehyun.setAge(42);
		taehyun.setGender("여");
		taehyun.setGrade(4);
		taehyun.setMajor("연기과");
		taehyun.setName("차태현");
		taehyun.setSsn("760325");
		taehyun.setStudentID(10);

		//강사 객체의 정보를 출력
		System.out.println("=== 강사 sanghoon 객체 정보 ===");
		System.out.println(sanghoon.getAddress());
		System.out.println(sanghoon.getGroup());
		System.out.println(sanghoon.getName());

		//학생 객체의 정보를 출력
		System.out.println("=== 학생 taehyun 객체 정보 ===");
		System.out.println(taehyun.getGrade());
		System.out.println(taehyun.getMajor());
		System.out.println(taehyun.getName());
		System.out.println(taehyun.getAge());

		//강사 sanghoo의 이름을 변경
		sanghoon.setName("홍길동");

		taehyun.setAge(29);

		//강사 Sanghoon객체의 정보를 출력
		System.out.println("=== 강사 sanghoon 객체 정보 ===");
		System.out.println(sanghoon.getAddress());
		System.out.println(sanghoon.getGroup());
		System.out.println(sanghoon.getName());

		//학생 Taehyun객체의 정보를 출력
		System.out.println("=== 강사 taehyun 객체 정보 ===");
		System.out.println(taehyun.getGrade());
		System.out.println(taehyun.getMajor());
		System.out.println(taehyun.getName());
		System.out.println(taehyun.getAge());
		
		//default 접근 제한자로 변경 시 발생하는 문제, 조작 및 보호가 되지 않음 자바의 객체지향의 위배
		//sanghoon.ssn = "881201";
		//System.out.println("주민등록번호 날조: " + sanghoon.ssn);
		
		//외부에서 날조를 예방하는 방법
		sanghoon.setSsn("801201");
		System.out.println("주민등록번호 날조: " + sanghoon.getSsn());
	}

}
