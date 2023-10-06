package day18_assignment;


import java.io.FileInputStream;

import java.io.*;

public class ListFilesDictory {
	public static void main(String[] args) throws Exception{



		File k = new File("abc.txt");
		FileInputStream f = new FileInputStream("abc.txt");
		int len = (int)k.length();
		//String pathl = k.getPath();
		System.out.println("path" +k.getPath());
		byte p[] = new byte[len];
		f.read(p);
		for(int i=0;i<p.length;i++)
			System.out.println((char)p[i]);
		
		// TODO Auto-generated method stub

	}

}