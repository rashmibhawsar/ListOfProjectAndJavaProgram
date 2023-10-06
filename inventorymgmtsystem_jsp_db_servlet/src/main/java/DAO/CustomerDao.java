package DAO;
import java.sql.PreparedStatement;

import java.sql.ResultSet;

import com.mysql.cj.Session;

import databaseconnections.*;
public class CustomerDao {

	Databaseconf dc;
	PreparedStatement ps;
	public CustomerDao()


	{
		dc=new Databaseconf();
		
	}
/*public int insertData(String a,String b) throws Exception 



{
	ps= dc.getStatement("insert into customer_r values (?,?)");
	ps.setString(1, a);
	ps.setString(2, b);

	return ps.executeUpdate();
}
	
 
public int deleteData(String a) throws Exception 


{
	ps= dc.getStatement("delete from  customer_r where emailid=?");
	ps.setString(1, a);
	return ps.executeUpdate();
}

public int updateData(String pass,String email) throws Exception 


{
	ps= dc.getStatement("update customer_r set pass =? where emailid=?");
	ps.setString(1, pass);
	ps.setString(2, email);
	return ps.executeUpdate();
}*/

public ResultSet loginuser(String email,String pass) throws Exception



{
	ps=dc.getStatement("select * from customer_r where emailid=? and pass=?");
	ps.setString(1, email);
	ps.setString(2, pass);
	ResultSet rs=ps.executeQuery();
	return rs;
	
}
public int feedbackuser(String name,int rating,String feedback) throws Exception

{
	ps= dc.getStatement("insert into feedback_table values (?,?,?)");
	ps.setString(1,name);
	ps.setInt(2,rating);
	ps.setString(3,feedback);
	int rs=ps.executeUpdate(); // or directly return ps.executeUpdate();
	return rs;
	//return ps.executeUpdate();//will not use this becz we are not reading any data fm stored db,so no return type result set

}

public int Changepassworduser(String email,String newpass) throws Exception

{
	ps= dc.getStatement("update customer_r set pass =? where emailid=?");
	ps.setString(1, newpass);
	ps.setString(2, email);
	return ps.executeUpdate();
//return ps.executeUpdate();//will not use this becz we are not reading any data fm stored db,so no return type result set

}

}