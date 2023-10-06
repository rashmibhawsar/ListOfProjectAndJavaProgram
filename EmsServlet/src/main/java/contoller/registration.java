package contoller;

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

/**
 * Servlet implementation class registration

 */
@WebServlet("/registration")
public class registration extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//write output to client browser 
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		//to retreive form data 
		String user=request.getParameter("user1");
		String pass=request.getParameter("pass");
		String add=request.getParameter("address");
		
     out.println("welcome  "+ user +"  "+ pass +"  "+ add);
     try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root","");//sms1 is table name
			Statement w = con.createStatement();
			//w.execute("create database studentinformation");
			w.execute("create table studentinfo (sid int(3),sname varchar(200),saddress varchar(200),smobno int(10))");
		   /*or... String sql = "CREATE TABLE IF NOT EXISTS warehouses (\n"
	                + "	id integer PRIMARY KEY,\n"
	                + "	name text NOT NULL,\n"
	                + "	capacity real\n"
	                + ");";
	                w.execute(sql);*/
			//w.execute("insert into studentinfo values(1,'rashmi','bangalore',9869842)");//db name is student1
			//w.execute("insert into studentinfo values(2,'bena','bangalore',8698412)");//maintain order of table accourding to ur DB
			w.close();
			con.close();
		}	catch(ClassNotFoundException s) {System.out.println(s);}
		
		catch(SQLException a) {System.out.println(a);}
		

	/*	try {
	DBConnection r= new DBConnection();			
	PreparedStatement k= r.getStatement("insert into employee values (?,?,?)");
	k.setString(1,user);
	k.setString(2,pass);
	k.setString(3,add);
	k.execute();
		}
		catch(Exception d) {}*/
	}



}
