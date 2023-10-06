package day17Exception_IO;

import java.util.Scanner;

class marks extends Exception
{
	marks()
	{
		System.out.println("internal mark is exceed,");
	}
	marks(int m){
		System.out.println("external mark is exceed, :" +m);
	}
}

public class UserExternal_InternalMarks {
	public static void main(String args[]) throws marks {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("enter internal marks");
			int int_marks = sc.nextInt();
			try {
				 if(int_marks>40)
					 throw new marks();
				 else
					 System.out.println("internal marks: "+int_marks);
				 }
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			 
			 System.out.println("enter y value ");
				int ext_marks = sc.nextInt();
				
				try {
					if(ext_marks>60)
						throw new marks(ext_marks);
				 else
					 System.out.println("external marks: "+ext_marks);
				}			catch(Exception e) {
					System.out.println("external marks should not excedd 60");
				}
				 
				 System.out.println("end of program");


		
		
	}


}
