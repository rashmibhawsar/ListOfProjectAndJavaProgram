package day18_assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Employee_Info implements Serializable  {
	String Emp_address;
	String Emp_name;
	int emp_no;
	
	 void display() {


		 System.out.println("emp Name is : "+Emp_name);
		System.out.println("emp_no  in  : "+emp_no);
		System.out.println("emp address is : "+Emp_address);
	
	 }
	 
	 void getinfo(){
		 Scanner sc = new Scanner(System.in);

		 System.out.println("enter emo name");
		Emp_name = sc.next();
		System.out.println("enter emp number ");
		emp_no = sc.nextInt();
		 System.out.println("enter emo address");
		Emp_address = sc.next();
		}
}
public class employeeJavaIO {

	public static void main(String[] args) throws Exception {

		try {

			Employee_Info e = new Employee_Info();
			e.getinfo();
			e.display();
			System.out.println("displayed above after inputs");
			 ObjectOutputStream ooutputs = new ObjectOutputStream( new FileOutputStream("FILE10.ser"));
			//FileOutputStream fos = new FileOutputStream("result_emp.txt",true);
		   // ObjectOutputStream ooutputs = new ObjectOutputStream(fos);
			/*
			 * ooutputs.writeObject(e.Emp_address); ooutputs.writeObject(e.Emp_name);
			 * ooutputs.writeInt(e.emp_no);
			 */

			 ooutputs.writeObject(e);
			 
		      ooutputs.close();
		     // fos.close();
		     
		      //Employee_Info u = null; //optional u can continue with e
		      FileInputStream fis = new FileInputStream("FILE10.ser");
			  ObjectInputStream oinputs = new ObjectInputStream(fis);
			  
			 
			  System.out.println("The Object has been read from the file");
			Employee_Info u;
			do {		  
				u= (Employee_Info)oinputs.readObject();
			  	u.display();
				
			}while(u!=null);
			
		}catch(Exception e) {
//		 e.printStackTrace();
		} 



		  
		  
		 /*try{
			  int i;
			  do {
				 // i = oinputs.readInt();
			      String r = (String) oinputs.readObject();
			      System.out.print(" "+i);
			  }while(i!=-1);
	    	 
	     }catch(Exception t) {
		  		
		  	}
	     finally
			{
	    	 oinputs.close();
			}*/
		  }
}
				
	    


	  

	      
	      
	      /*      FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
 
            Object obj = objectIn.readObject();
 
            System.out.println("The Object has been read from the file");
            objectIn.close();
            return obj;  
	       * Student st = (Student) objectIO.ReadObjectFromFile(filepath);
        System.out.println(st);
	       * 
	       * 
	       * FileReader f = new FileReader("result_emp.txt");
	      try {
	  		int r;
	  	
	  		do
	  		{
	  			r = f.read();
	  			System.out.print((char)r);
	  		}
	  		while(r!=-1);
	  	}catch(Exception t) {
	  		
	  	}
			finally
			{
				f.close();
				
		}*/

	



