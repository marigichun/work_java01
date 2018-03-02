package com.koitt.java.ch07;

/*
 * 관레
 * T: type
 * E: element
 */
public class GenericTest<T> {
	public boolean myEqual(T a, T b) {
		return a.equals(b);
	}
	
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hi";
		Integer c = 1;
		Integer d = 2;
		
		//String 타입을 이용하는 myEquals 메소드를 호출할 수 있게 된다.
		GenericTest<Object> test = new GenericTest<Object>();
		boolean isEquals = test.myEqual(a,b);
		System.out.println(isEquals);
		
		boolean isEqual2 = test.myEqual(a, b);
		System.out.println(isEqual2);
		
		GenericTest<Object> test1 = new GenericTest<Object>();
		boolean isEquals3 = test.myEqual(c,d);
		System.out.println(isEquals3);
		
		boolean isEqual4 = test1.myEqual(c, d);
		System.out.println(isEqual4);
		
	}
}
