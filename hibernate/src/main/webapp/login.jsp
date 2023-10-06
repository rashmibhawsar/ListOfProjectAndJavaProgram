<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="org.hibernate.*,org.hibernate.cfg.*" %>
<%@page import="com.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 //load session factory from hibernate.cfg.xml
 
 SessionFactory sf= new Configuration().configure().buildSessionFactory();
 Session s= sf.openSession();//like preparedstatement 
 Transaction t=s.beginTransaction();
 
 int y=Integer.parseInt(request.getParameter("isfc"));
 
 lmsuser d= s.get(lmsuser.class, y );
 if(d!=null)
 { RequestDispatcher rd = request.getRequestDispatcher("libraryindex.jsp");
	 rd.forward(request, response);
 }
else
	out.println("user details are wrong check email");
 %>


</body>
</html>