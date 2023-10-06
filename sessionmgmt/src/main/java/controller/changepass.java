package com.controller;

import java.io.IOException;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Database.DatabaseConfig;
 
 
@WebServlet("/changepass")
public class changepass extends HttpServlet {
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			String oldp= request.getParameter("opass");
		
		String newp= request.getParameter("npass");
		DatabaseConfig d= new DatabaseConfig();
		String query= "update employee set password=? where empid=?";
		
		
		// calling session 
		//fetching data stored in session at line 32 
		HttpSession s= request.getSession();
		Integer id=(Integer)s.getAttribute("empid");
		
		 
		
		
		
		PreparedStatement p=  d.getStatement(query);
		p.setString(1, newp);
		p.setInt(2, id);
		p.execute();
		RequestDispatcher rd=request.getRequestDispatcher("employeeprofile.html");
		rd.forward(request, response);
		}catch(Exception d) {}
	}

}
