package DataStructure_Assig;

import java.util.Scanner;

public class QuickSort {
	public static int Partion(int []arr,int l, int h)
	{
		
		int pivot = arr[l];
		int i=l+1;
		int j=h;
		while(i<j)
		{
			do
			{
				i++;
			}while(arr[i]<=pivot);
			
			do
			{
				j--;
			}while(arr[j]>pivot);
			if(i<j)
			{
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		int temp= arr[j];
		arr[j]=pivot;
		arr[l]=temp;
		
		return j;
		
	}
	 static void quickSort(int array[], int low, int high) {
		    if (low < high) {

		      int p = Partion(array, low, high);
		      
		      
		      quickSort(array, low, p - 1);

		      quickSort(array, p + 1, high);
		    }
		  }
	public static void main(String[] args) {
		System.out.println("enter the value of n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr= new int[n];
		System.out.println("enter elements of array ");
		for(int i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();

	}
		   // call quicksort() on array data
		
		
	    quickSort(arr, 0, n-1);
		System.out.println("sorted elements of array are..");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] +" ");

	}
		sc.close();

		
		
	}
}
