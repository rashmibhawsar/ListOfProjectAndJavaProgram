<%@page import="com.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- wap to display all data from database using HCQL -->
<jsp:include page="sellerindex.jsp"></jsp:include>
    <%@page import ="org.hibernate.*,org.hibernate.cfg.*" %>
    <%@page import= "org.hibernate.Criteria" %>
    <%@page import ="org.hibernate.criterion.*,java.util.*" %>
 <%
 //load session factory from hibernate.cfg.xml
 
 SessionFactory sf= new Configuration().configure().buildSessionFactory();
 Session s= sf.openSession();//like preparedstatement 
 Transaction t=s.beginTransaction();
 
 Criteria c=s.createCriteria(Customer.class);
 //c.add(Restrictions.eq("rollno",100));
 //c.add(Restrictions.eq("name","neha"));
 List <Customer> l= c.list();

 out.println("<table border=2>");
 out.println("<tr><td>cid<td>Email <td> address<td> Mobileno<td>Name <td> Sd");
 // loop at line 34 will fetch data from list and store it to class object k 
 // using k object we will print each table row data 
 
 for( Customer k: l)
 {
	 out.println("<tr><td>"+ k.getCid() +"<td>"+ k.getEmail()+"<td>"+ k.getAddress()+"<td>"+ k.getMobile()+"<td>"+ k.getName()+"<td>"+ k.getSd());
 }
 
 out.println("</table>");
 
 
 %>

</body>
</html>