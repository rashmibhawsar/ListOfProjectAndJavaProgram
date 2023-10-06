package day18_JavaIO;

import java.io.FileReader;
import java.io.*;

public class printchar {
	public static void main(String args[])throws Exception


	{
		FileReader f = new FileReader("abc.txt");
		char p[] = new char[13]; //3+10
		p[0] ='a';
		p[1] ='s';
		p[2] ='i';
		
		f.read(p,3,10);
		System.out.println(p);
	}
		
		

}
