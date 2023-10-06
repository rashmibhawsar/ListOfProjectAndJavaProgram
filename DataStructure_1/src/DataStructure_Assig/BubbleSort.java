package DataStructure_Assig;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("enter the value of n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("enter elements of array ");
		for(int i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();

	}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(n-1)-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
					
				}
					
			}
		}
		System.out.println("sorted elements of array are..");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] +" ");

	}
		sc.close();

	}
	

}


