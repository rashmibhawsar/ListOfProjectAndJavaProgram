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

<input type="button" onclick="document.location.href='index.jsp';" value="Home" "/><br><br>
 <a href="AddSellerform_regesration.jsp">  Register </a>&nbsp &nbsp &nbsp
 <a href="DeleteSellerform.jsp">Delete record fm DB</a>&nbsp &nbsp &nbsp
<a href="UpdateSellerform.jsp"> UPDATE ur record </a>&nbsp &nbsp &nbsp
<a href="view_searchdataform.jsp"> View paricular record </a>&nbsp &nbsp &nbsp
 <a href="view_all_seller_data.jsp"> View all record </a>&nbsp &nbsp &nbsp
</body>
</html>