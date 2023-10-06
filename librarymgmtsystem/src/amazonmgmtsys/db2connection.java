package amazonmgmtsys;
import java.sql.*;

//import com.mysql.cj.xdevapi.Statement;

public class db2connection {
	Connection con1;
	PreparedStatement stm;
	
	public db2connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon","root","");
		}catch(Exception e) {}
		
	}
	
	public PreparedStatement getStatement(String query)throws Exception{
		stm= con1.prepareStatement(query);
		return stm;

	}
}
