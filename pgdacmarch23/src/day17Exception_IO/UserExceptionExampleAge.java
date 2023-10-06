package day17Exception_IO;

import java.util.Scanner;

class student extends Exception{
	int age;
	String course;
	String name;
	int roll_no;
	student(){
		System.out.println("age should be between 15 to 21");
	}
	
	student(String name){
		System.out.println("enter ony alphabets...." +name);
	}
	void getData() throws student{
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		 System.out.println("enter roll_no");
		 roll_no = sc.nextInt();
		 System.out.println("enter student name ");
		 name = sc.next();
		try{
			if((!name.equals(""))&&(name!= null)&&(name.matches("^[a-zA-Z]*$")))
				System.out.print("");
		else
			throw new student(name);
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
			
		}
		
		 System.out.println("enter student course ");
		 course = sc.next();
 
		 System.out.println("enter student age");
		 age = sc.nextInt();
		 if(age>=15 && age<=21)
			 System.out.print("");
		 else
			 throw new student();
		 

		}
	
	
	void showData(){

		System.out.println("student roll_no is ...: "+roll_no);
		System.out.println("student Name is... : "+name);
		System.out.println("student age is ...: "+age);
		System.out.println("student course is ...: "+course);
		}
	
}
public class UserExceptionExampleAge {

	public static void main(String[] args) throws student {
		student s = new student();
		try{
			s.getData();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		s.showData();

	}

}
