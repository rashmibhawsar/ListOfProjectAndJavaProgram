package partice;

import java.util.Scanner;

import _2Circularsinglyll.Node;
import _3DoublyLl.Dnode;

class DNode1
{
	int data;
	DNode1 next;
	DNode1 prev;
	
	DNode1()
	{
		data=0;
		next=null;
		prev=null;
		
	}
	DNode1(int d)
	{
		data=d;
		next=null;
		prev=null;
		
	}
}

class DoublluCLL{
	
	DNode1 head;
	DNode1 last;
	int count;
	public DoublluCLL() {
		count =0;
		last=null;
		head= null;
	}
	 void create(int n)
	 {
		 Scanner sc = new Scanner(System.in);
			int data;
			//2connect it in the list
			for(int i=0;i<n;i++)
			{
				System.out.println("enter the data for node");
				data = sc.nextInt();
				

				{
					DNode1 newnode = new DNode1(data);
					if(head==null)// of only 1 node
					{
						head=newnode;
						last=newnode;
						last.next=head;
						head.prev=last;
						
						count++;	
					}
					else
					{
					
						last.next=newnode;
						last=newnode;
						last.next = head;
						head.prev=newnode;
						
						
					}
				}
			}
				
		 
	 }
	 
	 void display() {
			
				if(head==null)//if my list is emty
				{
					System.out.print("no element to display");
					return;
				}
				
				else
				{
					DNode1 r = head;
					while(r.next!=head)// travesel till last nade but r.next will not give output it will terminate so did
					{
						System.out.print(r.data+"<->");
						r=r.next;
					}
					System.out.print(r.data);
					
					System.out.println();
						
				}
						
			}
		 
		 }
	
	

public class DoublyCircularLl {
	public static void main(String[] args) {
		DoublluCLL cl = new DoublluCLL();
		cl.create(3);
		cl.display();

}
}
