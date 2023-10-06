/*Q 24 Write a Java program that accepts two double variables
 *  and test if both strictly between 0 and 1 and false otherwise.
Hint n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1*/
package _5day;

import java.util.Scanner;

public class acceptDouble_0_to_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number1");
		double n1 = sc.nextDouble();
		System.out.println("enter number2");
		double n2 = sc.nextDouble();
		if((n1 > 0 && n1 < 1)&& (n2 > 0 && n2 < 1))
			System.out.println("number is accept");
		else
			System.out.println("false");
		}

}
