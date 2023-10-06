package _8day;

import java.util.Scanner;

public class student_class {
	int age;
	int marks;
	String name;
	int roll_no;
	
	void display() {
		System.out.println(name);
		System.out.println(roll_no);
		System.out.println(age);
		System.out.println(marks);
	}
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		name = sc.next();
		System.out.println("enter rollno");
		roll_no = sc.nextInt();
		System.out.println("enter age");
		age = sc.nextInt();
		System.out.println("enter marks");
		marks = sc.nextInt();
	}

}
