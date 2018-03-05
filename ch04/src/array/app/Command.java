package array.app;

public class Command {		
	
	/*
	 * 클래스 우클릭 Run As/ Run Configurations에서 Arguments tab에서 입력 실행
	 */
									//args-->>배열값을 받아
	 public static void main(String[] args) {
		 System.out.println("명령행 인자 갯수 >>" + args.length);
		 
		 for(String value : args)
			 System.out.println(value + " ");// 배열값을 출력
	 }
}
