package day18_assignment;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Book implements Serializable{

	String author_name;
	String book_name;
	int book_price;


	void display() {



		System.out.println("book Name is : "+book_name);
		System.out.println("book author name  is  : "+author_name);
		System.out.println("book price is : "+book_price);

	}

	void getinfo(){



		Scanner sc = new Scanner(System.in);
		System.out.println("enter book name");
		book_name = sc.next();
		System.out.println("enter book author name");
		author_name = sc.next();
		System.out.println("enter book price");
		book_price = sc.nextInt();
	}
}

public class LibraryMgmtUsingFileIOStream {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("enter choice 1..store data 2..read data 3..search data 4..exit"); 
			int choice = sc.nextInt();
			switch(choice) {
			case 1:	Book e = new Book();
					e.getinfo();
					//e.display();
					ObjectOutputStream ooutputs = new ObjectOutputStream( new FileOutputStream("FILElib.txt"));
					ooutputs.writeObject(e);
					ooutputs.close(); 
					System.out.println("Book details written successfully");
					break;
			case 2:	try{Book u = null;
					FileInputStream fis = new FileInputStream("FILElib.txt");
					ObjectInputStream oinputs = new ObjectInputStream(fis);
					System.out.println("The Object has been read from the file");
					do {		  
						u = (Book)oinputs.readObject();
						System.out.println("The Object has been read from the file");
						u.display();
		
					}while(u!=null);
					}catch(Exception d) {}

			break;
			case 3:	System.out.println("enter element to be searched"); 
					String element = sc.next();
					Book q;
					ObjectInputStream p = new ObjectInputStream(new FileInputStream("FILElib.txt"));
					System.out.println("The Object has been read from the file");
					do {		  
						q = (Book)p.readObject();
						if(element.equalsIgnoreCase(q.book_name)  || element.equalsIgnoreCase(q.author_name) )
							System.out.println("element "+element+" found in file");
						else
							System.out.println("element not found in file");
						break;
		
					}while(q!=null);
					
					break;
			case 4:
					break;

			}
			System.out.println("u want to coniue? ..true  ..false");
			flag = sc.nextBoolean();
		}
	}
}




/*		
		// TODO Auto-generated method stub

	}

	private static InputStream FileInputStream(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
 */