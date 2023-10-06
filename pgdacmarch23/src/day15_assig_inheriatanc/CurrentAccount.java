package day15_assig_inheriatanc;

public class CurrentAccount extends Account {
	public CurrentAccount() {
		 customer_name="bhawsar";
		 accountNo = "556356987789";
		 accountType="current";
		 System.out.println("customer_name: "+customer_name+
				 " \naccount_no: "+accountNo+"\naccounttype: "+accountType+
				 "\nbalance before is :"+balance_Amount);
	}
	public boolean checkForWithdrawal(int amountWithdraw){
		if((balance_Amount-amountWithdraw) >=1000) {
			return true;
			
		}
		return false;
	}
	void toWithdraw(int amount) {
		
		
		balance_Amount = balance_Amount-amount-100;
		System.out.println("amount withdraw :"+amount);
		System.out.println("as ur min bal should be 1000 so the penalty is 100");
	}
}
