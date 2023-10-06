//product
package _9day;

import java.util.Scanner;

public class productDetails {
	String pname;
	int price;
	int qty;
	
	void display()
	{
		System.out.println(pname);
		System.out.println(price);
		System.out.println(qty);
	}
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter product name");
		pname =sc.next();
		System.out.println("enter product price");
		price =sc.nextInt();
		System.out.println("enter product qty");
		qty =sc.nextInt();
		
	}



}
