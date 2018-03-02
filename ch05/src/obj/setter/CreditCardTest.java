package obj.setter;

public class CreditCardTest {
	public static void main(String[] args) {
		CreditCard parkCard = new CreditCard();
		CreditCard leeCard = new CreditCard();
		
		parkCard.owner ="박지성";
		parkCard.setNumber(2378_7643_7643_9825L);
		leeCard.owner ="이민정";
		leeCard.setNumber(6456_9876_4521_6838L);
		
		parkCard.use(100000);		//카드 사용 100000원
		leeCard.use(150000);		//카드사용 15000원
		parkCard.payBill(500000);	//카드대금 지불 50000원
		leeCard.payBill(100000);	//카드대금 지불 10000원
		System.out.println(parkCard.owner + ": " + parkCard.getNumber());
		System.out.println("카드대금 잔액: " + parkCard.getBalance());
		System.out.println("카드 포인트: " + parkCard.getPoint());
		System.out.println(leeCard.owner + ": " + leeCard.getNumber());
		System.out.println("카드대금 잔액: " + leeCard.getBalance());
		System.out.println("카드 포인트: " + leeCard.getPoint());
		
		
	}
}
