/*Q1 wap to demonstrate ternary operator .define a variable marks  
 * .ask its value from user and using ternary operator 
 * check if marks > 40 store "Pass" in result variable else store "Fail"*/
package assignment1;
import java.util.Scanner;

public class greater40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks");
		int marks = sc.nextInt();
		String result = (marks>40)?"pass":"fail";
		System.out.println(result);
		sc.close();
		// TODO Auto-generated method stub
         
	}

}
