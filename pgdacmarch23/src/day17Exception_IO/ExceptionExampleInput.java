package day17Exception_IO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExampleInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try{
		

		System.out.println("enter x value");
		int x = sc.nextInt();
		System.out.println("enter y value ");
		int y = sc.nextInt();
		
			double z = x/y;
			System.out.println("power is...."+z);
		}
		catch(ArithmeticException  e)
		{
			System.out.println(e.getMessage());
			
		}
		catch(InputMismatchException  f)
		{
			System.out.println("string not required");
			
		}
		
		System.out.println("end of pgm");
		

	}

}
