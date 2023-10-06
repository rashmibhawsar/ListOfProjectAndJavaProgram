//calculator
package _3day;
import java.util.Scanner;


public class switch_loops {

	public static void main(String[] args) {
		int a= 10;
		int b=20;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter choice");
		System.out.println("A.. for addd,  B...sub  C....mul");
		//int choice = sc.nextInt();
		char choice =sc.next().charAt(0);
		switch(choice) {
		case'a':
		case 'A':System.out.println("add" +(a+b));
		break;
		case 'b':
		case 'B':System.out.println("sub" +(a-b));
		break;
		default:
			System.out.println("incorrect");
		}
	}

}
