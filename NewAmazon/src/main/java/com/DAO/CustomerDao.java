package com.DAO;


//package com.DAO;
import java.sql.*;



import Database.DatabaseConfig;

public class CustomerDao {

	DatabaseConfig dc;
	PreparedStatement ps;
	public CustomerDao()


	{
		dc=new DatabaseConfig();
		
	}
public int insertData(String a,String b,String c,String d,String e) throws Exception 


{
	ps= dc.getStatement("insert into customer2 values (?,?,?,?,?)");
	ps.setString(1, a);
	ps.setString(2, b);
	ps.setString(3,c);
	ps.setString(4, d);
	ps.setString(5, e);
	return ps.executeUpdate();
}
	
public int deleteData(String a) throws Exception 




{
	ps= dc.getStatement("delete from  customer2 where email=?");
	ps.setString(1, a);
	return ps.executeUpdate();
}

public int updateData(String pass,String email) throws Exception 




{
	ps= dc.getStatement("update customer2 set password=? where email=?");
	ps.setString(1, pass);
	ps.setString(2, email);
	return ps.executeUpdate();
}
}
