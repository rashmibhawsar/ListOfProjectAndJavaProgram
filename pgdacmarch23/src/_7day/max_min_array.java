package _7day;

import java.util.Scanner;

public class max_min_array {
		public static void main(String[] args) 
		{
			int max =0;
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
			}

			for(int k = 0;k<(a.length);k++) {
				if(a[k]>max) {
					max = a[k];

					}
				
				}	
				System.out.println("max elem is:" +max);
				System.out.println("min elem is:" +min);
					
				


		}

}
