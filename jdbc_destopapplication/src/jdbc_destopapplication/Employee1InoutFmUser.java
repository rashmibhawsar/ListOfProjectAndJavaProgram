package jdbc_destopapplication;

import java.sql.SQLException;

import java.sql.*;
import java.util.*;

public class Employee1InoutFmUser {
	DatabaseConnection b;
	Statement s1;
	public Employee1InoutFmUser() throws Exception {

		b = new DatabaseConnection();
		s1 = b.getStatement();
		
	
	}
	
	void insert() throws SQLException {


		Scanner sc = new Scanner(System.in);
		System.out.println("enter the data u want to insert name id salary address");
		String ename = sc.next();
		int eid = sc.nextInt();
		long esalary = sc.nextLong();
		String eaddress = sc.next();
		
		System.out.println("insert into employeedetails values(ename,eid,esalary,eaddress)");
		System.out.println("insert into employeedetails values("+ename+","+eid+","+esalary+","+eaddress+")");
		
		s1.execute("insert into employeedetails values("+ename+","+eid+","+esalary+","+eaddress+")");
	//s1.execute()???????????????if it is prestatement
	}
	
	void delete() throws SQLException {


		s1.execute("delete from employeedetails where eid=3");
	}
	void update() throws SQLException {


		s1.execute("update employeedetails  set eaddress ='noida' where eid=1");
	}


	public static void main(String[] args) {


		try {
			Scanner sc = new Scanner(System.in);
			Employee1InoutFmUser e = new Employee1InoutFmUser();
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

