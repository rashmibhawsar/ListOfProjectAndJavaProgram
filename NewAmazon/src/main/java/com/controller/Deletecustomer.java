package com.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.CustomerDao;

/**
 * Servlet implementation class Deletecustomer
 */
@WebServlet("/Deletecustomer")
public class Deletecustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
		PrintWriter out= response.getWriter();
   try
   {
	CustomerDao c= new CustomerDao();
	int x=c.deleteData(request.getParameter("email"));
	if(x>0)
	{
		 
			RequestDispatcher rd= request.getRequestDispatcher("index.html");
			rd.forward(request, response);
		}
	else
		out.println("no record found");
	
}catch(Exception d)
{
	System.out.println(d);
}
	
	}

}
