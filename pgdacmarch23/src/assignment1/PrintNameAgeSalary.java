
/*Q 3 WAP to ask name ,age and salary of an employee and print on console.*/
package assignment1;
import java.util.Scanner;

public class PrintNameAgeSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter age");
		int age = sc.nextInt();
		System.out.println("enter salary");
		double salary = sc.nextDouble();
		System.out.println("entered name: " +name);
		System.out.println("entered age: " +age);
		System.out.println("entered name: " +salary);
		sc.close();
		// TODO Auto-generated method stub
         
	}

}
