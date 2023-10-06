package _6day;

import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) 
	{
		int flag =1;
		int a[] = new int[5];
	
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("entre array [" +i +"]");
			a[i] = sc.nextInt();}

		
		for(int j = 0;j<(a.length);j++) {
			if(a[j]==5) {
				flag =0;
				System.out.println("found");
				break;
				}
			
			}		if(flag==1)
				System.out.println("not found");
				
			


	}		
}

		
		

	


	


