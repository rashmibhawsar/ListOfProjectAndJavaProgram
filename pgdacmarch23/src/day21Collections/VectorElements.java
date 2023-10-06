package day21Collections;

import java.util.*;

class Employee 
{
	int id;
	String name;
	
	public Employee(int id,String name) {
		this.name=name;
		this.id=id;}
	
		public String toString(){
			return id+ " "+ name +"  ";
		}
}
public class VectorElements {

	public static void main(String[] args) {
			/*display hashaddress without including toString()*/
			//System.out.println(e);  //call toString method of class
		    Employee e= new Employee(1,"riya");
			Employee e1= new Employee(2,"rashmi");
			Employee e2= new Employee(3,"siya");
			Employee e3= new Employee(4,"cherry");
			Employee e4= new Employee(5,"rupesh");
			
			Vector<Employee> s= new Vector<Employee>();
			s.add(e);
			s.add(e1);
			s.add(e2);
			s.add(e3);
			s.add(e4);
			
			System.out.println("value store in position 1...:"+s.get(1));
			System.out.println("size:  "+s.size());//print size
			System.out.println("capacity:  "+s.capacity());//print capacity
			//Employee e6= new Employee(7,"null");
			s.add(null);//adding element at index 0
			System.out.println("checking null..checking.."+s);
			System.out.println("index value of null "+s.indexOf(null));//index of null element
			Employee e5= new Employee(8,"ruchi");
			s.add(0, e5);//adding element at index 0
			System.out.println("added element e5 at index0 ...checking "  +s);////calls toString method by default;
			s.insertElementAt(e3, 0);
			System.out.println("inserted element e5..checking..."+s);
			s.remove(e5);
			System.out.println("element removed (ruchi)..checking.."+s);
			
	
			
			 /* Iterator<Employee> i= s.iterator();
			while(i.hasNext()){
				System.out.println(i.next());}*/
			
		/*Vector<String> l= new Vector<String>();
		/*l.add(" rashmi");
		l.add("reya");
		l.add("chreey");
		l.add("siya");
		l.add("rupesh"); 
		System.out.println(l);*/
		/*Iterator<Student> i= l.iterator();
		while(i.hasNext()){
			System.out.println(i.next());}*/
	
		

	}

}