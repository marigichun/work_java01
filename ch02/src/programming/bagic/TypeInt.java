package programming.bagic;

public class TypeInt {
	
	
	public static void main(String[] args) {
		byte b = 10;
		short s = 100;
		int i = 50;
		long l = 1000L;//1000000000000 int의 범위를 벗어나기 때문
		
		System.out.printf("%d %d %d %d", b, s, i, l);
		//                ("%a %b % %d", a, b, c, d);
	}

}
