package com.Aopspring.Aopspring;

public class Account {
	int accto;
	String holdername;
	double balance;
	public int getAccto() {
		return accto;
	}
	public void setAccto(int accto) {
		this.accto = accto;
	}
	public String getHoldername() {
		return holdername;
	}
	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		System.out.println("im inside to string method");
		return "Account [accto=" + accto + ", holdername=" + holdername + ", balance=" + balance + "]";
	}
	public void deposit(double balance)
	{
		System.out.println("im inside deposite method");
		balance = balance +2000;
	}
	public void withdrawl(double balance){
		System.out.println("im inside withdrawl method");
		balance = balance-2000;
	}
	

}
