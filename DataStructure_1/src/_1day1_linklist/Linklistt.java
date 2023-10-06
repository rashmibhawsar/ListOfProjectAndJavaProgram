package _1day1_linklist;

import java.util.Scanner;



public class Linklistt {
	Node head;
	int count;
	
	
	public Linklistt()//empty l-l
	{
		head =null;
		count =0;
	}
	
//***************add set of elements*************	
	// if i want to create particular size of l-l at a time
	void create(int n)
	{
		Scanner sc = new Scanner(System.in);
		int data;
		Node newnode;// created1 more new reference of node  ***employee e;
		
		//1create node
		//2connect it in the list
		for(int i =0;i<n;i++)
		{
			System.out.println("enter the data for node");
			data = sc.nextInt();
			
			newnode = new Node(data);//OR Node1 newnode = new Node1(data);//1created node.. next step to connect to list **(e= new
			if(head==null)
			{
				head=newnode;//2connect it in list
			}
			else
			{
				Node r = head;//make a reference to point at 1st node
				while(r.next!=null)
				{
					r=r.next;
				}
				r.next= newnode;
			}
			count++;
		}
		
		
	}
	//***************display elements*************	
	
	void display()
	{
		if(head==null)//if my list is emty
		{
			System.out.print("no element to display");
			return;
		}
		/*else
		{
			Node r = head;
			while(r!=null)// travesel till last nade but r.next will not give output it will terminate so did
			{
				System.out.print(r.data+"->");
				r=r.next;
			}
				
		}*/ //or execute below1 both works same
		else
		{
			Node r = head;
			while(r.next!=null)// travesel till last nade but r.next will not give output it will terminate so did
			{
				System.out.print(r.data+"->");
				r=r.next;
			}
			System.out.print(r.data);
			System.out.println();
				
		}
				
	}
	//***************add  elements at last *************
	void insertatlast(int d)
	{
		Node newnode =new Node(d);
		if(head==null) {
			head=newnode;
		}
		else
		{
			Node r= head;
			while(r.next!=null)
			{
				r=r.next;
			}r.next=newnode;
		}count++;
		
	}
	
	

	
	
	int size()
	{
		return count;
		
	}
	//***************add elements at first *************	
	void inseratbeg(int d)
	{
		Node newnode = new Node(d);
		newnode.next=head;
		head=newnode;
		count++;
		
	}
	//***************add elements at pos *************
	void inserinbetween(int d,int pos)
	{
		if(count< 2 || pos>=count)
			System.out.println("cant inser in bewteen");
		else
		{

		Node newnode = new Node(d);
		Node r= head;
		for(int i=1;i<pos;i++)
		{
			r= r.next;
		}
		newnode.next= r.next;
		r.next=newnode;
		count++;
		}
	}
	//***************delete element at last*************	
	void deletionatlast() 
	{
		//create a reference which points to the node which we want to delet

		if(head==null)//if my list is emty
		{
			System.out.print("no element to delete");
			return;
		}
		else
		{
			Node t= head;
			if(t.next==null) 
			{
				head=null;
			}
			else
			{
				Node r=null;
				while(t.next!=null)
				{
					r=t;
					t=t.next;
				}
				r.next=null;
			}
			count--;
	
		}

	}
	//***************delete element at beg *************	
	void deleteatbeg()
	{
		if(head==null) {
			System.out.println("list is empty");
		}
		else
		{
			Node t= head;
			if(t.next==null) 
			{
				head=null;
			}
			else
			{
				head=t.next;
			}count--;
			
		}
	}
	//***************delete element at pos *************
	void removinbetween(int pos)
	{
		if(pos>=count ||count<2)
			System.out.println("invalid pos");
		else
		{
			Node t= head;
			Node r= null;
			for(int i=1;i<pos;i++)
			{r=t;
			t=t.next;
				
			}
			r.next=t.next;
			count--;
		}
			
		
	}
	//***************search elements*************
	void search(int value)
	{
		if(head==null) {
			System.out.println("list is empty");
		}
		else
		{
			Node r = head;
			boolean flag = false;
			int position = 0;
			while(r!=null)
			{
				if(r.data ==value)
				{
					System.out.println("data found at " +position);
					flag= true;
					break;
				}
				position++;
				r=r.next;
					
			}
			if(!flag)
				System.out.println("data not found");
		}
		
	}
	//***************reverse element *************
	void reverse()
	{
		Node prev,curr,temp;
		
		temp=head;
		curr=null;
		while(temp!=null)
		{
			prev=curr;
			curr=temp;
			temp=temp.next;
			curr.next=prev;
			
		}
		head=curr;
	}
		
	//***************add elements in sorted order*************	
	void insertInSortedOrder(int data)
	{
		Node newnode = new Node(data);
		
		if(head==null)
		{
			head=newnode;
			count++;
			return;
		}
		Node t= head;
		Node r= head;
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
				//newnode.next=t.next; 
				t.next=newnode;
			}else {
				newnode.next=r.next; 
				r.next=newnode;
			}
				
			
			
			
		}
	
	}

	public void concatelinkList(Linklistt l2) {

		if(l2==null) {
			return;
		}
		else
		{
			Node r= head;
			while(r.next!=null)
			{
				r=r.next;
			}
			r.next=l2.head;
		}
		
	}


	

	
	
}
