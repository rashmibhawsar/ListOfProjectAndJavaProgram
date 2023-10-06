
/*Q 7  How to swap two numbers without using a third variable?*/
package assignment1;
import java.util.Scanner;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number1");
		int num1 = sc.nextInt();
		System.out.println("enter number2");
		int num2 = sc.nextInt();
		System.out.println("numbers before swaping is number1: " +num1+"  number2: " +num2);
		
		num1 = num1*num2;
		num2 = num1/num2;
		num1 = num1/num2;		

		System.out.println("numbers after swaping is number1: " +num1+"  number2: " +num2);

		sc.close();
		// TODO Auto-generated method stub
		
         
	}

}
