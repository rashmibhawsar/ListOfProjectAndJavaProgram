package DataStructure_LabInternal;

import java.util.Scanner;

public class Q3_InsertionSorting {
	public static void main(String[] args) {

		System.out.println("enter n value...");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("enter elemnts of array ");
		for(int i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();

	}
		for(int i=1;i<n-1;i++)
		{
			int j=i-1;
				int key = arr[i];
				while(arr[j]>key && j>=0)
				{arr[j+1]=arr[j];
				j--;
				}
				arr[j+1]=key;
		}
		System.out.println("insertion sorted elements are..");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] +" ");

	}
	

	}


}
