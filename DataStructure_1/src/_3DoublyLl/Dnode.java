package _3DoublyLl;

public class Dnode {
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
