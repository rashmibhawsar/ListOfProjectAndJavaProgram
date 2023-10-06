package jdbc_destopapplication;
import java.sql.*;

public class DBConnection {
	Connection con;
	Statement s;
	public DBConnection()

	{
		try{
		 Class.forName("com.mysql.cj.jdbc.Driver");
		
		 con= DriverManager.getConnection("jdbc:mysql://localhost:3307/sms","root","");
		
		}
		catch(Exception df) {}
	
	}
	
	public Statement getStatement() throws Exception

	{
		s= con.createStatement();
		return s;
	}


}
