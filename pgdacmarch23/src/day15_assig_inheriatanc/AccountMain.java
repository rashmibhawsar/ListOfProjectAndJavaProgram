package day15_assig_inheriatanc;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter type of account enter 1 or 2 \n 1...saving account \n2...current account");
		 int choice = sc.nextInt();
		 switch(choice)
		 {
		 case 1:SavingAccount s = new SavingAccount();
		 		s.toDeposit(500);
		 		s.toWithdraw(100);
		 		s.toDisplay();
		 		System.out.println("you want to deposit amount yes : press 1 ...no press 0");
		 		int deposit_choice = sc.nextInt();
		 		if(deposit_choice==1) {
		 		s.compundInterest();}
		 		break;
		 case 2:CurrentAccount c = new CurrentAccount();
	 		c.toDeposit(500);
	 		System.out.println("enter amount to withdraw");
	 		int amountWithdraw = sc.nextInt();
	 		boolean f =c.checkForWithdrawal(amountWithdraw);
	 		if(f==true) {
	 		c.toWithdraw(amountWithdraw);}
	 		else 
	 			c.toWithdraw(amountWithdraw);
	 		c.toDisplay();
	 		break;
		 default:System.out.println("invalid input");
		 break;
		 }
		

		}

}
