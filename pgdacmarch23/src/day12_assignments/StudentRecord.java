/*Q 6 Create a class named 'StudentRecord' with 
 * String variable 'sname' and integer variable 'roll_no'.
Assign the value of roll_no as '2' 
and that of name as "John" while creating an object of the class Student.
and using display method show all values on console*/
package day12_assignments;

import java.util.Scanner;

class StudentDetails{
	public int roll_no[]= {1,2,3,4,5};
	public String sname[] = {"rashmi","siya","bhagya","ravi","pink"};
	

	public StudentDetails( int roll_no,String sname) {
		//super();
		for (int i=0;i<5;i++) {
			if(i+1 == roll_no) {
				this.sname[i+1] = sname;
				}
			}
}
	void display() {
		for(int i=0;i<5;i++) {
			System.out.println("roll no :" +roll_no[i] +"name :"+sname[i] );
		}
	}
		
}


public class StudentRecord {

	public static void main(String[] args) {
		StudentDetails s = new StudentDetails(2,"JOHN");
		s.display();
	}
		

	}


