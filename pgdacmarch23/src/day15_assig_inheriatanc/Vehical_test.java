/*Q  1  Write a Java program to create a super class Vehicle having members Company and price.
Derive 2 different classes LightMotorVehicle (members – mileage) and
HeavyMotorVehicle (members – capacity-in-tons). Accept the information for n vehicles
and display the information in appropriate form. While taking data, ask the user about the
type of vehicle first.
 * */
package day15_assig_inheriatanc;

import java.util.Scanner;

class HeavyMotorVehical extends Vehical{
	 int capacity_in_tons;
	 void accep_info()
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter capacity in tons");
		 capacity_in_tons = sc.nextInt();
		 }
	 void display()
	 {
		 price = 55000;
		 System.out.println("capacity is: "+capacity_in_tons+"price of heavy motor vehical: "+capacity_in_tons);
		 }
	}
 class LightMotorVehical extends Vehical{
	 int price = 35000;
	 void display() {
		 System.out.println("the light motor vehical with company\n name: "+companyName+ "\n price of light motor vehical: "+price);
	 }
	 
	 
 }
 class Vehical{
	 String companyName;
	 int price;
	 void accep_info()
	 { 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the company name");
		 companyName = sc.next();
		 }
	 }

public class Vehical_test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 System.out.println("enter type of vehical enter 1 or 2 \n 1...light_weight \n2...heavyweight");
		 int choice = sc.nextInt();
		 switch(choice)
		 {
		 case 1:LightMotorVehical l = new LightMotorVehical();
	 		l.accep_info();
	 		l.display();
			 break;
		 case 2:HeavyMotorVehical h = new HeavyMotorVehical();
		 		h.accep_info();
		 		h.display();
		 		break;
		 default:System.out.println("invalid input");
		 break;
		 }
	}
}
