package _6day;

import java.util.Scanner;

public class array1 {
	public static void main(String[] args)
	{
		int a[] = new int[5];
		//a[0]=3;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.println();
			System.out.println("entre array [" +i +"]");
			a[i] = sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
			
		}
		
		
	}

}
