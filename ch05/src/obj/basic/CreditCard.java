package obj.basic;

public class CreditCard {
	private long number;
	public String owner;
	private int point;
	private int balance;

	//카드사용메소드
	public void use(int amount) {
		this.balance += amount;
		System.out.println("현재 카드 사용액:" + this.balance);
	}
	//카드 비용 지불 메소드, 클래스 정보
	//this는 바뀐 객체의 내용을 다라간다.
	public void payBill(int amount) {
		this.balance -= amount;
		System.out.println("지불액: " + amount + ", 지불 잔액: " + this.balance);
		this.addpoint(amount);
	}
	//카드 포인트 추가 메소드
	public void addpoint(int amount) {
		this.point += amount/1000;
		System.out.println("보너스 포인트:" + this.point);	
	}
	public static void main(String[] args) {
		CreditCard myCard = new CreditCard();
		myCard.number = 3456_7654_8765_5647L;
		myCard.owner = "이수광";
		System.out.print("카드번호: " + myCard.number);
		System.out.println(", 카드소유자: " + myCard.owner);
		myCard.use(30000);
		myCard.payBill(10000);
		
		CreditCard yourCard = new CreditCard();
		yourCard.use(50000);
	}
}
