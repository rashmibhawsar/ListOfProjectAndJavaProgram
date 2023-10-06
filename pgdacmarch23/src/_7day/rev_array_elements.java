package _7day;

import java.util.Scanner;

public class rev_array_elements {
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
		System.out.print("reverse array element are");
		for(int i=4;i>=0;i--)
		{
			System.out.print(" "+a[i]);
			
		}
		
		
	}

}
