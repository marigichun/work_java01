package com.koitt.java.ch07;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String str = "public statinc void main(Sting[] args) {";
		StringTokenizer st1 = new StringTokenizer(str);					//기본 문리자 " \t\n\r\f" 48쪽 참조 
		printToken(st1);
		StringTokenizer st2 = new StringTokenizer(str, " ()"); 			//" ()" 새로운 분리자로 호출한다는 공백도 추가됨
		printToken(st2);
		StringTokenizer st3 = new StringTokenizer(str, " ()[]{"); 		//공백도 추가됨
		printToken(st3);
		//토큰을 분리자에 포함
		StringTokenizer st4 = new StringTokenizer(str, "()[]{", true) ; //분리자를 토큰처럼 출력하라는
		printToken(st4);
		StringTokenizer st5 = new StringTokenizer(str);					//기본 문리자 "\t\n\r\f"
		printToken(st5, "()");
	}

	private static void printToken(StringTokenizer st) {
		System.out.println("토큰 수; " + st.countTokens());
		int cnt = 0;
		while (st.hasMoreTokens()) {									//hasMoreTokens(순차적으로)하라는
			System.out.print(++cnt + ". " + st.nextToken() + " ");		//nextToken 토큰데로 출력하라는
		}
		System.out.println();
	}
	
	public static void printToken(StringTokenizer st, String delin) {
		int cnt = 0;
		while (st.hasMoreTokens()) {
			System.out.print(++cnt + ". " + st.nextToken(delin) + " ");
		}
		System.out.println();
	}
}
