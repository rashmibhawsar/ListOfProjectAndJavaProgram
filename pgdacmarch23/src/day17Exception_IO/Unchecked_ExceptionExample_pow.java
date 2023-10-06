package day17Exception_IO;

import java.util.Scanner;

class calculator{
	public void power() {

	
	try{
		Scanner sc = new Scanner(System.in);
	

	System.out.println("enter x value");
	double n = sc.nextDouble();
	System.out.println("enter P value ");
	double p = sc.nextDouble();
	if(n>0 && p>0) {
		long r = (long) Math.pow(n, p);
		System.out.println("power is:  " +r);}
	else if(n==0 || p==0) 
		throw new ArithmeticException();
	else if(n<0 || p<0)
		throw new Exception();
	
	}
	catch(ArithmeticException  e) {
		System.out.println(" n and p can't be zero");
	}
	catch(Exception e) {
		System.out.println("n and p can't be -ve");
	}
		System.out.println("end of pgm");
	
}
}
public class Unchecked_ExceptionExample_pow {

	public static void main(String[] args) {
		calculator c = new calculator();
		c.power();

		

	}

}
