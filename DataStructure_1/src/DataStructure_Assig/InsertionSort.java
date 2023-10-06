package DataStructure_Assig;

import java.util.Scanner;

public class InsertionSort {

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
		for(int i=1;i<n;i++)
		{
			int j=i-1;
				int key = arr[i];
				while(arr[j]>key && j>=0)
				{arr[j+1]=arr[j];
				j--;
				}
				arr[j+1]=key;
		}
		System.out.println("sorted elements of array are..");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] +" ");

	}
		sc.close();

	}

}


