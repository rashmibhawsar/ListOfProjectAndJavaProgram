
package jdbc_destopapplication;

import java.sql.Connection;
import java.sql.*;

//import com.mysql.cj.xdevapi.Statement;

public class dbconnectionAmazon {
	Connection con1;
	Statement stm;
	
	

	public dbconnectionAmazon() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon","root","");
		}catch(Exception e) {}
		
	}
	
	public Statement getStatement() throws Exception

	{
		stm = con1.createStatement();
		return stm;
	}

}
