package obj.constructor;

public class Account {
	public String owner;
	public long balance;
	
	public Account(String owner) {
		this.owner = owner;
	}
	public Account(long balance) {
		this.balance = balance;
	}
	public Account(String owner , long balance) {
		//this:Account의 객체, this는 자기자신, super는 부모
		this(owner);
		//this(
		this.balance=balance; 
	}
	public static void main(String[] args) {
		Account act1 = new Account("최여진");
		Account act2 = new Account(10000000);
		act2.owner ="홍혜빈";
		Account act3 = new Account("신세경", 200000);
		
		System.out.println("act1: %s");
	}
}
