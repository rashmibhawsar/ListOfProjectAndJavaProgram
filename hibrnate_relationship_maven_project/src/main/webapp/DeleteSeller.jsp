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
 Transaction t=s.beginTransaction();/* to maintain the ACID property of dbms we write this*/

 
 
 SellerDetails d= new SellerDetails();
int sid = Integer.parseInt(request.getParameter("sid"));

 Query e= s.createQuery("Delete FROM Customer where sid = ?1");
 e.setParameter(1, sid);
 int y=e.executeUpdate();
 if(y>0)
	 out.println("record deleted from Customer table");
 else
	 out.println("record not found"); 




d.setSid(sid);
s.delete(d);
//tablecon = (SellerDetails)session.get(SellerDetails,123);
// t.commit();
 out.println("data deleted from sellerdetails table \n");
// out.println(tablecon);
 t.commit();
 %>
</body>
</html>