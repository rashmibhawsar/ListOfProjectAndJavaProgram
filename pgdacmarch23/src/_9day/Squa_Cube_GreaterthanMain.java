package _9day;

import java.util.Scanner;

public class Squa_Cube_GreaterthanMain {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int choice1=0;

		Squa_Cube_Greaterthan scg = new Squa_Cube_Greaterthan();
		
		System.out.println(" enter choice \n1) cube\r\n"
				+ "2) square\r\n"
				+ "3) greater");
		int choice = sc.nextInt();	
		do{
			
			switch (choice) {
			case 1:scg.cube(5);
				break;
			case 2:scg.square(5);
			break;
			case 3:scg.greater(5, 10, 15);
			break;
			default:System.out.println(" invalid input");
				break;
			}	
			
			System.out.println( " enter choice \n1) cube\r\n"
					+ "2) square\r\n"
					+ "3) greater");
			 choice = sc.nextInt();
		}while(choice>0);	
	}
}
