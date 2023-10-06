package jdbc_destopapplication;

import java.sql.*;
import java.util.Scanner;
public class PrestmExecution {

	public static void main(String[] args) {




		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");//sms1 is table name
			PreparedStatement ps = con2.prepareStatement("insert into employeedetails values(?,?,?,?)");// check this propely.prepare in prepared..
			Scanner sc = new Scanner(System.in);
			System.out.println("enter ename");
			ps.setString(1, sc.next());
			System.out.println("enter eid");
			
			ps.setInt(2,sc.nextInt());//or directly (2,7);
			System.out.println("enter esalary");
			ps.setInt(3,sc.nextInt());
			System.out.println("enter eaddress");
			ps.setString(4, sc.next());
			ps.execute(); //execute /executeUpdate method  is used if it is insert |update |delete Query
			
			// to view data from database 
			     // select * from student
			//to view specific column 
  			    // select rollno , name from student
			//to view specific rows  ( where clause )
			    // select * from student where rollno=2;
               //select * from student where address='noida'
			//w.execute("insert into student1 values(4,'sham','bangalore',9869842)");//db name is student1
			//w.execute("insert into student1 values(5,'bena','bangalore',8698412)");//maintain order of table accourding to ur DB
			
			//===========================display all data ================
			ps= con2.prepareStatement("select * from employeedetails where address=?");
			
			System.out.println("enter address you want to search");
			String add= sc.next();
			ps.setString(1, add);
			//ResultSet - interface 
			//used to traverse the data  reterived from query
			//like iterator 
			ResultSet rs= ps.executeQuery();//executeQuery is used when we have select query
			while(rs.next())
			{
				System.out.println(rs.getString(1)+ " "+rs.getInt(2) +"   "+ rs.getInt(3)+"   "+ rs.getString(4));
			}
			
			ps.close();
			con2.close(); 
			 
			 
		}
		catch(Exception df) {
			System.out.println(df);}	
		
		

		

	}

}
