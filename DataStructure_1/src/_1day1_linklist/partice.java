package _1day1_linklist;

import java.util.Scanner;

class Node1{
	int data;
	Node1 next;
	public int date;
	public Node1() {
		data= 0;
		next= null;
		
	}
	public Node1(int data) {
		
		this.data = data;
		next = null;
		
	}
	
	
}
class ll
{
	Node1 head;
	int count;
	public ll()
	{
		head= null;
		count =0;
	}
	
	
	/**/
	
	
	
	public void insertat(int data,int pos)
	{
		  if(pos > count || pos < 0) {
	           System.out.println("Invalid Index value");
	           return;
	       }
	       count++;
		Node1 newNode = new Node1(data);
	    
	      if(head == null ) {
	          // newNode.next = head;
	           head = newNode;
	          // return;
	       }
	      else
	      {
	  		Node1 r=head;
			for(int i=1;i<=count;i++)
			{
				if(i==pos)
				{
					Node1 t=r.next;
					r.next=newNode;
					newNode.next=t;
					//newNode.next=r;
					break;
					
				}
				r=r.next;
			}
	      }


	}
	public void display()
	{
		
		
		if(head==null)
		{
			System.out.println("no element to display");
		}
		else{
			Node1 r=head;
			while(r.next!=null)
			{
				System.out.print(r.data+"->");
				r=r.next;
			}
			System.out.println(r.data);
			
		}
			
	}
	
	
	public void create1(int data)
	{
		
			Node1 newnode = new Node1(data);
			Node1 r= head;
			if(head ==null)
			{
				head=newnode;
			}
			else if(head.next==null)
			{
				
				if(r.data>newnode.date)
				{
					newnode.next=r.next;
					r=newnode;
				}
				else
				{
					r.next=newnode;
				}
			}
			else if(r.next!=null)
			{
				Node1 t = head;//make a reference to point at 1st node
				for(int i=0;i<count;i++)
				{
					if(t.data>newnode.date)
					{
						newnode.next=t.next;
						t=newnode;
					}
					else
					{
						t.next=newnode;
					}
					r=r.next;
				
			}count++;
			}

	}
	
}
public class partice {

	public static void main(String[] args) {

		ll obj= new ll();
		obj.create1(5);
		//obj.create1(6);
		//obj.create1(4);
		//obj.create1(7);
		obj.insertat(20, 0);
		obj.insertat(21, 1);
		obj.insertat(19, 1);
		obj.insertat(15, 2);
		obj.display();
		

	}

}
/*void insertatany(int pos) {
	Node newnode=null;
	System.out.println("enter the data");
	Scanner s=new Scanner(System.in);
	int data = s.nextInt();
	newnode=new Node(data);
	if(pos==1) {
		newnode.next=head;
		head=newnode;
	}else {
		Node p=head;
		int x=1;
		while(p.next!=null && x!=pos-1) {
			p=p.next;
			x++;
		}
		if(x==pos-1) {
			newnode.next=p.next;
			p.next=newnode;
		}
	}
}
	
}*/
