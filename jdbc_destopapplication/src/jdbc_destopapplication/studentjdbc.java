package jdbc_destopapplication;
//wap to insert data to DB
import java.sql.*;
public class studentjdbc {

	public static void main(String[] args) {


		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms1","root","");//sms1 is table name
			Statement w = con.createStatement();
			w.execute("insert into student1 values(4,'sham','bangalore',9869842)");//db name is student1
			w.execute("insert into student1 values(5,'bena','bangalore',8698412)");//maintain order of table accourding to ur DB
			w.close();
			con.close();
		}	catch(ClassNotFoundException s) {System.out.println(s);}
		
		catch(SQLException a) {System.out.println(a);}
		

	}

}
