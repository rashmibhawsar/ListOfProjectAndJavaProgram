
/*Q  10 wap to check greater number among three numbers*/
package assignment1;
import java.util.Scanner;

public class greaterAmongThreeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number1");
		long number1 = sc.nextLong();
		System.out.println("enter number2");
		long number2 = sc.nextLong();
		System.out.println("enter number3");
		long number3 = sc.nextLong();
		if((number1>number2)&& (number1>number3))
		System.out.println("greater is number1 : " +number1);
		else if((number2>number3)&& (number2>number1))
		System.out.println("greater is number2 :  " +number2);
		else
		System.out.println("greater is number3 :  " +number3);
		sc.close();
         
	}

}
