package day18_JavaIO;

import java.io.FileInputStream;
import java.io.FileReader;

public class filebytes {

	public static void main(String[] args) throws Exception{

		FileInputStream f = new FileInputStream("abc.txt");
		byte p[] = new byte[13];
		f.read(p);
		for(int i=0;i<p.length;i++)
			System.out.println((char)p[i]);
		
		// TODO Auto-generated method stub

	}

}
