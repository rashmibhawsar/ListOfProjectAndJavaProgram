package controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Database.DatabaseConfig;

 
@WebServlet("/emplogin")
public class Emplogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		try {
		PrintWriter out= response.getWriter();
		int empid= Integer.parseInt(request.getParameter("empid"));
		String pass= request.getParameter("pass");
		
		String query=" select * from employee where empid=? and password=?";
		DatabaseConfig dc= new DatabaseConfig();
		PreparedStatement ps= dc.getStatement(query);
			ps.setInt(1, empid);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				
		//activating user session and storing important fields in session 
		//so that their values can be retrieved in all web pages 
		//where user is moving 
				HttpSession s= request.getSession();
				s.setAttribute("empid", empid );
				s.setAttribute("password", pass);
		
				
				
				//		out.println("user exists");
				RequestDispatcher rd= request.getRequestDispatcher("employeeprofile.html");
				rd.forward(request, response);
				
			}
			else 
		 	{	
		  	response.sendRedirect("EmployeeLogin.html");
			}//out.println("user doesnot exists");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


