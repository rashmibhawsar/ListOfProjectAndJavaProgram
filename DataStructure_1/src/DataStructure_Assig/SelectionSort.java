package DataStructure_Assig;

import java.util.Scanner;

public class SelectionSort {

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
				for(int j=i+1;j<n;j++)
				{
					if(arr[i]>arr[j])
					{
						int temp = arr[i];
						arr[i]= arr[j];
						arr[j]=temp;
						
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
