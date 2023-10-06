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
  
  Department d= new Department();
  d.setDeptno(10);
  d.setDname("account");
  s.save(d);
  
  
  Employee e= new Employee();
  e.setEmpid(1001);
  e.setAddress("noida");
  e.setEname("riya");
  e.setD(d);
  s.save(e);
  
  t.commit();
 
 %>

</body>
</html>