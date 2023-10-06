//Q1. WAP to create a list and insert in between in Doubly_linkedlist.
package DataStructure_LabInternal;

import java.util.Scanner;


class Dnode {
	int data; 
	Dnode prev;
	Dnode next;
	public Dnode()
	{
		data=0;
		prev=null;
		next=null;
	}
	public Dnode(int data)
	{
		this.data=data;
		next=null;
		prev=null;
	}

}

public class Q1_InsertNode {
	Dnode head;
	int count;
	public Q1_InsertNode() {
		super();
		head=null;
		count=0;
		// TODO Auto-generated constructor stub
	}
	void create(int noOfNodes)
	{
		Scanner sc = new Scanner(System.in);
		int data;
		
	
		for(int i =0;i<noOfNodes;i++)
		{
			System.out.println("enter the data for node");
			data = sc.nextInt();
			
			Dnode newnode = new Dnode(data); 
			if(head==null)
			{
				head=newnode;
			}
			else
			{
				Dnode r= head;
				while(r.next!=null)
				{
					r=r.next;
				}
				r.next=newnode;
				newnode.prev=r;
			}
			count++;
		}
		
		
	}
	//****************************
	void insertInBetween(int pos,int data)
	{

		Dnode newnode = new Dnode(data);
		if(pos>=count||pos<0)
		{
			System.out.println("position is incorect");
		}

		Dnode r=head;
		Dnode t=null;
		for(int i=1;i<pos;i++)
		{
			t=r;
			r=r.next;
			
		}
		newnode.next=r;
		newnode.prev=t;
		r.prev=newnode;
		t.next=newnode;
		count++;
	}
	//*****************************
	void display()
	{
		if(head==null)
		{
			System.out.print("no element to display");
			return;
		}
		
		else
		{
			Dnode r = head;
			while(r.next!=null)
			{
				System.out.print(r.data+"<->");
				r=r.next;
			}
			System.out.print(r.data);
			System.out.println();
				
		}
				
	}
	public static void main(String[] args) {
		Q1_InsertNode q1 = new Q1_InsertNode();
		q1.create(5);
		q1.display();
		System.out.println("\n*********insert in between***");
		q1.insertInBetween(3, 9);;
		q1.display();
	}

		


}
