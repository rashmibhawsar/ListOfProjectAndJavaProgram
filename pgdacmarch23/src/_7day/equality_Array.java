package _7day;

import java.util.Scanner;

public class equality_Array {
		public static void main(String[] args)
		{
			int a[] = new int[5];
			int b[] = new int[5];
			int flag =0;
			Scanner sc = new Scanner(System.in);
			
			for(int i=0;i<5;i++)
			{
				System.out.println("entre array a [" +i +"]");
				a[i] = sc.nextInt();
			}
			System.out.print("array element are");
			for(int i=0;i<5;i++)
			{
				System.out.print(" "+a[i]);
				
			}
			System.out.println();
			
			for(int i=0;i<5;i++)
			{
				System.out.println("entre array b [" +i +"]");
				b[i] = sc.nextInt();
			}
			System.out.print("array element are");
			for(int j=0;j<5;j++)
			{
				System.out.print(" "+b[j]);
				
			}
			System.out.println();
			
			for(int k=0;k<5;k++)
			{
				if(a[k]==b[k])
				continue;
				else
				{
					flag = 1;
					break;
				}
				}
			if(flag==1)
				System.out.println("array is not equal");
			else
				System.out.println("array is equal");
		}
}

				
			
			
		
		


