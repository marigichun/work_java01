package array.basic;

public class MultiDimArrayInit {
	public static void main(String[] args) {
		//래기드 이차원 배열의 생성		[2]행의 수 [] 미정?
		int ragAry1[][] = new int[2][];
		
		ragAry1[0] = new int[2];
		ragAry1[1] = new int[3];
		
		ragAry1[0][0] =  4; ragAry1[0][1] = 2;
		ragAry1[1][0] =  7; ragAry1[1][1] = 3;ragAry1[1][2] =  6; 
		
		// 8,9번줄을 출력, 행의 수와 열를 출력
		System.out.print(ragAry1.length + ", ");
		System.out.print(ragAry1[0].length + " ");
		System.out.println(ragAry1[1].length + " ");
		
		//레기드 이차원 배열의 초기화, {}->자바에서 C언어 사용자를 위한 (C언어 표기법)코드
		int ragAry2[][] = {{2,3}, {3,6,9}, {4,5,7,8}};
		
		System.out.print(ragAry2.length + ", ");
		System.out.print(ragAry2[0].length + " ");
		System.out.print(ragAry2[1].length + " ");
		System.out.println(ragAry2[2].length + " ");
		
		// i 행의 수대로 중가하는 값 출력과 j 열의 수대로 증가하는 값 출력
		for(int i=0; i < ragAry2.length; i++) {
			for(int j=0; j < ragAry2[i].length; j++)
				System.out.print(ragAry2[i][j] + " ");
			System.out.println();
		}
	}
}
