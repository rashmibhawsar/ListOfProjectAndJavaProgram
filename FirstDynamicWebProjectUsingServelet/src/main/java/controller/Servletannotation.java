package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servletannotation

 */
@WebServlet(
		urlPatterns = { "/Servletannotation" }, 
		initParams = { 
				@WebInitParam(name = "code", value = "test123"), 
				@WebInitParam(name = "passworf", value = "xyz")
		})
public class Servletannotation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()

     */
    public Servletannotation() {



        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)

	 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String t= getServletConfig().getInitParameter("Code");
			response.getWriter().append("Served at: "+t ).append(request.getContextPath());
		


	}

}
