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
 * Servlet implementation class Addbook

 */
@WebServlet("/Addbookservlet")
public class Addbook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet(

     */
    public Addbook() {


        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try 
		{
	PrintWriter out= response.getWriter();
	int a= Integer.parseInt(request.getParameter("isbn"));
	String b= request.getParameter("bname");
	String c= request.getParameter("aname");
	int d= Integer.parseInt(request.getParameter("price"));
	int e= Integer.parseInt(request.getParameter("noofpages"));

	BookDao y= new BookDao();
	int x= y.insertData(a,b,c,d,e);
	if(x>0)//if record is inserted x=1
		
		{
		RequestDispatcher rd= request.getRequestDispatcher("index.html");
		rd.forward(request, response);
		}


		}catch(Exception d1) {}

	}

}
