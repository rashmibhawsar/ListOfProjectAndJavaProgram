package day18_JavaIO;


//wap to copy content of two file into third file 
//copy content of both  f1.txt, f2.txt to file f3.txt

import java.io.*;

public class Twofile_storeinOne {

	public static void main(String[] args) throws Exception 

	{
		FileInputStream a= new FileInputStream("f1.txt");
		
		FileInputStream b= new FileInputStream("f2.txt");
		
		
		FileOutputStream s= new FileOutputStream("f3.txt",true);
		
		SequenceInputStream si= new SequenceInputStream(a ,b);
		int y;
	 do
	 {   y=si.read();
	    if(y!=-1) {
		 s.write(y);
		 System.out.print((char) y);
	 }
	 }
	 while(y!=-1);
	 
		
		
		

	}

}
