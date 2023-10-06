package ruf;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class partice1 {

	public static void main(String[] args) throws IOException {

		FileInputStream f = new FileInputStream("abc.txt");
		//FileWriter w = new FileWriter("abcd.txt");
		byte p[] = new byte[14];
		f.read(p);

			for(int i=0;i<p.length;i++)
			System.out.println((char)p[i]);			
	
		
		
		

	}

}
