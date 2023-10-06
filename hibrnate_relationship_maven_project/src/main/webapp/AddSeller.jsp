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
 SellerDetails d= new SellerDetails();
 d.setSid(Integer.parseInt(request.getParameter("sid")));
 d.setCompanyname(request.getParameter("cname"));
 d.setAddress(request.getParameter("address"));
 d.setMobile(Integer.parseInt(request.getParameter("mobno")));
 
 s.save(d);//hibernate will write insert query to store class data to table
 t.commit();
 out.println("data inserted");
 


 
 %>

</body>
</html>