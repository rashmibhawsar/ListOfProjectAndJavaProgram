package partice;
class node2
{
	int data;
	node2 next;
	node2()
	{
		data=0;
		next=null;
		
	}
	node2(int d)
	{
		data=d;
		next=null;
		
	}
}

class link_l
{
	node2 head;
	int count;
	public link_l() {
		head=null;
		count=0;
	}
	//************
	int size()
	{
		return count;
	}
	//*******************
	void addAtLast(int data)
	{
		node2 newnode = new node2(data);
		if(head==null)
		{
			head=newnode;
			count++;
		}
		else
		{
			node2 t = head;
			while(t.next!=null)
			{
				t=t.next;
			}
			t.next=newnode;
			count++;
		}
	}
	//**************************
	void insertatpos(int pos,int data)
	{
		node2 newnode = new node2(data);
		if(pos>count||pos<0)
		{
			System.out.println("pos is incorrect");
		}
		if(head==null)
		{
			head=newnode;
			count++;
		}
		else
		{
			node2 t = head;
			node2 r = head;

			if(pos==1)
			{
				newnode.next=head;
				head=newnode;
				count++;
				return;
				
			}
			for(int i=1;i<pos;i++)
			{
				r=t;
				t=t.next;
				
			}
			
			newnode.next= r.next;
			r.next=newnode;
			count++;
	
		}
	}
	//*************************
	void insertInSortedOrder(int data)
	{
		node2 newnode = new node2(data);
		
		if(head==null)
		{
			head=newnode;
			count++;
			return;
		}
		node2 t= head;
		node2 r= head;
		if(t.data>newnode.data)
		{
			newnode.next=head;
			head=newnode;
			count++;
			return;
			
		}
		else
		{
			
			while((t.next!=null)&&(t.data<newnode.data))
			{
				r = t;
				t=t.next;
			}
			
			if(t.data < newnode.data) {
				newnode.next=t.next; 
				t.next=newnode;
			}else {
				newnode.next=r.next; 
				r.next=newnode;
			}
				
			
			
			
		}
	
	}
	//****************************
	void deleteatfirst()
	{
		if(head==null)
		{
			System.out.println("no element to delete");
		}
		else if(head.next==null)
		{
			head=null;
			count--;
		}
		else
		{
			head= head.next;
			count--;
		}
		
	}
	//***********************
	void deleteatlast()
	{
		if(head==null)
		{
			System.out.println("no element to delete");
		}
		else 
		{
			node2 t= head;
			node2 r= head;
			while(t.next!=null)
			{
				r=t;
				t=t.next;
			}
			r.next=null;
			count--;
			
		}
	}
	
	void deletatpos(int pos)
	{
		
			if(head==null || pos<count)
			{
				System.out.println("no element to delete");
			}
			else if(head.next==null && pos==1)
			{
				head=null;
				count--;
			}
			else
			{
				node2 t =head;
				node2 r =head;
				for(int i=1;i<pos;i++)
				{
					r=t;
					t=t.next;
				}
				r.next=t.next;
			}
	}
	
	
	//***************************
	void display()

	{
		if(head==null)
		{
			System.out.println("no element to display");
		}
		else
		{
			node2 t = head;
			while(t.next!=null)
			{
				System.out.print(t.data+" ");
				t=t.next;
			}
			System.out.println(t.data);
			
		}
	}
}

public class particeSingly_LL {

	public static void main(String[] args) {
		link_l l= new link_l();
		l.insertInSortedOrder(5);
		l.insertInSortedOrder(10);
		l.insertInSortedOrder(5);
		l.insertInSortedOrder(7);
		l.insertInSortedOrder(4);
		l.insertInSortedOrder(6);
		l.insertInSortedOrder(11);
		l.insertInSortedOrder(9);
		l.deleteatfirst();
		l.deleteatlast();
		l.deletatpos(4);
		
		/*l.addAtLast(5);
		l.addAtLast(4);
		l.addAtLast(2);
		l.insertatpos(2,7);
		l.insertatpos(1,9);*/
		l.display();

	}

}
