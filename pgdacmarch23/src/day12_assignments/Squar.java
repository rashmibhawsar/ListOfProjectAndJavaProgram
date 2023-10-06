package day12_assignments;
class Squ_Test{
	 double square (double b) {

		// System.out.println("the square root " + b*b);
		 return (b*b);
		 
	 }
}
public class Squar {

	public static void main(String[] args) {

		Squ_Test s = new Squ_Test();
		double result =s.square(0.2d);
		System.out.format( "%.2f " ,result);

	}
}

