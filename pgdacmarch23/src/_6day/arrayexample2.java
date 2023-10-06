package _6day;

import java.util.Scanner;

public class arrayexample2 {
	public static void main(String[] args)
	{
		int sum =0;
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("entre array [" +i +"]");
			a[i] = sc.nextInt();
		}
		for(int k :a)
		{
			sum +=k;
				
		}
		System.out.println("sum of array elements "+sum);	
	}

}
