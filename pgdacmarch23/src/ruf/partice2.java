package ruf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class partice2 {

	public static void main(String[] args) throws IOException {


		File f = new File("abc.txt");

		
		System.out.println(f.length());
		System.out.println(f.canRead());
		System.out.println(f.exists());
		System.out.println(f.getName());
		System.out.println(f.getFreeSpace());
		
	
		
		
		

	}

}
