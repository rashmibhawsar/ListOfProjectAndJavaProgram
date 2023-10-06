/*Q 23  Write a program to display first 1 to 20  even number on screen .
 *  Terminate the program when number 16 is found using break command .*/
package _5day;

public class even_no_1_20 {
	public static void main(String[] args) {
	
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				if(i==16)
					break;
				System.out.print(i +"  ");
}
			}
			
		}
		// TODO Auto-generated method stub


}
