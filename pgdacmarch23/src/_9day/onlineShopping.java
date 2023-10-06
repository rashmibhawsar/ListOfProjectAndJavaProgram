package _9day;

import java.util.Scanner;

public class onlineShopping {

	public static void main(String[] args) {
		System.out.println("1. product");
		System.out.println("2. seller");
		System.out.println("1. enter choice");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1: productDetails p = new productDetails();
		p.input();
		p.display();
		break;
		case 2: sellerDetails s  = new sellerDetails();
		s.input();
		s.display();
		break;
		
		}
				
		// TODO Auto-generated method stub

	}

}
