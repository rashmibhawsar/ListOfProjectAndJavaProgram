package day13;

import java.util.Scanner;

class Bike extends Vehical
{
	public Bike() 		
		{		System.out.println("bike number is 5674");	}

	
}

class Car extends Vehical 
{
	public Car() {
		
				System.out.println("scar");	}

}
public class InheritanceExample {

	public static void main(String[] args) {
		Bike k= new Bike();
		k.getType();
		Car c = new Car();
		c.getType();
		
		

	}

}

class Vehical
{
	String vehical_Type;
	
	public Vehical() {		System.out.println("vehical");	}

	void display() {
		
	}
	void getType() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter vehical type ");
		vehical_Type = sc.next();
	}

}