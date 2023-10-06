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
SessionFactory sf= new Configuration().configure().buildSessionFactory();
 
 Session s= sf.openSession();//like preparedstatement 
 Transaction t=s.beginTransaction();
 //SellerDetails d= new SellerDetails();
int y=Integer.parseInt(request.getParameter("cid"));
int mobile =Integer.parseInt(request.getParameter("mobno"));
Customer d= s.get(Customer.class, y );
if(d!=null)
 {
 d.setCid(y);
 d.setMobile(mobile);
 s.update(d);//hibernate will write insert query to store class data to table
 t.commit();
 out.println("data UPDATED");
 }
else
	out.println("Entered wrong CId number ");
 
 %>

</body>
</html>