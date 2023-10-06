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
 * Servlet implementation class Deletebooks
 */
@WebServlet("/Deletebookservelet")
public class Deletebooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Deletebooks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		   try
		   {
			BookDao c= new BookDao();
			int x=c.deleteData(Integer.parseInt(request.getParameter("isbn")));
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

		// TODO Auto-generated method stub
	}

}
