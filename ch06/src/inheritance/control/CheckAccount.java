package inheritance.control;

//import java.util.Date;

import inheritance.access.Account;
import inheritance.access.SavingAccount;


public class CheckAccount extends Account {
	long minimum;		//최소 잔액 금액
	
	
	public CheckAccount(String name, int number, long minimum) {
		super(name, number);
		this.minimum = minimum;
		super.deposit(minimum);	//deposit(minimum);으로도 가능
		//Date a = super.open;
	}
	
	public static void main(String[] args) {
		SavingAccount myAccount = new SavingAccount("김태희", 234567654, 0.34);
		myAccount.deposit(250000);
		myAccount.withdraw(50000);
		myAccount.checkBalance();
		
		
		System.out.println(myAccount.name);			//접근가능
		//System.out.println(myAccount.open);		//접근 불가
		//System.out.println(myAccount.number);		//접근 불가
		//System.out.println(myAccount.balance);	//접근 불가
		
		CheckAccount cAccount = new CheckAccount("이민정", 87542356, 5000000);
		myAccount.deposit(250000);
		myAccount.withdraw(50000);
		myAccount.checkBalance();
		
		System.out.println(cAccount.name);			//접근 가능
		System.out.println(cAccount.open);			//접근 가능
		//System.out.println(myAccount.number);		//접근 불가
		//System.out.println(myAccount.balance);	//접근 불가
		

	}
}
