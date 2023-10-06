
//calculator
package _3day;
import java.util.Scanner;


public class switch_2 {

	public static void main(String[] args) {

		int a= 10;
		int b=20;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter choice");
		System.out.println("start:sunday.\n  work: monday  \n load : tuesday ");
		//int choice = sc.nextInt();
		String choice =sc.next();
		switch(choice) {
		
		case "work":System.out.println(" oh its monday");
		break;
		case "start":System.out.println("wow sunday");
		break;
		case "load":System.out.println("its tuesday");
		break;
		default:
			System.out.println("incorrect input");
		}
	}

}
