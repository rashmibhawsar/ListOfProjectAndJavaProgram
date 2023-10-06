package day13;

import java.util.Scanner;

class Celsius{
	public float fahToCel(int f) {

		return ((f-32)* ((float)5/(float)9));
	}
}


public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter temp in fahrenheit");
		int f = sc.nextInt();
		Celsius obj = new Celsius();
		float c = obj.fahToCel(f);
		System.out.println(c);
	
				
		// TODO Auto-generated method stub

	}

}
