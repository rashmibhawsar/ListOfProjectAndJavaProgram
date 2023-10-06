<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.ResultSet,DAO.*"%>
    <%@page import="javax.servlet.http.HttpServletResponse" %>
   

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String name=request.getParameter("name");
String oldpassword = request.getParameter("oldpass");
String newpassword=request.getParameter("newpass");

out.println("wait we are updating ur password");
//copied databaseconfig file from old project
//copied CustomerDAO file from old project-->paste-->java folder


CustomerDao c = new CustomerDao();
try{
	String email=(String)session.getAttribute("email");// get.attribution..which u set in logincustoer...
	 

 int rs=c.Changepassworduser(email,newpassword);//call custerDAO and stores feedback fm insert method of db

 if(rs>0){
	 out.println("password changed....");
	 //Thread.sleep(100000);
	 response.sendRedirect("Login.jsp");
//rd.forward(request,response);
	 }
 else response.sendRedirect("customerprofile.jsp");
 
 
 }catch(Exception e){ out.println(e.getMessage());}

%>

</body>
</html>