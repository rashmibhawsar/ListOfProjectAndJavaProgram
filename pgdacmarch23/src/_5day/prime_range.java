/*Q 10 write a program to print prime numbers between 2 to 20.*/
package _5day;

public class prime_range {
	public static void main(String[] args) {
	
		for(int i=2;i<20;i++) {
			int count =0;

			for(int j=2;j<i;j++)
			{
				if(i%j==0){
					count=1;
					break;
					}
				
			}if(count==0)
				System.out.print(i +" ");
		
		}
	}
}
	
		

