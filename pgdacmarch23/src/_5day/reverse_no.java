package _5day;
import java.util.Scanner;

public class reverse_no {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		System.out.println();
		int rem=0;
		String rev="";
		while(number>0) {
			if(number>0) {
				rem = number%10;
				rev = rev+rem;
				
				number = number/10;
				}
		}
		System.out.println("reversed no is:" +rev);
		
		// TODO Auto-generated method stub

	}

}
