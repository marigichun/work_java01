package array.app;

import java.util.Scanner;

public class newT02 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("최대  별 개수를 입력하세요 >>");
		int num = input.nextInt();
		//배열 선언 및 초기화
		char str[][] =  new char [num][];
		//래기드 배열 만들기
		for(int i= 0; i < str.length; i++)
			str[i] = new char[i + 1];
		//별을 배열에 저장
		for(int i = 0; i < str.length; i++) {
			for( int j = 0; j < str[i].length; j++) {
				str[i][j] = '*';
			}	
		}
		// 배열에 있는 별을 끄집어 내어 출력
		for(int i = 0; i < str.length; i++) {
			for( int j = 0; j < str[i].length; j++) {
				System.out.print(str[i][j]);

			}
			System.out.println();
		}
		
	}	
}
