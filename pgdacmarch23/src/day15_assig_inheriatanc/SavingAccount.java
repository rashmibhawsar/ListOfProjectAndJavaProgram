package day15_assig_inheriatanc;

import java.util.Scanner;

public class SavingAccount extends Account{
	public SavingAccount() {




		 customer_name="RASHMI";
		 accountNo = "561256987789";
		 accountType="SAVING";
		 System.out.println("customer_name: "+customer_name+
				 " \naccount_no: "+accountNo+"\naccounttype: "+accountType+
				 "\nbalance before is :"+balance_Amount);
		}
	void compundInterest() {




		Scanner sc = new Scanner(System.in);
		System.out.println("compound interest on account bal");
		//long p = sc.nextLong();

		System.out.println("enter time period in years");
		int t = sc.nextInt();
		double amount = ((double)balance_Amount)* Math.pow(((double)1+ 0.1),t);
//		double amount = amt*t;
		System.out.println("amount of compound interest is : "+amount);
		
		
	}

}
