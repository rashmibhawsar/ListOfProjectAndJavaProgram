package partice;

class Node1
{
	int data;
	Node1 next;
	Node1()
	{
		data=0;
		next=null;
		
	}
	Node1(int d)
	{
		data=d;
		next=null;
		
	}
}
//#################################################################
class CircularLl
{
	Node1 head;
	Node1 last;
	int count;
	public CircularLl() {
		head=last=null;
		count=0;
	}
	void insertatfirst(int data)
	{
		Node1 newnode = new Node1(data);
		if(head==null)
		{
			head= newnode;
			last= newnode;
			last.next=head;
		}
		else
		{
			newnode.next = head;
			head=newnode;
			last.next=head;
		}
		count++;
		
	}
//******************************
	void insertatlast(int data)
	{
		Node1 newnode = new Node1(data);
		if(head==null)
		{
			head= newnode;
			last= newnode;
			last.next=head;
		}
		else
		{
			
			last.next=newnode;
			last = newnode;
			last.next=head;
			
			
		}
		count++;
	}
//***********************************
	void insertatpos(int pos,int data)
	{
		Node1 newnode = new Node1(data);
		if(pos>count||head==null)
		{
			System.out.println("pos is incorrect");
		}
		if(pos==1)
		{
			newnode.next=head;
			head= newnode;
			last.next=head;
			count++;
		
			
		} 
		 else
		  {
			Node1 t =head;
			Node1 r =head;
			for(int i=1;i<pos;i++)
			{
				r=t;
				t=t.next;
			}
			newnode.next=r.next;
			r.next=newnode;
		}
	}
	
//************************************
	void display()
	{
		if(head==null)
		{
			System.out.println("no element to display");
		}
		else
		{
			Node1 t = head;
			while(t.next!=head)
			{
				System.out.print(t.data+" ");
				t=t.next;
			}
			System.out.println(t.data);
			
		}
	}
	
	
}

//#################################################################
public class ParticeCircularLL {
	public static void main(String[] args) {
		CircularLl cl= new CircularLl();
		cl.insertatfirst(5);cl.display();
		cl.insertatfirst(4);cl.display();
		cl.insertatfirst(6);cl.display();
		cl.insertatlast(2);cl.display();
		cl.insertatlast(1);cl.display();
		cl.insertatpos(3,9);cl.display();
		cl.insertatpos(1,7);
		cl.display();
		
	}

}
