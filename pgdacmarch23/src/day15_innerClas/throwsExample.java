package day15_innerClas;


//example for multiple throw and throws in method 
public class throwsExample {

	public static void main(String[] args) {

	try {
		
		print(30);
	}
	catch(Exception d) {
		System.out.println("error handled");
	}
	System.out.println("end of program ");
	}
	
	
	static void print(int a) throws ArithmeticException,ArrayIndexOutOfBoundsException,NullPointerException
	{
		if(a==10) throw new ArithmeticException();
		if(a==20) throw new ArrayIndexOutOfBoundsException();
		if(a==30) throw new NullPointerException();
	}

}