package amazonmgmtsys;

import java.sql.SQLException;

import java.util.Scanner;

public class amazonmain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur choice...1 for product, 2..for vendor");
		int choice = sc.nextInt();
		switch(choice) 
		{
		case 1:			try {
			System.out.println("insert values in product");
			
			amazonproduct2 e = new amazonproduct2();
			System.out.println("1...add data");
			System.out.println("2....delete data");
			System.out.println("3....update data");
			System.out.println("4....display data");
			System.out.println("enter ur choice");
			int ch = sc.nextInt();
			if(ch==1) e.insert();
			else if(ch==2) e.delete();
			else if(ch==3) e.update();
			else if(ch==4) e.display();
			else System.out.println("incorect choice");
		}catch(ClassNotFoundException s) {System.out.println(s);}
		catch(SQLException a) {System.out.println(a);}
		catch(Exception a1) {System.out.println(a1);}
	
		break;
		case 2:
			try {
		
		amazonvendore e = new amazonvendore();
		System.out.println("1...add data");
		System.out.println("2....delete data");
		System.out.println("3....update data");
		System.out.println("4....display data");
		System.out.println("enter ur choice");
		int ch = sc.nextInt();
		if(ch==1) e.insert();
		else if(ch==2) e.delete();
		else if(ch==3) e.update();
		else if(ch==4) e.display();
		else System.out.println("incorect choice");
			}catch(ClassNotFoundException s) {System.out.println(s);}
			catch(SQLException a) {System.out.println(a);}
			catch(Exception a1) {System.out.println(a1);}
			break;
			
	default: System.out.println("incorrect input");
	break;
		}
	}
}

