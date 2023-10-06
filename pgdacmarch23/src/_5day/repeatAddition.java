/*Q 4 Write a do-while loop that asks the user to enter two numbers.
 *  The numbers should be added and the sum displayed.
 *   The loop should ask the user whether he or she wishes to perform the operation again.
 *  If so, the loop should repeat; otherwise it should terminate.(while loop)*/
package _5day;

import java.util.Scanner;

public class repeatAddition {

	public static void main(String[] args) {
		boolean status = false;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number1");
			int number1 = sc.nextInt();
			System.out.println("enter number2");
			int number2 = sc.nextInt();
			System.out.println("the addition of two no is  :" +(number1+number2));
			System.out.println("you want to continoue? \n if yes enter :true  else enter false" );
			status = sc.nextBoolean();
		}while(status);
		if(status==false)
			System.out.println("exit");

		// TODO Auto-generated method stub

	}

}
