package day15_innerClas;

import java.util.Scanner;

public class fullname {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 System.out.println("ENTER NAME");
		 String name = sc.next();
		 String s[]=name.split(" ");
		 for(String k:s) {
			 System.out.println(k);
		 }

		
	}
	

	String fullname;

}
