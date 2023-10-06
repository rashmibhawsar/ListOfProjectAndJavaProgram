package _8_Searching_binary_linear;

import java.util.Scanner;


public class Search {
	
	//*****************binary search**************************
	void binarysearch(int key)
	{
		int arr[]={10,20,30,40,50,60,70,80,90,100};
	    int left = 0;
	    int right =  arr.length -1; 
	    int flag=0;
	    System.out.println("......... elements in array............");
	    for(int i = 0 ; i< arr.length ; i++)
	    {
	    	System.out.println(arr[i]+ "  ");
	    }

	    while(left<=right)
	    {
	        int mid = (left + right) / 2;
	        if(key == arr[mid])
	        { System.out.println("element found at pos :" +(mid+1));
	        	flag=1;}
	        if(key < arr[mid])    
	           right = mid - 1;
	        else 
	           left = mid + 1;       

	    }
	    if(flag==0)
	    	System.out.println("element not found");

	}
	
	//***********************linear search************

void linear_search(int key )
{
	int arr[]={10,20,30,40,50,60,70,80,90,100};
	int flag=0;

       for(int i= 0;i<arr.length ; i++)
       { 
            if(key == arr[i])
            {
            	flag=1;
                System.out.println("elenent found in linear search ");}
       }
       if(flag==0)
	    	System.out.println("element not found in binary search ");
       
}
//
	
	
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter ur key element");
	int key = sc.nextInt();
	Search s = new Search();
	//s.binarysearch(key);
	s.linear_search(key);
	
}
	

}



