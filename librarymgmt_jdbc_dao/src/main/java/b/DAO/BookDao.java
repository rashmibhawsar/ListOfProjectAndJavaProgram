package b.DAO;
//package com.DAO;
import java.sql.*;
import databaseconnections.Databaseconf;

public class BookDao {

	Databaseconf dc;
	PreparedStatement ps;
	public BookDao()

	{
		dc=new Databaseconf();
		
	}
public int insertData(int a,String b,String c,int d,int e) throws Exception {
	ps= dc.getStatement("insert into Books values (?,?,?,?,?)");
	ps.setInt(1, a);
	ps.setString(2, b);
	ps.setString(3,c);
	ps.setInt(4, d);
	ps.setInt(5, e);
	return ps.executeUpdate();
}
	
public int deleteData(int a) throws Exception {
	ps= dc.getStatement("delete from  Books where isbn=?");
	ps.setInt(1, a);
	return ps.executeUpdate();
}

public int updateData(int price,int isbn) throws Exception 
{
	ps= dc.getStatement("update Books set price=? where isbn=?");
	ps.setInt(1, price);
	ps.setInt(2, isbn);
	return ps.executeUpdate();
}

}




