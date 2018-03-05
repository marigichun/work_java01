package array.app;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("배열의 크기 입력>>");
		int size = input.nextInt();
		
		//length 크기로  입력
		int score[] = new int[size];
		
		System.out.print("성적 입력>>");
		for(int i=0; i < score.length; i++) 
			score[i] = input.nextInt();
		
		/*
		 * for each문--> 조작안됨. 순차적으로 출력을 할 때 편함
		 * int value: 순차적으로 값을 최종적으로 출력되는 변수 값
		 */
		for (int value : score)
			System.out.print(value + " ");
		
	}
}
