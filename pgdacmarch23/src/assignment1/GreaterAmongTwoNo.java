/*Q 4 wap  that ask two numbers from user and print greater number among two*/
package assignment1;
import java.util.Scanner;

public class GreaterAmongTwoNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number1");
		long number1 = sc.nextLong();
		System.out.println("enter number2");
		long number2 = sc.nextLong();
		if(number1>number2)
		System.out.println("greater is number1 : " +number1);
		else
		System.out.println("greater is number2 :  " +number2);
		sc.close();
		// TODO Auto-generated method stub
         
	}

}
