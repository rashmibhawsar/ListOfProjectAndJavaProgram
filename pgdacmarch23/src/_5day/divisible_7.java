/* Q 20 Write a program to find sum of all integers greater than 100 and less than 200 that are divisible by 7*/
package _5day;

public class divisible_7 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=100;i<200;i++) {
			if(i%7==0) {
				System.out.print(i +" ,");
			sum = sum+i;}
			
		}System.out.println();
		System.out.println("sum of all integers greater than 100 and less than 200  : "+sum);
		// TODO Auto-generated method stub

	}

}
