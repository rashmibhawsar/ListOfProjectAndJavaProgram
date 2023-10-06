package _3DoublyLl;

import java.util.Scanner;


public class Doublyll {
	Dnode head;
	int count;
	public Doublyll()
	{
		head=null;
		count=0;
	}
//*********************insert set of elements********************
	void create(int noOfNodes)
	{
		Scanner sc = new Scanner(System.in);
		int data;
		
	
		for(int i =0;i<noOfNodes;i++)
		{
			System.out.println("enter the data for node");
			data = sc.nextInt();
			
			Dnode newnode = new Dnode(data);//OR Node1 newnode = new Node1(data);//1created node.. next step to connect to list **(e= new
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
//**********************add atlast**********************

	void addlast(int data)
	{

		Dnode newnode = new Dnode(data);//OR Node1 newnode = new Node1(data);//1created node.. next step to connect to list **(e= new
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
//********************addfirst***********************
	void addfirst(int data)
	{
		Dnode newnode = new Dnode(data);
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			newnode.next=head;
			head.prev=newnode; //newnode.next.prev=newnode;
			head=newnode;
		}
		count++;
	}
//*****************insertatpos************************
	void inseratpos(int pos,int data)
	{

		Dnode newnode = new Dnode(data);
		if(pos>=count||pos<0)
		{
			System.out.println("pos is incorrect");
		}
		/*if(head==null)
		{
			head=newnode;
			count++;
		}*/
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
//*************************display********************	
	void display()
	{
		if(head==null)//if my list is emty
		{
			System.out.print("no element to display");
			return;
		}
		
		else
		{
			Dnode r = head;
			while(r.next!=null)// travesel till last nade but r.next will not give output it will terminate so did
			{
				System.out.print(r.data+"<->");
				r=r.next;
			}
			System.out.print(r.data);
			System.out.println();
				
		}
				
	}
//*****************display in reverse*************************
	void displayreverse()
	{
		if(head==null)//if my list is emty
		{
			System.out.print("no element to display");
			return;
		}
		
		else
		{
			Dnode r = head;
			Dnode last=null;
			while(r!=null)// travesel till last.. and point last pointer to last node
			{
				last =r;
				r=r.next;
				
			}
			
			System.out.println(" reverese of doubly linklist");
			while(last!=null)
			{
				System.out.print(last.data+"<->");
				last= last.prev;
				
			}
			System.out.println("null");
			head= last;
				
		}
				
	}
	
//********************delete at last*******
	void deleteatlast()
	{

		if(head==null)//if my list is emty
		{
			System.out.print("no element to delete");
			return;
		}
		else
		{
			Dnode t= head;
			if(head.next==null) //only1 node
			{
				head=null;
				count--;
			}
			else
			{
				while(t.next.next!=null)
				{
					t=t.next;
	
				}
				t.next=null;
				count--;
			}
				
		}
	}
	//********************delete at first*******
	
	void deleteatfirst()
	{

		if(head==null)//if my list is emty
		{
			System.out.print("no element to delete");
			return;
		}
		else
		{
			if(head.next==null) //only1 node
			{
				head=null;
			}
			else {
				head=head.next;
				head.prev=null;
			}
		}
	

	}
	//********************delete at position*******	
	void deleteatpos(int pos)
	{
		if(pos>=count||pos<0)
		{
			System.out.println("pos is incorrect");
		}
		else
		{
			Dnode t = head;
			for(int i=1;i<pos;i++)
			{
				t=t.next;
				
			}
			t.prev.next=t.next;
			t.next.prev=t.prev;
			
		}
	}
	
}
