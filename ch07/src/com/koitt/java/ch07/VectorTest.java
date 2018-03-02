package com.koitt.java.ch07;

import java.util.List;
import java.util.Vector;

public class VectorTest {
	
	    //제니릭(Generic):<>안의 코드를 유연하게 사용하기 위한
		public static void main(String[] args) {
		//제니릭(Generic):Object를 사용하면 복잡해지는 경우가 있다.
		List<Object> data = new Vector<Object>(3);
		//Vector data = new Vector(3); 					//경고 발생
		((Vector<Object>)data).addElement(2012);		//addElement은 Vector에만 있는 메소드라  다운 캐스팅하는것
		data.add("년도");								//java 권장 스타일
		((Vector<Object>)data).addElement(4.35);			
		data.add(2, "목표 학점");
		((Vector<Object>)data).insertElementAt("자바강좌", 0);	//insertElementAt 자리에 위치한 값을 반환하라는
		System.out.println("size = " + data.size());
		System.out.println("capacity = " + ((Vector<Object>)data).capacity());
		System.out.println(data.toString());
	}
}
