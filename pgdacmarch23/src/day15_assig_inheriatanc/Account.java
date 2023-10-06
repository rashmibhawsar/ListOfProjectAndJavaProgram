package day15_assig_inheriatanc;

public class Account {
	String accountNo;
	String accountType;
	int balance_Amount=1000;
	String customer_name;
	void toDeposit(int amount) {
	
	
		balance_Amount = balance_Amount+amount;
		System.out.println("amount deposited :"+amount);
	}
	public void toDisplay(){


		System.out.println("balance is :"+balance_Amount);
	}
	void toWithdraw(int amount) {
	
	
		balance_Amount = balance_Amount-amount;
		System.out.println("amount withdraw :"+amount);
	}


}
