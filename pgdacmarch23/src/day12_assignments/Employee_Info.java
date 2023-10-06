/*Q 2 Write a program by creating an 'Employee' class
 *  having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, 
      number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds 10000 to salary of the employee 
if it is less than 50000.
3 - 'AddWork()' which adds 5000 to salary of employee 
if the number of hours of work per day is more than 6 hour
 * 
 * 
 */
package day12_assignments;

import java.util.Scanner;

public class Employee_Info {
	public static void main(String[] args) {


		Employee_Info e = new Employee_Info();

		e.getinfo();
		e.addSal();
		e.addWork();
		
		}
	public int hour;
	public int salary;
	 Scanner sc = new Scanner(System.in);
	 
	public void addSal(){




		if(this.salary<50000) { 
			int new_salary = this.salary+10000;
		System.out.println(" extra 10000rs as ur salary is <50000: " +new_salary);
		}
		else 
			System.out.println(" ur salary is : " +this.salary);
			
	}
				
	
	public void addWork(){


		
		if(this.hour>6) {
			
			System.out.println(" you got bonus of 5000rs");
		}
		}
	

	void getinfo(){





		System.out.println("enter ur salary ");
		salary = sc.nextInt();
		System.out.println("enter ur working hour ");
		hour = sc.nextInt();
		
		}
  }
