package array.basic;

public class arrayInit2 {
	public static void main(String[] args) {
		int[] score;
		// score = {2, 4, 7}; //오류발생
		
		/*
		 * score[0] = 2;
		 * score[1] = 4;
		 * score[2] = 7;
		 */
		score = new int[] {2, 4, 7};
		System.out.printf("%d %d %d %n", score[0], score[1], score[2]);
				
		score = new int[] {23, 46, 78};
		System.out.printf("%d %d %d %n", score[0], score[1], score[2]);		
	}
}
