package day22Collections_Queue_Map;



//use of tostring.... by default s.o.pln(e) gives address. you can override that tostring method
import java.util.HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.*;
class Employee
{
	String ename;
	int id;
	float salary;
	Employee(int a,String b,float c)


	{
		id=a;
		ename=b;
		salary=c;
		
	}	
	public String toString()
	{
		return id+ " "+ ename +"  "+ salary;
	}
}

class Alpha implements Comparator<Employee>{
	public int compare(Employee i,Employee j) {

		if(i.id>j.id)
			return 1;
		else
			return -1;
		
	}
		 
	
}

public class priorityExampleojec {

	public static void main(String[] args) {



		 
		Employee e= new Employee(1,"neha",45050);
		//System.out.println(e);  //call toString method of class
		Employee e1= new Employee(2,"amit",45500);
		Employee e2= new Employee(3,"ashu",45400);
		Employee e3= new Employee(4,"gagan",452000);
		Employee e4= new Employee(5,"priya",452400);
		
		//TreeSet<Employee> s= new TreeSet<Employee>();
		PriorityQueue<Employee> s= new PriorityQueue<Employee>( new Alpha());
		s.add(e);
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		
//		System.out.println(s.remove(e));
	
		Iterator<Employee> i= s.iterator();
		while(i.hasNext())
		
		{
			System.out.println(i.next());
		}
		
		System.out.println("data removed is...");
		System.out.println(s.remove());

	}

}

