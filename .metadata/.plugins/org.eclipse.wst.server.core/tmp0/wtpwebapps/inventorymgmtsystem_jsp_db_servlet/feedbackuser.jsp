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
int rating = Integer.parseInt(request.getParameter("rating"));
String feedback=request.getParameter("comment");

out.println("ur name is" +name+ "and rating is" +rating+"feedback "+ feedback);
//copied databaseconfig file from old project
//copied CustomerDAO file from old project-->paste-->java folder


CustomerDao c = new CustomerDao();
try{

 int rs=c.feedbackuser(name,rating,feedback);//call custerDAO and stores feedback fm insert method of db

 if(rs>0){
	 out.print("thanks for feedback");
response.sendRedirect("Login.jsp");
//rd.forward(request,response);
	 
 }
 else response.sendRedirect("customerprofile.jsp");
 
 
 }catch(Exception e){ out.println(e.getMessage());}
%>
</body>
</html>