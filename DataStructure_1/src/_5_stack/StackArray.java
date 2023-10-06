package _5_stack;

public class StackArray {
	int arr[];
	int top;//last inserted element index;
	int max;//maximum stack size;
	public StackArray()
	{
		max=10;
		top=-1;
		arr =new int[max];
	}
	public StackArray(int size)
	{
		max=size;
		top=-1;
		arr =new int[max];
	}
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
		{
			return false;
		}
	}
	boolean isFull()
	{
		if(top==max-1)
			return true;
		else
			return false;
		
	}
	void push(int value)
	{
		if(isFull())
		{
			System.out.println("stack overflow");
		}
		else
		{
			top= top+1;
			arr[top]=value;;
		}
	}
	int pop()
	{
		int data= 0;
		if(isEmpty())
		{
			System.out.println("stack is underflow");
		}
		else
		{
			data=arr[top];
			arr[top]=0;
			top = top-1;
		}
			return data;
	}
	void peek()// to check which element is at top
	{
		int data= 0;
		if(isEmpty())
		{
			System.out.println("stack is underflow");
		}
		else
		{
			data=arr[top];
			System.out.println("data "+data);
			
		}
			
	}
	void display()
	{
		if(isEmpty())
	System.out.println();
		else
		{
			for(int i =0;i<=top;i++)
			{
			System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args)
	{
		StackArray s = new StackArray();
		s.push(1);
		s.peek();
		s.push(2);
		s.peek();
		s.push(3);
		s.display();
		
		
		
	}

}
