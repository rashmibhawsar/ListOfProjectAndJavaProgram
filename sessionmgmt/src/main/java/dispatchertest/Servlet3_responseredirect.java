package dispatchertest;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet3_responseredirect
 */
@WebServlet("/Servlet3_responseredirect")
public class Servlet3_responseredirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	 
		
		
	//client url --> update 
	response.sendRedirect("http://www.cdac.in");
	}

}
