package day18_JavaIO;
import java.io.*;

public class java_IO {
	public static void main(String args[])throws Exception


	{
		FileReader f = new FileReader("abc.txt");
		int r;
		do
		{
			r = f.read();
			System.out.print((char)r);
			
		}
		while(r!=-1);
	}

}
