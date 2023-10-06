package jdbc_destopapplication;
//wa java program to insert data to database table
import java.sql.*;
import java.util.Scanner;

public class Studentjdbc2 {

	
	DBConnection b;
	Statement s1;
	
	public Studentjdbc2()throws Exception
	{
		b= new DBConnection();
		s1=b.getStatement();
	}
	
	void insert()throws Exception

	{
		   s1.execute("insert into student values(10,'piyush','delhi',3443)");
	}
	
	void delete()throws Exception

	{
	          s1.execute("delete from student1 where Rollno=7");
	}
	
	void update()throws Exception

	{
		 s1.execute("update student set address='noida' where Rollno=10");
	}
	public static void main(String[] args) {

		 try {
			 Scanner s= new Scanner(System.in);
			 Studentjdbc2 r= new Studentjdbc2();
			 System.out.println("1 add data");
			 System.out.println("2 delete data");
			 System.out.println("3 update data");
			 System.out.println("enter your choice");
			 int ch=s.nextInt();
			 if(ch==1) 			 r.insert();
			 else if(ch==2)		 r.delete();
			 else if(ch==3)  	 r.update();
			 else
				 System.out.println("wrong choice");
		  
		}
		catch(ClassNotFoundException s) {System.out.println(s);}
		
		catch(SQLException a) {System.out.println(a);}
       catch(Exception f) {}
	}

}
