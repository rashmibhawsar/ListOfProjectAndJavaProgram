<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="org.hibernate.*,org.hibernate.cfg.*" %>
<%@page import="com.model.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- wap to display all data from database using HQL -->
<jsp:include page="sellerindex.jsp"></jsp:include>
 <%
 //load session factory from hibernate.cfg.xml
 
 SessionFactory sf= new Configuration().configure().buildSessionFactory();
 Session s= sf.openSession();//like preparedstatement 
 Transaction t=s.beginTransaction();
 
 
 //HQL --> hibernate query language 
 //like sql 
 //in hql wqe use classname and variable name in place of table name and column 
 
 //Query is interface act like ResultSet to hold reference of  output  
 Query q= s.createQuery("from SellerDetails");//select query
 //store whole data from Query to list 
 List<SellerDetails> l= q.list();
 
 out.println("<centre> <table border=2>");
 out.println("<tr><td>Regno<td>Company name<td> address");
 // loop at line 34 will fetch data from list and store it to class object k 
 // using k object we will print each table row data 
 
 for( SellerDetails k: l)
 {
	 out.println("<tr><td>"+ k.getSid() +"<td>"+ k.getCompanyname()+"<td>"+ k.getAddress());
 }
 
 out.println("</table>");
 
 
 %>

</body>
</html>