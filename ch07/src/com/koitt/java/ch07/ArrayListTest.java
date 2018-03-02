package com.koitt.java.ch07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List <Object> list = new ArrayList<>();
		

		list.add(0.87);			
		list.add("algol");
		list.add("pascal");			
		list.add(null);
		list.add(1);		
		list.add("java");
		list.add(3.4);		
		list.add(5.8);
		
		Iterator<Object> it = list.iterator();
		
		print(it);
		
		
		//배열로 반환하여 모드 원소 출력 가능(for -each)
		for (Object e : list.toArray()) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			Object e = list.get(i);
			System.out.print(e + " ");
		}
		System.out.println();
	}

	public static void print(Iterator<Object> it) {
		while (it.hasNext() ) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}
}
