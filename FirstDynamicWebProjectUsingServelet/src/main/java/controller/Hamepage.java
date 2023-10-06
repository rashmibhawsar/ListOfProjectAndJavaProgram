package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.ExpiresFilter.XPrintWriter;

/**
 * Servlet implementation class Hamepage


 */
@WebServlet("/studentdetails")
public class Hamepage extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 

{

		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int i =Integer.parseInt(request.getParameter("sid"));
		String j =(request.getParameter("sname"));
		String k =(request.getParameter("saddress"));
		long l =Long.parseLong(request.getParameter("smobnumber"));
		PrintWriter  out = response.getWriter();
		
		out.println("welcome  "+ i +"  "+ j +"  "+ k +" " +l);
		     try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","Rashmi@0289");//sms1 is table name
					if(con!=null)
					{
						System.out.println("connected succesfully");
					}
					Statement w = con.createStatement();
					//w.execute("create database studentinformation");
					//w.execute("create table studentinfo (sid int(3),sname varchar(200),saddress varchar(200),smobno int(10))");

					w.execute("insert into student values(' "+i+" ',' "+j+" ',' "+k+" ',' "+l+" ')");//db name is student1
					System.out.println(" inserted table con");
					//w.execute("insert into studentinformation values(2,'bena','bangalore',8698412)");//maintain order of table accourding to ur DB
					w.close();
					con.close();
				}	catch(ClassNotFoundException s) {System.out.println(s);}
				
				catch(SQLException a) {System.out.println(a);}
	}
	
}
