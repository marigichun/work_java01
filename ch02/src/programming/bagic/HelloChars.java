package programming.bagic;

public class HelloChars {
	
	public static void main(String[] args) {
	
		System.out.println('a');			//char형
		System.out.println('\\');			// \키를 출력하는 명령어
		System.out.println('\142');			//8진수 142의 ASCII 코드값(10진수 98의 ASCII코드값)
		System.out.println('\uAC00');		//Unicode 값 AC00 : 가
		System.out.println('\uAC01');		//Unicode 값 AC00 : 각
		System.out.println('강');	
		
		System.out.print("Hello\nWorld\thi\b\rABC\r\n");
		System.out.println("\'");
		

	}
}
