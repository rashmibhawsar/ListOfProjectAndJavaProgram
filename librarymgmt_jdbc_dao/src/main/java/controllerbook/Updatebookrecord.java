package controllerbook;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import b.DAO.BookDao;

/**
 * Servlet implementation class Updatebookrecord
 */
@WebServlet("/updateservlet")
public class Updatebookrecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Updatebookrecord() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		try
		{
			PrintWriter out= response.getWriter();
			int a= Integer.parseInt(request.getParameter("isbn"));
			int b= Integer.parseInt(request.getParameter("price"));
			
			
			BookDao c= new BookDao();
			int x=c.updateData(b,a);
			if(x>0)
			{
				 
					RequestDispatcher rd= request.getRequestDispatcher("index.html");
					rd.forward(request, response);
					 
			}
		}catch(Exception d) {}
	}

}
