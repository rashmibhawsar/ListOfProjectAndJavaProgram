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
<button type="button" onclick="document.location.href='index.jsp'" >HOME</button><br><br>

<!--<input type="button" onclick="document.location.href='index.jsp';" value="Home" /><br><br>  -->
 <a href="Addcustomerform_regesration.jsp">  Register </a>&nbsp &nbsp &nbsp
 <a href="Deletecustomerform.jsp">Delete record fm DB</a>&nbsp &nbsp &nbsp
<a href="Updatecustomerform.jsp"> UPDATE ur record </a>&nbsp &nbsp &nbsp
<a href="view_searchdata_customerform.jsp"> View particular record </a>&nbsp &nbsp &nbsp
 <a href="view_all_customer_data.jsp"> View all record </a>&nbsp &nbsp &nbsp
</body>
</html>