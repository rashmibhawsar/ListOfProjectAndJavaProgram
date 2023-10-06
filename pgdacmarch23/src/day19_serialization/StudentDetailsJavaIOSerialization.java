package day19_serialization;


import java.io.*;

class NewObjectOutputStream extends ObjectOutputStream //ur appending Objectouputctream
{
	NewObjectOutputStream(OutputStream k) throws Exception
	{
		super(k);
	}
	protected void writeStreamHeader() {}
}
class student implements Serializable
{
	int age;
	String name;
	student(){}
	student(String ab,int b)


	{
		name=ab;	
		age=b;
	}
	void show() {		System.out.println(name+ "  "+age);	}
	
}
public class StudentDetailsJavaIOSerialization {

	public static void main(String[] args) {

		 try {
		 student s= new student("rash",12);
		File f= new File("student.ser");
		
		if(f.length()==0)
		{
			ObjectOutputStream o= new ObjectOutputStream(new FileOutputStream(f,true));
			o.writeObject(s);//--> call writeStreamHeader () -->write header to file 
			o.close();
		}
		else
		{
			NewObjectOutputStream o1= new NewObjectOutputStream(new FileOutputStream(f,true));
			o1.writeObject(s);//--> call writeStreamHeader () -->write header to file
			o1.close();
		}

		student u= new student();
        ObjectInputStream p1= new ObjectInputStream(new FileInputStream(f));
		//casting because readObject method return Object 
		 
			do{
				u=(student)p1.readObject();   
				u.show();
			}
			while(u!=null);
		
		 }catch(Exception r) {}
	}

}
