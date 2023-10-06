package day11;

import java.util.Scanner;

public class array_object{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter n value");
		int n = sc.nextInt();
		inventory_test p[] = new inventory_test[n];
		//for (inventory_test obj : p) {
		//	obj.input()
			
		//}
		
		for(int i =0;i<n;i++) {
			p[i].store();
			
		}
		
		
		
	}
	
	
}


class inventory_test {


	String pname;
	int price;
	//}
	public void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the product name");
		pname = sc.next();
		System.out.println("enter the product price");
		price = sc.nextInt();
		
		
	}
		
	public void store() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the product name");
		pname = sc.next();
		System.out.println("enter the product price");
		price = sc.nextInt();
		
		
	}
	//public inventory_test input() {

	
		
}
		// TODO Auto-generated method stub