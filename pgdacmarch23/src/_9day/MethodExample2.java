package _9day;
import java.util.Scanner;

public class MethodExample2 {
	public static void main(String args[]) {
		MethodExample2 m = new MethodExample2();
		m.greater();
		m.greater(5, 10);
		m.greater(25, 0, 12);
		
	
	}
	void greater(){
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter a ");
		int a= sc.nextInt();
		System.out.println(" enter b value ");
		int b= sc.nextInt();
		System.out.println(" enter c value ");
		int c= sc.nextInt();
		// --> take 3 input  within function
	}
	void greater(int a,int b ) {
		System.out.println("comparing value of a & b");
		if(a>b)
			System.out.println("greater value is a:"+a);
		else
			System.out.println("greater value is b:"+b);
		
	}
	void greater(int a,int b,int c) {
		System.out.println("comparing value of a , b & c");
		if(a>b && a>c)
			 System.out.println("greater is a : " +a);
		 else if(b>a && b>c)
			 System.out.println("greater is b: " +b);
		 else
			 System.out.println("greater is c :" +c);
		
	}


}
