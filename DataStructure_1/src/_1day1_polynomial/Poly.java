package _1day1_polynomial;

import java.util.Scanner;

public class Poly {
	Term head;
	int count;
	
	public void Poly()
	{
		head=null;
		count=0;
		
	}
	
	void create(int n)
	{
		Scanner sc = new Scanner(System.in);
		int cof;
		int exp;
		Term newnode;// created1 more new reference of node  ***employee e;
		
		//1create node
		//2connect it in the list
		for(int i =0;i<n;i++)
		{
			System.out.println("enter coeffient and exponent for term");
			cof = sc.nextInt();
			exp = sc.nextInt();
			
			newnode = new Term(cof,exp);//OR Node1 newnode = new Node1(data);//1created node.. next step to connect to list **(e= new
			if(head==null)
			{
				head=newnode;//2connect it in list
			}
			else
			{
				Term r = head;//make a reference to point at 1st node
				while(r.next!=null)
				{
					r=r.next;
				}
				r.next= newnode;
			}
			count++;
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
			Term r = head;
			while(r!=null)// travesel till last nade but r.next will not give output it will terminate so did
			{
				if(r.next==null)
				{
				System.out.println(r.coeff);
				}
				else
					{System.out.print(r.coeff+"x^"+r.exp+"->");
					}
				r=r.next;
				
				
			}
			
				
		}
				
	}
}
