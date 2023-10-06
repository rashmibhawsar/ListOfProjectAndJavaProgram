package _5day;

import java.util.Scanner;

public class fibonaciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number1");
		int number = sc.nextInt();
		
		int a =0;
		int b =1;
		System.out.print(a+" ");
		System.out.print(b+" ");

			for(int i = 2;i<=number;i++) { 
				int temp ;
				temp =a+b;
				a=b;
				b=temp;
				System.out.print(temp);
				System.out.print(" ");
				//fib1 = fib1 +i;
				
			}	

	}


}
