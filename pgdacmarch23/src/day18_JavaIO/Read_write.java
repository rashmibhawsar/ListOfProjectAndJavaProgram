package day18_JavaIO;



import java.io.*;

public class Read_write {
	public static void main(String args[])throws Exception




	{
		FileReader f = new FileReader("abc.txt");
		FileWriter w = new FileWriter("p1.txt",true);
	try {
		int r;
	
		do
		{
			r = f.read();
			w.write(r);
			System.out.print((char)r);
			
		}
		while(r!=-1);
	}
		finally
		{
			f.close();
			w.close();
	}

	}
	

}
