package DataStructure_Assig;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int flag = 0;

		System.out.println("enter the value of n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("enter elements of array ");
		for(int i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();

	}	
	System.out.println("enter element to search");
	int element = sc.nextInt();
	for(int i =0 ;i<n;i++)
	{if(arr[i]==element)
		{flag = 1;
		break;}
	}
	if(flag==1)
		System.out.println("element found");
	else
		System.out.println("element not found");

	}

}
