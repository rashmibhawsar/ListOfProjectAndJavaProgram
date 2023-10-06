package _5day;

import java.util.Scanner;

public class switch_calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number1");
		int number1 = sc.nextInt();
		System.out.println("enter number2");
		int number2 = sc.nextInt();
		System.out.println("enter choice");
		System.out.println("1.. for add");
		System.out.println("2.. for sub");
		System.out.println("3.. for mul");
		int choice =sc.nextInt();
		switch(choice) {
		
		case 1:System.out.println("add :" +(number1+number2));
		break;
		
		case 2:System.out.println("sub :" +(number1-number2));
		break;
		
		case 3:System.out.println("mul :" +(number1*number2));
		break;
		default:
			System.out.println("exit");
		}
	}

}
