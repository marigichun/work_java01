package programming.bagic;

import java.util.Scanner;

     //ctrl + shift +o :자동으로  inport 추가
     //Scanner 대신 *을 써도 되지만 전부를 사용해야하기 때문에 지정해주는것이 좋다
public class HelloOutput {
		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("십진수와 이진수를 각각 입력하세요.");
			int num1 = input.nextInt();
			int num2 = input.nextInt(2);
			System.out.println("num1 = " + num1 + ", num2 = " + num2);
			System.out.printf("num1 = %d, num2 = %d", num1, num2);
			
		}

}
