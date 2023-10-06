package _9day;

import java.util.Scanner;

public class sellerDetails {
	String email;
	String pname;
	int price;
	int qty;
	
	void display()
	{
		System.out.println(pname);
		System.out.println(price);
		System.out.println(qty);
		System.out.println(email);
	}
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter seller name");
		pname =sc.next();
		System.out.println("enter seller price");
		price =sc.nextInt();
		System.out.println("enter seller qty");
		qty =sc.nextInt();		
		System.out.println("enter seller email");
		pname =sc.next();
		
	}



}
