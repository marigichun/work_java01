package com.koitt.java.ch07;

public class WrapperCharacter {
	public static void main(String[] args) {
		//Character ch = new Character('@');
		Character ch ='@';						//boxing
		Character ch2 = '@';
		
		System.out.print(ch + " ");					//unboxing-->자동으로 호출해주는것을
		System.out.print(ch.charValue() + " ");		//character로 메소드 호출
		System.out.println(ch.toString());			//'@'을 String type으로 호출
		System.out.print(ch.compareTo('@') + " ");	//다르면 0으로 리턴-->overiding 기법으로 
		System.out.println(ch.hashCode());			//@의 가짜 주소값
		System.out.println(ch2.hashCode());
		System.out.println();
		
		//정적 메소드
		System.out.print(Character.toUpperCase('d') + " ");	//대문자로 바꾸어 주는것
		System.out.println(Character.toLowerCase('F'));		//소문자로 바꾸어 주는것
		System.out.print(Character.getName('@') + ", ");
		System.out.print(Character.getName('|') + ", ");
		System.out.println(Character.getName('^') + " ");
		System.out.print(Character.isDigit('$')+ " ");		//숫자인지 아닌지 비교하는 것 
		System.out.println(Character.isDigit('5'));			//숫자인지 아닌지 비교하는 것

	}
}
