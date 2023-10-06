package _7day;

import java.util.Scanner;

public class avg_array {
	public static void main(String[] args)
	{
		int sum =0;
		float avg =0;
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
		System.out.println("avg of array elements is :"+((float)sum/a.length));

		
	}

}
