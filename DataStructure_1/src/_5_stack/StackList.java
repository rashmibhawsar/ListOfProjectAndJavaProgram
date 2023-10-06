package _5_stack;
class Node {
	int data; // if u want string as data change to string.. or user defined obj
	Node next;//Self Referencing class
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


public class StackList {
	Node top;// consider this is head
	public StackList() {
		top=null;
	}
	boolean isEmpty()
	{
		if(top==null)
			return true;
		else
			return false;
		
	}
	
	void push(int value)
	{
		Node newnode = null; // this is becz my heap will get full,if three is no memory in my heap, but this is not possible in case of java.. becz we have garbage collection.. but this is rule to follow
		newnode= new Node(value);
		if(newnode == null)
		{
			System.out.println("stack overflow");// check this is dead code
		}
		if(top==null)
			top=newnode;
		else
		{
			newnode.next=top;
			top=newnode;
		}
	}
	
	void pop()
	{
		if(isEmpty())
			System.out.println("stack underflow");
		else
		{
			System.out.println("pop :" +top.data);
			top= top.next;//head= head.next;
		}
	}
	
	
	void peek()
	{
		int data;
		
		if(isEmpty())
			System.out.println("stack underflow");
		else
		{
			data = top.data;
			System.out.println("peek the element is : " +data);
		}
	
	}
	void display()
	{
		int data;
		if(isEmpty())
			System.out.println("stack underflow");
		else
		{
			Node t = top;
			while(t!=null) {
				System.out.println(t.data);
				t= t.next;
			}
		}
		
		
	}

	public static void main(String[] args) {
		StackList sl= new StackList();
		sl.push(1);
		sl.push(2);
		sl.push(3);
		sl.push(4);
		sl.push(5);
		sl.display();
		sl.peek();
		sl.pop();
		sl.pop();
		sl.display();
		sl.peek();
		

	}

}
