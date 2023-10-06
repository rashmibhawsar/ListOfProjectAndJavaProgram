package _9day;

import java.util.Scanner;

public class Admin {
	static String code;
	static void banner()
	{
		code = "asvbgetyui";
	}
	public static void main(String args[]) {
		Admin a= new Admin();
		a.input();
		Admin.banner();
		a.display();
		
		
	}
	
	String email;
	String name;
	void display()
	{
		System.out.println(name);
		System.out.println(email);
		System.out.println(code);
	}
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		name = sc.next();
		System.out.println("enter email");
		email = sc.next();
		//System.out.println("enter code");
		//code = sc.next();
	}

}
