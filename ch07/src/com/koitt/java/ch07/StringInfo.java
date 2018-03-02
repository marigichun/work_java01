package com.koitt.java.ch07;

public class StringInfo {
	public static void main(String[] args) {
		String snum = "20123458";
		
		//생성자 오버로딩
		String name = new String("김경석");
		String dept = new String(new char[] {'컴', '퓨', '터', '학', '과'});
		String java = new String("java");
		
		System.out.printf("%d ", snum.compareTo("20123458"));		//비교하니 다른게 없어서 0으로 출력
		System.out.printf("%d %n", snum.compareTo("20123456"));		// 전체 문자 비교로 마지막에 8과 6의 차이가 2가 난다는 뜻
		System.out.printf("%s ", name);
		System.out.printf("%s ", name.replace('김', '강'));			//변수에 변수에 대입을 해서 리턴해서 변수에 대입
		System.out.printf("%s %n", name);
		System.out.printf("%s ", dept);
		System.out.printf("%s ", dept.substring(0,  3));			//0컴 1퓨 2터 3학 4과 5(0~3까지 출력)
		System.out.printf("%d %n", dept.length());
		System.out.printf("%s ", java.indexOf('a'));
		System.out.printf("%s ", java.concat(" language"));
		System.out.printf("%s ", java.replace('j', 'J'));
		System.out.printf("%s ", java.toUpperCase());
		System.out.printf("%b ", java.equals("JAVA"));
		System.out.printf("%s ", java.equalsIgnoreCase("JAVA"));
		System.out.printf("%s %n", java.substring(1));
		
	}
}
