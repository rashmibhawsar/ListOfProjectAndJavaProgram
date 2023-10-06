package day25multithreading_LabAssignment;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

class FileReading 
{
  //class level locking 
	synchronized static void fileRead(String filename) throws Exception


	{
		try (FileInputStream f = new FileInputStream(filename)) {
			int i;
			do
			{
				i= f.read();
				System.out.print((char) i);
			  Thread.sleep(i);			
				
			}while(i!=-1);
		}
	}
	
	

} 

public class ShowFileThread extends Thread {
	 
	
	FileReading r;
	String s;
	ShowFileThread(FileReading r,String s)
	{
		this.r=r;
		this.s=s;
		
	}
	
	public void run()
	{
		try {
		  //class level locking using synchronized block
			synchronized(FileReading.class) {
			FileReading.fileRead(s);
		 }
		 
    	}
	catch(Exception e) {}
	}
	
}




/*	public static void main(String[] args) throws Exception 

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
	 
		
		
		

	}*/

  
  