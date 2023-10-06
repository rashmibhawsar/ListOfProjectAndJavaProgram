package DataStructure_LabInternal;

class Node
{
	int data; 
	Node next;
	public Node()
	{
		data=0;
		next=null;
	}
	public Node(int data)
	{
		this.data=data;
		next=null;
	}
	

}

public class Q2_QueueLL {
	Node front;
	Node rear;
	public Q2_QueueLL() {
		front=null;
		rear=null;
		// TODO Auto-generated constructor stub
	}
	 boolean isEmpty()
	 {
		 if(front==null)
			 return true;
		 else
			 return false;
	 }
	 
	void enqueue(int value)
	{
		Node newnode= new Node(value);
		
		if(rear==null)
		{
			rear= newnode;
			front=newnode;
		}
		else
		{
			rear.next= newnode;
			rear= newnode;
		}
			
	}
	void display()
	{
		if(isEmpty())
			System.out.println("no elements in a queue");
		else
		{
			Node t = front;
			while(t!= null)
			{
				System.out.print(t.data +" ");
				t=t.next;
			}
			System.out.println();
			
		}
	}
	void remove()
	{
		if(isEmpty())
			System.out.println("no element in a queue");
		else
		{
			int data = front.data;
			front = front.next;
			System.out.println("element deleted "+data);
		}
		
		
	}
	void peek()
	{
		if(isEmpty())
			System.out.println("no element in queue");
		else
		{
			System.out.println("peek: "+front.data);
			
		}
		
	}
	
	public static void main(String args[])
	{
		Q2_QueueLL q2= new Q2_QueueLL();
		q2.enqueue(1);
		q2.enqueue(2);
		q2.display();
		q2.peek();
		q2.enqueue(3);
		q2.enqueue(4);
		q2.enqueue(5);
		q2.display();
		q2.remove();
		q2.peek();
		
		
		
	}
	

}
