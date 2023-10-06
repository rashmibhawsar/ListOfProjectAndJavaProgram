package day18_JavaIO;


import java.io.*;

public class LibraFile_Fileclass {
	public static void main(String[] args) {


		File k = new File("D:\\Rashmi_cdac\\workspace2\\pgdacmarch23");

		File j[]=k.listFiles();
		for(File m:j)
		{
			
			System.out.println(m);
		}

	}

}


/*import java.io.File;

public class Q4 {

	public static void main(String[] args) {
		 
		File f = new File("c:\\nodejs");
		///1 option  
		String t[]=f.list();
	     for(String k:t)
	     {
		   System.out.println(k);
	     }
	     
     //second option to list files or directory from specific folder 
    File j[]= f.listFiles();
    for(File k:j)
    {  
    	if(k.isDirectory())
	   System.out.println(k);
    }
   
	}

}
*/