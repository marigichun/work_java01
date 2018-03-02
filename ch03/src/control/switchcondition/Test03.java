package control.switchcondition;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n= 5;
		switch (n % 3 ) {
			case 0:
				System.out.printf("3의 배수입니다.\n");
				break;
			case 1: case 2:
				System.out.printf("3의 배수가 아닙니다.\n");"
				break;
		
		
		}
	}
}
