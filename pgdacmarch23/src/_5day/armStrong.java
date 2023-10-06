/*Q 5 Write a program to print out all Armstrong numbers between 1 and 500. 
 * If sum of cubes of each digit of the number is equal to the number itself,
 *  then the number is called an Armstrong number.

For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ) */
package _5day;

import java.util.Scanner;

public class armStrong {

	public static void main(String[] args) {

		int rem=0;
		int total= 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number1");
		int number = sc.nextInt();
		int temp = number;
		if(number>=1 && number<=500){
		
			while(number>0) {
				
					rem = number%10;
					total = total+(rem*rem*rem);
					
					number = number/10;
					}
		}
		
		if(total ==temp)
			System.out.println("its armstrom number");
		else
			System.out.println("not");
		// TODO Auto-generated method stub

	}

}
