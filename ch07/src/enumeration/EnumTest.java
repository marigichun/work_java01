package enumeration;								//가독성이 좋음 Enum

public class EnumTest {								//클래스 기반으로 만든 타입의 하나
	public enum P1 {c, cpp, java, csharp};
	public /*static*/ int[] a = {10,20 ,30}; //^^^ <-- c 언어와 같은 배열 방식
	//1회용이면 static보다 24~의 객체를 만들어 사용하는게 메모리 활용에 좋음
	public static void main(String[] args) {
		P1 clang = P1.c;							//정의한 열거 유형은 한나의 자료 유형으로 이용
		System.out.println(clang.toString());		//저장된 상수 문자열이 출력
		
		clang = P1.csharp;
		switch(clang) {
			case csharp:
			System.out.println(clang + ": C# 언어 ");
		}
		
		//for-each 문
		for (P1 p : P1.values()) {		//values() 배열이라고 생각하면 됨
			System.out.print(p + " ");
		}
		System.out.println();
		
		
		EnumTest t = new EnumTest();
		for (int item : t.a) {		
			System.out.println(item);
		}	
	}
}
