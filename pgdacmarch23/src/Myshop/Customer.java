package Myshop;

import java.util.Scanner;

public class Customer {
	public static void main(String[] args) {

		Customer c1 = new Customer();
		c1.getData();
		c1.showData();
		

	}
	String address;
	String cname;
	long pincode;
	void getData(){


		Scanner sc = new Scanner(System.in);
		System.out.println();
		 System.out.println("enter customer name");
		 cname = sc.next();
		 System.out.println("enter customer address ");
		 address = sc.next();
		 System.out.println("enter pincode ");
		 pincode = sc.nextLong();
		
	}

    
	void showData(){



		System.out.println("customer Name is : "+cname);
		System.out.println("customer address is : "+address);
		System.out.println("pin code  : "+pincode);
		
		
	}

}
