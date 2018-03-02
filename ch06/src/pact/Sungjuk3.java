
public class Sungjuk3 {
	public static void main(String[] args) {
		int rpt = 0;
		System.out.println("rpt = " + rpt);
		
		rpt++;//rpt = rpt +1
		
		++rpt;//rpt = rpt +1
		System.out.println("++rpt: " + rpt);
		
		rpt--; //rpt = rpt - 1
		System.out.println("rpt--: " +  rpt);
		/*--rpt;//rpt = rpt - 1
		System.out.println("rpt: " + --rpt);  --->1 이나옴
		System.out.println("rpt: " + rpt--);----> 0 이나옴*/
		
		int jumsu = ++rpt; //rpt 점수를 1 증가 시킨 후 jumsu 변수에 할당
		System.out.println("jumsu: " + jumsu);
		System.out.println("rpt : " + rpt);
		
		jumsu = rpt++;
		System.out.println("jumsu: " + jumsu);
		System.out.println("rpt : " + rpt);
	}
}


