package inheritance.access;

import java.util.Date;
/*
 * 접근제한자 (접근 지정자)
 * -private: 같은 클래스 내부에서만 사용가능
 * -(default, package방식):패키지 내부에서만 사용가능
 * -protected: default 접근 범위 + 상속받은 클래스까지 사용가능
 * -public: 어디서든 접근이 가능
 */

public class Account {
	public String name;			//계좌주
	protected Date open;		//계좌일자
	/*package*/ int number;		//계좌번호 default라서
	private long balance;		//잔고
	
	
	//기본 생성자
	public Account() {}
	//생성자(동일 패키지, 하위 클래스에서 사용 가능)
	protected Account(String name, int number) {
		this.name = name;
		this.number = number;
		this.setOpen(new Date());//생성 시점의 시간 
	}
	
	/*일반 메소드
	입금 메소드*/
	public long deposit(long amount) {
		return balance += amount;	
	}
	//출금메소드
	public long withdraw(long amount) {
		return balance -= amount;
	}
	//계좌정보 및 잔액 출력 메소드
	public long checkBalance() {
		System.out.println(name + "; 계좌번호 " + number + ", 잔액 " + balance);
		return balance;
	}
	public void testAccess( ) {
		String a = this.name;
		Date b = this.open;
		int c = this.number;
		long d = this.balance;
	}
	
	
	public Date getOpen() {
		return open;
	}
	public void setOpen(Date open) {
		this.open = open;
	}
}





