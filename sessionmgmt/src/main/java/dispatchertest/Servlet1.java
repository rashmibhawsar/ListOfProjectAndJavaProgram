package dispatchertest;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
 

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	PrintWriter out= response.getWriter();
	response.setContentType("text/html");
	out.println("welcome to servlet1");
	
	
	RequestDispatcher rd= request.getRequestDispatcher("/Servlet2");
	
	rd.include(request, response);
	
	out.println("end of servlet 1s");
	
	}

}
