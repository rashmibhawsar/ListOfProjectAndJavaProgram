package day17Exception_IO;

public class unchecked_Exception  {
	public static void main(String[] args) 

	{


	try {
	     int i=10/0;
	     System.out.println(i);
	}
	
	catch(Exception d)
			{
		System.out.println(d.getMessage());
	    d.printStackTrace();
	}
	
	System.out.println("bye");
	
		}

	static void print() {


		
	}

}
