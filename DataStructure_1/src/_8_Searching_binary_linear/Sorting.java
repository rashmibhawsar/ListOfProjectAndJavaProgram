package _8_Searching_binary_linear;


public class Sorting {
	
	void BubbleSort(int arr[])
	{
		for (int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<(arr.length-i-1);j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			
		}

	}
	
//****************************selection sort*************
	void SelectionSort(int arr[])
	{
	
		for (int sel=0;sel<arr.length-1;sel++)
		{
			for(int pos=sel+1;pos<arr.length-1;pos++)
			{
				if(arr[sel]>arr[pos])
				{
					int temp= arr[sel];
					arr[sel]=arr[pos];
					arr[pos]=temp;
				}
				
			}
			
		}
	
	}
	//****************************Insertion sort*************	
	void InsertionSort(int arr[])
	{

	    for(int i=1; i < arr.length ; i++)
	    {
	        int j = i - 1;
	        int key = arr[i]; 
	    
	        while( j>=0  && key < arr[j])
	        {
	            arr[j+1] = arr[j]; 
	            j--; 
	        }
	        arr[j+1] = key;
	    }

	}

//****************************** Quick sort****************
void quick(int arr[], int start, int end)  
	{  
	    if (start < end)  
	    {  
	        int p = partition(arr, start, end);  //p is partitioning index  
	        quick(arr, start, p - 1);  
	        quick(arr, p + 1, end);  
	    }  
	}
	int partition (int a[], int start, int end)  
	{  
	    int pivot = a[end]; // pivot element at first pos
	    int i = (start - 1);  
	  
	    for (int j = start; j <= end - 1; j++)  
	    {  
	        // If current element is smaller than the pivot  
	        if (a[j] < pivot)  
	        {  
	            i++; // increment index of smaller element ... swap i and j
	            int t = a[i];  
	            a[i] = a[j];  
	            a[j] = t;  
	        }  
	    }  
	    int t = a[i+1];   // this is when i and j cross each other
	    a[i+1] = a[end];  
	    a[end] = t;  
	    return (i + 1);  
	} 

//************************main *****************************
	public static void main(String args[])
	{

		int arr[]= {20,30,10,40,70,50,60};
		System.out.println("elements before sorting");
		 for(int i = 0 ; i< arr.length ; i++)
		    {
		    	System.out.print(arr[i]+ "  ");
		    }
		Sorting s= new Sorting();
		System.out.println("\n***************bubble  sort*******");
		s.BubbleSort(arr);
		 for(int i = 0 ; i< arr.length ; i++)
		    {
		    	System.out.print(arr[i]+ "  ");
		    }
		System.out.println("\n***************selection sort*****");
		s.SelectionSort(arr);
		 for(int i = 0 ; i< arr.length ; i++)
		    {
		    	System.out.print(arr[i]+ "  ");
		    }
		System.out.println("\n***************insertion sort*****");
			s.InsertionSort(arr);
			 for(int i = 0 ; i< arr.length ; i++)
			    {
			    	System.out.print(arr[i]+ "  ");
			    }
		
		System.out.println("\n***************quick sort*********");
				s.quick(arr, 0, arr.length-1);
				 for(int i = 0 ; i< arr.length ; i++)
				    {
				    	System.out.print(arr[i]+ "  ");
				    }
	}

}
