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
 Customer c= new Customer();
 /* SellerDetails d= new SellerDetails(); */

 c.setCid(Integer.parseInt(request.getParameter("cid")));
 c.setEmail(request.getParameter("email"));
 c.setPass(request.getParameter("pass"));
 c.setName(request.getParameter("cname"));
 c.setAddress(request.getParameter("address"));
 c.setMobile(Integer.parseInt(request.getParameter("mobno")));
 /* c.setSd(Integer.parseInt(request.getParameter("sid"))); */
 
 int y=Integer.parseInt(request.getParameter("sid"));
 SellerDetails d= s.get(SellerDetails.class, y );
 if(d!=null)
 {
 c.setSd(d);
 s.save(c);//hibernate will write insert query to store class data to table
 t.commit();
 out.println("data inserted");
 }
 else
		out.println("Entered wrong regno ");
 %>
</body>
</html>