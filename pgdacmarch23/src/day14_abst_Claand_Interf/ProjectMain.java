package day14_abst_Claand_Interf;

import java.util.Scanner;

public class ProjectMain {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("enter choice");
		System.out.println("1.. for xyz project,  2...abc project  ");
		
		int choice =sc.nextInt();
		switch(choice) {
		case 1:
			Project x = new XyzProject();
			x.addProjectDetails();
			x.displayProjectDetails();
			break;
		
		case 2 :
			x = new AbcProject();
			x.addProjectDetails();
			x.displayProjectDetails();
			break;
			
		
		
		default:
			System.out.println("incorrect");
		}

		// TODO Auto-generated method stub
	}

}
