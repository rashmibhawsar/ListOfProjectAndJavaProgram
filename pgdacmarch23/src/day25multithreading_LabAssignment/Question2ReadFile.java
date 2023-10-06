package day25multithreading_LabAssignment;

import java.io.FileReader;
import java.util.Scanner;


	class ReadFileQ2   {
	public void reafFile(String s) throws Exception

	{
		Scanner sc = new Scanner( new FileReader(s)) ;
	
	try {
		String str;

		do
		{
			str = sc.next();
			System.out.print(str);
			Thread.sleep(1000);
		}
		while(str!=null);
	}
		finally
		{
			sc.close();
			}

	}
	

}

public class Question2ReadFile extends Thread {
	 
	
	ReadFileQ2 r;
	String s;
	Question2ReadFile(ReadFileQ2 r,String s)

	{this.r=r;
		this.s=s;
	}
	
	public void run()

	{
		try {
			r.reafFile(s);
		 }catch(Exception e) {}
		 
    	}
	
}
	
