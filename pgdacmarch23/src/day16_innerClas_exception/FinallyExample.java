package day16_innerClas_exception;

//prgram to demonstrate try and finally 
//statment in finally block will always get executed in case of error or not 
//even in case if error is handled or not 

//syntax 
//1 try { ...}  finally {...}


/*2 try{
     }
 catch(...) {}
 finally {} 
 */
//can we write try without catch --> yes 
public class FinallyExample {

	public static void main(String[] args) {

		
		try
		{
		int a[]= {1};
		a[3]=44;
		}
		catch(Exception s) {		System.out.println(s);		}
		finally   		   {		System.out.println("bye ");		}
		
		System.out.println("end of program");
	}

}