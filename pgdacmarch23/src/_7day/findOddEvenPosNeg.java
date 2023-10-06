package _7day;

import java.util.Scanner;

public class findOddEvenPosNeg {
	public static void main(String[] args)
	{
		int a[] = new int[20];
		int counter_even =0;
		int counter_odd =0;
		int counter_pos =0;
		int counter_neg=0;
		int counter_zero =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entre 20 array elements");
		for(int i=0;i<20;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.print("array element are");
		for(int i=0;i<20;i++)
		{
			System.out.print(" "+a[i]);
			
		}
		System.out.println();
		System.out.print("even array element are");
		for(int j=0;j<20;j++)
		{
			if(a[j]%2==0) {
				counter_even++;
				/*
				 * if(a[j]>0) counter_pos++; else if(a[j]<0) counter_neg++; else counter_zero++;
				 */
				
			}else {
				counter_odd++;
				/*
				 * if(a[j]>0) counter_pos++; else if(a[j]<0) counter_neg++; else counter_zero++;
				 */
			}
			
			if(a[j]>0)
				counter_pos++;
			else if(a[j]<0)
				counter_neg++;
			else
				counter_zero++;
			
			
			
		}

		System.out.println();
		System.out.println("total even number are :  "+counter_even);
		System.out.println("total odd number are :  "+counter_odd);
		System.out.println("total positive number are :  "+counter_pos);
		System.out.println("total negative number are :  "+counter_neg);
		System.out.println("total zero number are :  "+counter_zero);
	}

}
