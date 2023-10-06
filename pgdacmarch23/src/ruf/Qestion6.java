package ruf;
/*
 *  6 create desktop  application for library mgt system
	define class book having fields like bname ,aname ,price and get method and display;
	define other methods like
    writeToFile()
  	readfromFile()
  	searchfromFile()

	In main design menu driven application
	 1) store data to file
	 2) read data from file
	 3) search data from file
	 4) exit
 */

import java.io.*;
import java.util.Scanner;


class NewObjectOutputStream extends ObjectOutputStream
{
	public NewObjectOutputStream(ObjectOutputStream o) throws Exception
	{
		super(o);
	}
	protected void writeStreamHeader() {}
}


public class Qestion6 {
	
	public static void main(String[] args) throws Exception{
		
		Qestion6 q6= new Qestion6();
		
		System.out.println("What would you like to do today? ");
		System.out.println("1: Store Book Data to File \n2: Read All Books Data From File \n3: Search by Book Name From File \n4: Exit");
		Scanner sc= new Scanner(System.in);
		int choice= sc.nextInt();
		
		switch(choice)
		{
		case 1: Book b1= new Book();
				b1.getDatat();
				q6.WriteToFile(b1);
				break;
		case 2: q6.ReadFromFile();
				break;
		case 3: System.out.println("Please Enter the Book Name");
				String bookname = sc.next();
				q6.SearchFromFile(bookname);
				break;
		case 4: System.exit(0);
				break;
		default: System.out.println("You have entered the wrong choice. Exiting.");		
		}
		
		sc.close();
	}
	
	void ReadFromFile() throws Exception
	{
		File f= new File("LMSNew5.txt");
		FileInputStream fi= new FileInputStream(f);
		ObjectInputStream oi= new ObjectInputStream(fi);
		
		Book b2=null;
		do
		{
			b2=(Book)oi.readObject();
			b2.displayt();
		}while(b2!=null);
		
		oi.close();
	}
	
	void SearchFromFile(String name) throws Exception
	{
		File f= new File("LMSNew5.txt");
		FileInputStream FipS= new FileInputStream(f);
		ObjectInputStream OipS= new ObjectInputStream(FipS);
		
		Book b2;
		do
		{
			b2= (Book)OipS.readObject();
			if(b2.bname1.equals(name))
			{
				System.out.println("Record Found.");
				break;
			}
		}while(b2!=null);
		
		OipS.close();
	}

	void WriteToFile(Book b) throws Exception
	{
		File f= new File("LMSNew5.txt");
		ObjectOutputStream oo = null;
		FileOutputStream fo = new FileOutputStream(f,true);
		
		if(f.length()==0)
		{
			oo= new ObjectOutputStream(fo);
			oo.writeObject(b);
			oo.close();
			System.out.println("Data written successfully");
		}
		else
		{
			oo= new ObjectOutputStream(fo);
			NewObjectOutputStream oo1= new NewObjectOutputStream(oo);
			oo1.writeObject(b);
			oo1.close();
			System.out.println("Data appended successfully");
		}
	}

}
