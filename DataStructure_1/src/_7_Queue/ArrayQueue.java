package _7_Queue;

public class ArrayQueue {
	 int arr[];
	 int size;
	 int r ;
	 //int f;
	public ArrayQueue(int n) {
		size= n;
		arr=new int[n];
		r=-1;
		
	}
	
	public boolean isEmpty()
	{
		if(r==-1)
			return true;
		else
			return false;
		
	}
	public void add(int data)
	{
		if(r==size-1)
		{
			System.out.println("queue is full");
		}
		else {
			r++;
			arr[r]=data;
		}
		
		
		
	}
	
	public void remove()
	{
		if(isEmpty())
		{
			System.out.println("no element to remove");
		}
		else
		{
			int front=arr[0];
			for(int i=0;i<r;i++)
			{
				arr[i]=arr[i+1];
			}
			r--;
			System.out.println("element deleted is :" +front);
			
		}
	}
	
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("no element to remove");
		}
		else
		{
			System.out.println("element  is :" + arr[0]);
			
		}
		
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("no element to remove");
		}
		else
		{
			for(int i=0;i<=r;i++)
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	
	public static void main(String args[])
	{
		ArrayQueue aq = new ArrayQueue(5);
		aq.add(1);
		aq.add(2);
		aq.add(3);
		aq.add(4);
		aq.add(5);
		System.out.println("display");
		aq.display();
		System.out.println("peek");
		aq.peek();
		System.out.println("display");
		aq.display();
		System.out.println("remove");
		aq.remove();
		System.out.println("display");
		aq.display();
		
	}

}
