/*Q 8 Write a program in java to find the sum of the even and odd digits of the number which is given as input.*/
package _5day;

import java.util.Scanner;

public class sum_of_even_odd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		System.out.println();
		int rem=0;
		int  even_digit_sum=0;
		int  odd_digit_sum=0;
		while(number>0) {
			if(number>0) {
				rem = number%10;
				
				if(rem%2==0)
					even_digit_sum=even_digit_sum+rem;
				else
					odd_digit_sum=odd_digit_sum+rem;
				
				
				number = number/10;
				}
			
		}
		System.out.println("sum of even number in given no is : " +even_digit_sum);
		System.out.println("sum of even number in given no is : " +odd_digit_sum);
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}
