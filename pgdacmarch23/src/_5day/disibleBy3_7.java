/* Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.*/
package _5day;

public class disibleBy3_7 {
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i +"  ");
			}
			
		}
		// TODO Auto-generated method stub

	}

}
