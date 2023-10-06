package day19_serialization;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

//wap to ask emp details and store them to file emp.ser
class appendable extends ObjectOutputStream
{
	public appendable(OutputStream o) throws Exception

	{
		super(o);
	
	}
	protected void writeStreamHeader() {}
}
public class EmpSerialization {

	public static void main(String[] args) throws  Exception {

       
		try{
			File f= new File("emp2.ser");
		
		
        Emp e= new Emp(16,"kamal","delhi");
		
        if(f.length()==0)
        {
         // line 35 to 37 we are writing data to file 
		ObjectOutputStream p= new ObjectOutputStream(new FileOutputStream(f,true));//true means appendable
		p.writeObject(e);// this method will convert object to bytestream and then write it to file 
		p.close();
        }
        
        else
        {
        	appendable r= new appendable(new FileOutputStream(f,true));//true means appendable
    		r.writeObject(e);// this method will convert object to bytestream and then write it to file 
    		r.close();
        }
		//line 47 to 55 we are reading data from file and storing it to  u object 
		Emp u= new Emp();
        ObjectInputStream p1= new ObjectInputStream(new FileInputStream(f));
		//casting because readObject method return Object 
		 
			do{
				u=(Emp)p1.readObject();   
				u.display();
			}
			while(u!=null);
			 
		}catch(Exception g) {} 
	}

}