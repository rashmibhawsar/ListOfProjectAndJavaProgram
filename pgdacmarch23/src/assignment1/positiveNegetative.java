
/*Q 2 using ternary check if number entered by user is positive or negative .
In case number is positive store "Positive number" 
else store negative number to Result variable*/
package assignment1;
import java.util.Scanner;

public class positiveNegetative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		long number = sc.nextLong();
		String result = (number>0)?" positive number ":"negative number";
		System.out.println(result);
		sc.close();
		// TODO Auto-generated method stub
         
	}

}
