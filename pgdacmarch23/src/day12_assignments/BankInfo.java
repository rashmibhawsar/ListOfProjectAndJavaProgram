/*Q 5   Design a class to represent bank account. Include members:
a.   Data members
i.    Name of depositor
ii.   Account number
iii.   Type of account
iv.   Balance amount
b.   Methods
i.   To assign value  
ii.   To deposit amount
iii.   To withdraw amount
iv.   To display name and balance .*/
package day12_assignments;

import java.util.Scanner;

//import day13.BankAccount;

class BankAccount {
	

	int balance_Amount;

	 
	 void toDeposit(int amount) {


		 balance_Amount = balance_Amount+amount;
		 System.out.println("amount deposited :"+amount);
	 }
	 
	 public void toDisplay(){


		System.out.println(  "balance is :"+balance_Amount);
		}
	 
	void toWithdraw(int amount) {


		 balance_Amount = balance_Amount-amount;
		 System.out.println("amount withdraw :"+amount);
		 }
	}
public class BankInfo {

	public static void main(String[] args) {


		int balance_Amount1;

		Scanner sc = new Scanner(System.in);

			System.out.println("enter balance amount");
			balance_Amount1 = sc.nextInt();
			
		SalaryAccount e = new SalaryAccount();
	
		e.toDeposit(1000);
		e.toWithdraw(500);
		e.toDisplay();
		
		RecurringAccount e1 = new RecurringAccount();
		
		e.toDeposit(1000);
		e.toWithdraw(500);
		e.toDisplay();

	}

}
class RecurringAccount extends BankAccount 
{   double balance_Amount1;
	void toDeposit(int amount) {


	 balance_Amount1 = balance_Amount+(double)amount*(0.1);
	 System.out.println("amount deposited :"+(amount*0.1));
}
	public void toDisplay(){


		System.out.println(  "balance is :"+balance_Amount1);
		}
	}
	
class SalaryAccount extends BankAccount
{
	Scanner sc = new Scanner(System.in);
	public SalaryAccount() {

		System.out.println("THIS IS SALARY ACCOUNT");
		// TODO Auto-generated constructor stub
	}
	/*void toAssign(){



		System.out.println("enter emp account type ");
		account_Type = sc.next();
		}*/
}
