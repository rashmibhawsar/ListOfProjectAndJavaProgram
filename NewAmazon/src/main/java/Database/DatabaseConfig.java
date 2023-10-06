package Database;

import java.sql.*;

import com.mysql.cj.jdbc.Driver;

public class DatabaseConfig {

	Connection con;
	PreparedStatement ps;
	public DatabaseConfig()


	{
		try
		{
			
//step1 right click on project --> build path--> configure build path--> classpath--> add External jar -->select mysql-connector jar
//step2 right click on project --> build path--> configure build path--> deployment assembly--> add --> java build path entries -->  select mysql-connector jar
						
			Class.forName("com.mysql.cj.jdbc.Driver");
	        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon2","root","Rashmi@0289");
	        if(con!=null)
			{System.out.println("connected");}
		}catch(Exception w) {
			w.printStackTrace();
		}
		
	}
	public PreparedStatement getStatement(String sql) throws Exception 


	{
	 return con.prepareStatement(sql);	
	}
}
