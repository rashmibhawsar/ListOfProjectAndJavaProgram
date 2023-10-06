package Myshop;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {

		int rem=0;
		int total1= 0;
		int total2 =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number1");
		int number = sc.nextInt();
		int temp = number;
		if(number>=1){
		
			while(number>0) {
				
					rem = number%10;
					total1 = total1+rem;
					total2 = total2*rem;
					number = number/10;
					}
			System.out.println(total1);
			System.out.println(total2);
			
		}


	}

}
