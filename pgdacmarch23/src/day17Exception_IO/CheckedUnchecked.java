package day17Exception_IO;


//program to demonstrate checked and unchecked exception 
//checkedexception -- >exception that are checked during compile time 
//Uncheckedexception -- >exception that are checked during run time 

public class CheckedUnchecked {
public static void main(String[] args) 
	{
		try{ 
			print();
		}catch(Exception d) {}
		try
		{
		show();
		}catch(Exception f) {}
		 
	 }
	   //unchecked exception --checked at runtime 
//so if no hander is created still no compilation error 
		static void print()

		{System.out.println("in print method ");
			throw new ArithmeticException();
		}
	//checked exception  either use try catch or throws after method name 
	//otherwise there will be compilation error 
	static void show() throws ClassNotFoundException
	{ 
		System.out.println("in show method ");
		throw new ClassNotFoundException();
	}

}
