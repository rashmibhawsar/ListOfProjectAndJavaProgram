
// check for password 1234
package _3day;
import java.util.Scanner;

public class check_Password {

	public static void main(String[] args) {
		int i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter password");
		int password = sc.nextInt();
		if(password==1234)
			System.out.println("entered correct password");
		else {
			System.out.println("ur password is wrong");
			for(i=1;i<=3;i++) {
				System.out.println("reenter password");
				int repassword = sc.nextInt();
				if(repassword==1234) {
					System.out.println("entered correct password");
				break;}
			}
			
		}if( i ==4)
		System.out.println("ur 3 attempt is done .. wrong password card block");
				
				sc.close();
	}
}
	
				
			
		
		
		

