package Myshop;

import java.util.Scanner;


public class AllData {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//Scanner sc = new Scanner(System.in);
			 System.out.println("enter 1..for flower class   2...customer class");
			 int choice = sc.nextInt();
			 switch(choice)
			 {
			 case 1:FlowerRecord f1 = new FlowerRecord();
				f1.display();
				
	
				//Scanner sc1 = new Scanner(System.in);
				System.out.println();
				 System.out.println("enter flower name");
				 String flower_name = sc.next();
				 System.out.println("enter no of pieces u want");
				 int  no_of_pices = sc.nextInt();
				 FlowerRecord f2 = new FlowerRecord(flower_name,no_of_pices);
				 f2.display();
			 		break;
			 case 2:Customer c = new Customer();
				   c.getData();
				   c.showData();
		 		   break;
			 default:System.out.println("invalid input");
			 break;
			 
			 }System.out.println("u want to repeating the menu yes press 1 else enter 0");
			 int flag = sc.nextInt();
			 if(flag==0)
				 break;
			 
			
		}

		

		}

		

}


