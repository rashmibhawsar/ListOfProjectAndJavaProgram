package _5day;

import java.util.Scanner;

public class prime_or_not {
	public static void main(String[] args) {
		int count =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i==0) {
				count = 1;
				break;
			}
					
		}
		if(count ==0)
			System.out.println("prime number");
		else
			System.out.println("not a prime no");
		
	}
}
