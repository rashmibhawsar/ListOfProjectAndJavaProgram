package day22Collections_Queue_Map;



	//use of tostring.... by default s.o.pln(e) gives address. you can override that tostring method
	import java.util.HashSet;

	import java.util.Iterator;
	import java.util.LinkedHashSet;
	import java.util.*;
	class Employeeq
	{
		String ename;
		int id;
		float salary;
		Employeeq(int a,String b,float c)



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

	/*class Alpha implements Comparator<Employee>{

		public int compare(Employee i,Employee j) {
			if(i.id>j.id)
				return 1;
			else
				return -1;
			
		}
			 
		
	}*/

	public class TreeMapUsingComparator {

		public static void main(String[] args) {



			 
			Employeeq e= new Employeeq(1,"neha",45050);
			//System.out.println(e);  //call toString method of class
			Employeeq e1= new Employeeq(2,"amit",45500);
			Employeeq e2= new Employeeq(3,"ashu",45400);
			Employeeq e3= new Employeeq(4,"gagan",452000);
			Employeeq e4= new Employeeq(5,"priya",452400);
			
			//TreeSet<Employee> s= new TreeSet<Employee>();
			TreeMap<Integer,Employeeq> s= new TreeMap<Integer,Employeeq>();
			s.put(1,e);
			s.put(5,e1);
			s.put(4,e2);
			s.put(3,e3);
			s.put(7,e4);
			
//			System.out.println(s.remove(e));
			Set p= s.entrySet();
			Iterator i= p.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
		
	

		}

	}


