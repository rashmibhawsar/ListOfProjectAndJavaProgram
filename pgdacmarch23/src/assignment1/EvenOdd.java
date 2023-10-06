
/*Q 8 wap to check is number is evenor odd.*/
package assignment1;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		long number = sc.nextLong();
		String result = (number%2 ==0)?" even number ":"odd number";
		System.out.println(result);
		sc.close();
		// TODO Auto-generated method stub
         
	}

}
