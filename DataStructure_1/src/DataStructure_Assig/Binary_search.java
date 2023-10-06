package DataStructure_Assig;

import java.util.Scanner;

public class Binary_search {

	public static void main(String[] args) {
		int flag=0;
		System.out.println("enter the value of n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("enter elements of array in sorted order");
		for(int i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();

	}
		System.out.println("enter element to search");
		int element = sc.nextInt();
		int low = 0;
		int high = n-1;
		while(low<= high)
		{
			int mid = (high+low)/2;
			if(arr[mid]==element)
			{flag=1; break;}
			else
				if(arr[mid]>element)
					high= mid-1;
				else
					low = mid+1;
					
			
		}
		if(flag==0)
			System.out.println("element not found");
		else
			System.out.println("element found");
		sc.close();

}
	
	
}
