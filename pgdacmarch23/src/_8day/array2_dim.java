package _8day;

import java.util.Scanner;
public class array2_dim {
	public static void main(String[] args)
	{
		int a[][] = new int[3][4];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter elements");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++) {
				System.out.println("entre array [" +i +"]" +"["+j+"]");
				a[i][j] = sc.nextInt();
				
			}
			
	
		}
		System.out.println("array element are");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++) {
				System.out.print(" "+a[i][j]);
				
			}System.out.println();
				
		}
	}


}
