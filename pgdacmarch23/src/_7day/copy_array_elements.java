package _7day;

import java.util.Scanner;

public class copy_array_elements {
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		int b[] = new int[5];
	
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("entre array [" +i +"]");
			a[i] = sc.nextInt();}

		
		for(int k = 0;k<(a.length);k++) {
			for(int l = k;l<=k;l++) {
				b[l]=a[k];
			}
		}
		
		System.out.print("array elements after copying fm array a[] to b[] are :");
		for(int m=0;m<5;m++)
		{
			System.out.print(" " +b[m]);
			
		}
			
		
				sc.close();
			
				
			
	}

}
