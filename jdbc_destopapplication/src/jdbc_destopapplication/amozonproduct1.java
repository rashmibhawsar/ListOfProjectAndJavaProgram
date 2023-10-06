
package jdbc_destopapplication;

import java.sql.SQLException;


import java.sql.*;
import java.util.*;

public class amozonproduct1 {
	dbconnectionAmazon b1;
	Statement s2;
	public amozonproduct1() throws Exception {


		b1 = new dbconnectionAmazon();
		s2 = b1.getStatement();
		
	
	}
	
	void insert() throws SQLException {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the data u want to insert pid pname qty price");
		int pid = sc.nextInt();
		String pname = sc.next();
		int qty = sc.nextInt();
		long price = sc.nextLong();
		//String eaddress = sc.next();
		
		System.out.println("insert into product values(pid,pname,qty,price)");
		System.out.println("insert into product values("+pid+","+pname+","+qty+","+price+")");
		
		s2.execute("insert into product values("+pid+","+pname+","+qty+","+price+")");
	//s1.execute()???????????????if it is prestatement
	}
	
	void delete() throws SQLException {


		s2.execute("delete from product where pid=3");
	}
	void update() throws SQLException {


		s2.execute("update product set qty =10 where pid=1");
	}


	public static void main(String[] args) {


		try {
			Scanner sc = new Scanner(System.in);
			amozonproduct1 e = new amozonproduct1();
			System.out.println("1...add data");
			System.out.println("2....delete data");
			System.out.println("3....update data");
			System.out.println("enter ur choice");
			int ch = sc.nextInt();
			if(ch==1) e.insert();
			else if(ch==2) e.delete();
			else if(ch==3) e.update();
			else System.out.println("incorect choice");
		}catch(ClassNotFoundException s) {System.out.println(s);}
		catch(SQLException a) {System.out.println(a);}
		catch(Exception a1) {System.out.println(a1);}
	
		



	}


}