package _7_Queue;

class CNode
{
	int data; // if u want string as data change to string.. or user defined obj
	Node next;//Self Referencing class
	public CNode()
	{
		data=0;
		next=null;
	}
	public CNode(int data)
	{
		this.data=data;
		next=null;
	}
}

public class LinkList_Cqueue {
	Node front;//refer to inserted node;
	Node rear;// refer to last inserted
	public LinkList_Cqueue() {
		front=null;
		rear=null;
		
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
				rear.next=front;
			}
			else
			{
				rear.next= newnode;
				rear= newnode;
				rear.next=front;
			}
				
		}
		void display()
		{
			if(isEmpty())
				System.out.println("no element in queue");
			else
			{
				Node t = front;
				while(t!= rear)
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
				System.out.println("no element in queue");
			else
			{
				int data = front.data;
				front = front.next;
				System.out.println("elemented deleted "+data);
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
			LinkList_Cqueue lq= new LinkList_Cqueue();
			lq.enqueue(5);
			lq.enqueue(4);
			lq.enqueue(3);
			lq.enqueue(2);
			lq.enqueue(1);
			lq.enqueue(6);
			lq.display();
			lq.remove();
			lq.display();
			lq.peek();
			
		}
		
}
	


