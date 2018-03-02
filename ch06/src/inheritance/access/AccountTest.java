package inheritance.access;

public class AccountTest {
	public static void main(String[] args) {
		SavingAccount myAccount = new SavingAccount("강민경", 1234567834, 0.32);
		myAccount.deposit(50000);
		myAccount.withdraw(4000);
		myAccount.checkBalance();
		
		
		System.out.println(myAccount.name);			//접근가능
		System.out.println(myAccount.open);			//접근 가능
		System.out.println(myAccount.number);		//접근 가능
		//System.out.println(mayAccount.balance);	//접근 불가
		//부모가 private으로 선언해서 접근 불가 오류
	}
}
