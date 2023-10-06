package jdbcParticedestopapplication;
	import java.sql.*;
	public class ParticeStudent {

		public static void main(String[] args) {
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root","");//sms1 is table name
				Statement w = con.createStatement();
				//w.execute("create database studentinformation");
				//w.execute("create table studentdetails (sid int(3),sname varchar(200),saddress varchar(200),smobno int(10))");
			   /*or... String sql = "CREATE TABLE IF NOT EXISTS warehouses (\n"
		                + "	id integer PRIMARY KEY,\n"
		                + "	name text NOT NULL,\n"
		                + "	capacity real\n"
		                + ");";
		                w.execute(sql);*/
				w.execute("insert into studentdetails values(1,'rashmi','bangalore',9869842)");//db name is student1
				w.execute("insert into studentdetails values(2,'bena','bangalore',8698412)");//maintain order of table accourding to ur DB
				w.close();
				con.close();
			}	catch(ClassNotFoundException s) {System.out.println(s);}
			
			catch(SQLException a) {System.out.println(a);}
			

		}

}
