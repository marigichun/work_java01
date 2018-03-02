package obj.basic;

public class Const {
	public static void main(String[] agrs) {
		//상수는 반드시 초기 값이 저장되어야 하며, 더 이상 수정될 수 없다.
		final int maxSize = 5; //final 사용시 선언과 초기화를 동시에 해야한다.
		//maxSize = 8; //오류 발생 final로 선언했기에
		int data[] = new int[maxSize];
		System.out.println("배열 크기: " + data.length);
		System.out.println("배열 크기: " + maxSize);
	}

}
