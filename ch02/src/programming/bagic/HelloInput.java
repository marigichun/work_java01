package programming.bagic;

public class HelloInput {
	
		public static void main(String[] args) {
			//System.in은 키보드 입력스트림
			java.util.Scanner input=new java.util.Scanner(System.in);
			System.out.println("이름과 학번을 입력하세요.");
			
			
			//입력받은 문자열을 토큰(띄어스기)으로 구분지어서 문자열 일부를 리턴
			String name = input.next();
			int num = input.nextInt();//다은 토큰은 숫자로 입력받는다는 뜻
			System.out.print("이름: " + name + ", 학번: " + num);
		
			
		
		}

}
