package array.app;
//구구단 1:오른쪽으로 같은 단 출력
public class newT01 {
	public static void main(String[] args) {
		//2단부터 9단까지 반복
		for ( int i = 2; i <= 9; i++) {
			//곱하는 숫자 1~9까지 반복
			for( int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d ", i,j, i*j);
			//System.out.print(i + " * " + j + " = " + (i * j) +"\t"););
			}
			System.out.println(); 
		}
		
	}

}
