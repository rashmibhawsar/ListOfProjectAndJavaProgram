package _5day;


import java.util.Scanner;

public class tables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		if(number>0) {
			for(int i=1;i<=10;i++) {
			System.out.println(+number+ " * "+i +" = "+ (number*i));}
			sc.close();
		// TODO Auto-generated method stub
         }
		else
			System.out.println("invalid number");
	}

}

