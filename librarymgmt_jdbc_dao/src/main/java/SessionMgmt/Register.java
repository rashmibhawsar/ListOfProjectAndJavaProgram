package SessionMgmt;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import databaseconnections.*;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {

        super();
        // TODO Auto-generated constructor stub
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	try {
    		
    	
    	int x = Integer.parseInt(request.getParameter("empid"));
    	String a= request.getParameter("email");
    	String b= request.getParameter("user");
    	String c= request.getParameter("pass");
    	String d= request.getParameter("address");
    	response.setContentType("text/html");
    	PrintWriter out= response.getWriter();
    	
    	out.println("<b>"+x+ "   "+a +"   "+ b +"  "+ c+"  "+ d);
    	
    	String query="insert into employee values(?,?,?,?,?)";
    	Databaseconf dc= new Databaseconf();
    	PreparedStatement ps= dc.getStatement(query);
    	ps.setInt(1,x);
    	ps.setString(2,a);
    	ps.setString(3,b);
    	ps.setString(4,c);
    	ps.setString(5,d);
    	ps.execute();
    	}
    	catch(Exception d) {
    		System.out.println(d);
    	}
    	
    	}

}

