package _4_arrays;

import java.util.Scanner;

public class Array {

	int arr[];
	int capacity;// max no of data it can store;
	int count; // currently available total no of array
	int size()
	{
		return count;
	}
	
	public Array() {
		capacity=10;
		arr=new int[capacity];
		count=0;
	}
	public Array(int c) {
		capacity=c;
		arr=new int[capacity];
		count=0;
	}
	void create(int n)
	{
		if(count+n>capacity)
		{
			System.out.println("can't insert all value");
		}
		Scanner sc= new Scanner(System.in);
		for(int i=count;i<count+n;i++)
		{
			System.out.println("enter the data in array");
			arr[i]=sc.nextInt();
			count++;
			
		}
		
	}
	
//**********************************
	void add(int value)
	{
		if(count==capacity) {
			
			System.out.println("array is full");
		/* if u want to make it dynamic increase capacity. and assign inew arr then copy old to ne
		 * capacity= capacity*2;
		int[] newarr = new int[capacity*2];
		for( int i=0;i<count;i++)
		{
			newarr[i]=arr[i];
		}arr=newarr;*/
	
		}
		else
		{
		arr[count]=value;
		count++;
		}
	}
//*********************
	void addpos(int pos,int value)
	{
		if(pos>count)
		{
			System.out.println("can't insert element");
		}
		else
		{
			if(pos==count)
			{
				arr[pos]=value;
			}
			else
			{
				if(pos<count)
				{
					for(int i=count;i>pos;i--)
					{
						arr[i]=arr[i-1];
						
					}
					arr[pos]=value;
				}
			}
			
		}
		count++;
	}
	//************************
	void removeatlast()
	{
		if(count==0)
		{
			System.out.println("arr is empty");
		}
		else
		{
			arr[count]=0;
			count--;
		}
	}
	//***************	
	void removeAtpos(int pos)
	{
		if(count==0)
		{
			System.out.println("arr is empty");
		}
		else
		{
			if(pos<count)//remove
			{
				for(int i=pos;i<count;i++)
				{
					arr[i]=arr[i+1];
				}
			}
			else
			{
				arr[pos]=0;//that is pos ==count
			}
			count--;
		}
	}
//***************	
	
	void display()
	{
		if(count==0)
			System.out.print("array is empty");
		else
		{
			System.out.print("[");
			for (int i=0;i<count;i++)
			{
				System.out.print(arr[i] + " ");
			}
			System.out.println("]");
		}
	}
}

