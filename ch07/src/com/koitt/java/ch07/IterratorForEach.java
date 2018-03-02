package com.koitt.java.ch07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterratorForEach {
	
	public static void main(String[] args) {
		List<Integer> array = new ArrayList<Integer>();
		
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
		
		//for - each은 Iterrator로 구현되어있음
		for (int item : array) {
			System.out.println(item);
		}
		
		//for-each문의 원리: iterator		// 자체가 객체 , iterator가 i에 들어간 변수값	
		for (Iterator<Integer> i = array.iterator(); i.hasNext();)	{
			Integer item = i.next();   //^i.next()로 해도 됨. ^다음것은 
			System.out.println(item);
		}
	}	
}
