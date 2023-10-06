package _6day;

import java.util.Scanner;

public class max_array_element {
	public static void main(String[] args) 
	{
		int max =0;
		int a[] = new int[5];
	
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("entre array [" +i +"]");
			a[i] = sc.nextInt();}

		
		for(int j = 0;j<(a.length);j++) {
			if(a[j]>max) {
				max = a[j];

				}
			
			}	System.out.println("max elem is:" +max);	
				
			


	}

}
