package day21Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkListEmployeeExample {

	public static void main(String[] args) {


		Student s1= new Student();
		s1.getinfo();
		Student s2= new Student();
		s2.getinfo();
		Student s3= new Student();
		s3.getinfo();
		Student s4= new Student();
		s4.getinfo();
		Student s5= new Student();
		s5.getinfo();

		LinkedList<Student> l= new LinkedList<Student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);   //		System.out.println(s.remove(e));
		Iterator<Student> i= l.iterator();
		while(i.hasNext()){
			System.out.println(i.next());}

	}

}

class Student
{
	int marks;
	String name;
	int roll_no;

	void getinfo(){


		Scanner sc = new Scanner(System.in);
		System.out.println("enter student name");
		name = sc.next();
		System.out.println("enter roll no");
		roll_no = sc.nextInt();
		System.out.println("enter marks");
		marks = sc.nextInt();}
	
	public String toString(){

		return  name +"  " +roll_no+ " "+ marks;
	}
}