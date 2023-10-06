package Myshop;

import java.util.Scanner;


public class FlowerRecord {
	public static void main(String[] args) {

		FlowerRecord f1 = new FlowerRecord();
		f1.display();
		

		Scanner sc = new Scanner(System.in);
		System.out.println();
		 System.out.println("enter flower name");
		 String flower_name = sc.next();
		 System.out.println("enter no of pieces u want");
		 int  no_of_pices = sc.nextInt();
		 FlowerRecord f2 = new FlowerRecord(flower_name,no_of_pices);
		 f2.display();
	
		 
		 
	}
	String flower_name;
	int no_of_petals;
	int no_of_piece;
	int price;
	int total_price;
	public FlowerRecord() {

		flower_name ="rose";
		no_of_petals =12;
		price =25;
		no_of_piece=5;
		total_price =no_of_piece*price;
		
	}
	public FlowerRecord(String flower_name,int no_of_piece) {

		this.flower_name =flower_name;
		this.no_of_petals =8;
		this.price = 40;
		this.no_of_piece = no_of_piece;
		this.total_price =no_of_piece*price;
		
	}
	public int calculate_discount(){

		if (total_price >2000) 
		return 200;
		else
			return 100;
	}



	void display()


	{
		
		System.out.println("flowerName is : "+flower_name);
		System.out.println("no_of_petals in flower : "+no_of_petals);
		System.out.println("price per flower is : "+price);
		System.out.println("no of pieces of flowers: "+no_of_piece);
		System.out.println("total price of flowers : "+total_price);
		System.out.println("total price of flower after discount: " +(total_price-calculate_discount()));
	}

}
