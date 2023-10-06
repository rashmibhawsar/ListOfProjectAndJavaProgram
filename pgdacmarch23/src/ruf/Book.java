package ruf;



import java.io.Serializable;
import java.util.Scanner;

public class Book implements Serializable {

		//int price;
		String aname;
		String bname1;
	    	    
	    public void displayt() {
	        System.out.println("Book name: " + bname1);
	        System.out.println("Author name: " + aname);
	        //System.out.println("Price: " + price);
	    }

	    public void getDatat() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter Book name: ");
	        bname1 = scanner.next();
	        System.out.print("Enter Author name: ");
	        aname = scanner.next();
	        //System.out.print("Enter price: ");
	        //price = scanner.nextInt();
	        scanner.close();
	    }
}
