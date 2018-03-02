package control.switchcondition;

public class Test04 {
	public static void main(String[] args) {
		int x = 20;
		switch (x) {
		case  x > 0 :
			System.out.printf("양수\n");
			break;
		case  x < 0:
			System.out.printf("음수\n");
		}
	}

}
