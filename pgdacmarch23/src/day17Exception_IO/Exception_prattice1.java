package day17Exception_IO;

public class Exception_prattice1 {
	public static void main(String[] args) {


		
		try
		{
		int a[]= {1};
		a[3]=44;
		}
		catch(Exception s) {	
			System.out.println(s);
			System.out.println(s.getMessage());
			System.out.println(s.hashCode());
		}
		finally   		   {		System.out.println("bye ");		}
		
		System.out.println("end of program");
	}

}
