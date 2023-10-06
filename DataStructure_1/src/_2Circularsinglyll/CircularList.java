package _2Circularsinglyll;

import java.util.Scanner;

public class CircularList {
	Node head;// points first node
	Node last;// points last node
	int count;
	
	public CircularList() {
		head=null;
		last=null;
		count=0;

	}
	void create(int noofNodes)
	{
		Scanner sc = new Scanner(System.in);
		int data;
		Node newnode;
		
		//1create node
		//2connect it in the list
		for(int i =0;i<noofNodes;i++)
		{
			System.out.println("enter the data for node");
			data = sc.nextInt();
			

			{
				newnode = new Node(data);
				if(head==null)// of only 1 node
				{
					head=newnode;
					//last=newnode;
					//last.next=head;
					//count++;	
				}
				else
				{	last.next= newnode;
					//last=newnode;
					//last.next=head;
					//count++;

				}
				last= newnode;
				last.next=head;
				count++;
				
			}
			}
		
	}
	void display()
	{
		if(head==null)//if my list is emty
		{
			System.out.print("no element to display");
			return;
		}

		else
		{
			Node t = head;
			do{
				System.out.print(t.data+"->");
				t=t.next;
				
			}while(t.next!=head);
			System.out.print(t.data);
		
		}
				
	}
	void addfirst(int data)
	{
		Node newnode = new Node(data);
		if(head==null)// of only 1 node
		{
			last=newnode;
			head=newnode;
			last.next=head;
		}
		else
		{
			newnode.next=head;// head contains address of my 1st node adress that is stored in newnode.next
			head=newnode;
			last.next=head;
		}
		
//		head=newnode;
//		last.next=head;
		count++;

	}
	void addlast(int data)
	{
		Node newnode = new Node(data);
		if(head==null)// of only 1 node
		{
			head=newnode;
			//last=newnode;
			//last.next=head;
			//count++;	
		}
		else
		{	last.next= newnode;
			//last=newnode;
			//last.next=head;
			//count++;

		}
		last= newnode;
		last.next=head;
		count++;
		
	}
	void removelast()
	{
		
		if(head==null)
		{
			System.out.println("nothing to delete");
		}
		else {
			if(head==last)//if only 1node
			{
				head=last=null;
			}
			else
			{
				Node t= head;
				while(t.next!=last)
				{
					t=t.next;
				}
				last=t;
				last.next=head;
			}
			count--;
		}
		
	}
	void removefirst()
	{
		if(head==null)
			{
				System.out.println("nothing to delete");
			}
			else {
				if(head==last)//if only 1node
				{
					head=last=null;
				}
				else
				{
					head=head.next;
					last.next=head;
				}
	}

}
}
