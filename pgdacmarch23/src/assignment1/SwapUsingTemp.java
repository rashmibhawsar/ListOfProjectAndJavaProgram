
/*Q 6   Wap to swap two numbers*/
package assignment1;
import java.util.Scanner;

public class SwapUsingTemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number1");
		int number1 = sc.nextInt();
		System.out.println("enter number2");
		int number2 = sc.nextInt();
		System.out.println("numbers before swaping is number1: " +number1+"  number2: " +number2);
		int temp = number1;
		number1= number2;
		number2 = temp;
		System.out.println("numbers after swaping is number1: " +number1+"  number2: " +number2);

		sc.close();
		// TODO Auto-generated method stub
		
         
	}

}