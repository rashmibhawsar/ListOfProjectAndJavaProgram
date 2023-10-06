package _7day;

import java.util.Scanner;

public class findEvenOddValueInArray {
	public static void main(String[] args)
	{
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("entre array [" +i +"]");
			a[i] = sc.nextInt();
		}
		System.out.print("array element are");
		for(int i=0;i<5;i++)
		{
			System.out.print(" "+a[i]);
			
		}
		System.out.println();
		System.out.print("even array element are");
		for(int j=0;j<5;j++)
		{
			if(a[j]%2==0)
			System.out.print(" "+a[j]);
			
		}
		System.out.println();
		System.out.print("odd array element are");
		for(int j=0;j<5;j++)
		{
			if(a[j]%2!=0)
			System.out.print(" "+a[j]);
			
		}
	}

}
