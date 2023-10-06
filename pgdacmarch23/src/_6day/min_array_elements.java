package _6day;

import java.util.Scanner;

public class min_array_elements {
	public static void main(String[] args) 
	{
		
		int a[] = new int[5];
	
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0;i<5;i++)
		{
			System.out.println("entre array [" +i +"]");
			a[i] = sc.nextInt();}
		
		int min =a[0];

		
		for(int j = 0;j<(a.length);j++) {
			if(a[j]<min) {
				min = a[j];

				}
			
			}	System.out.println("max elem is:" +min);	
				
			


	}


}
