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
 <a href="Addbookform.jsp">  add book </a>&nbsp &nbsp &nbsp
 <a href="Deletebookform.jsp">Delete book fm DB</a>&nbsp &nbsp &nbsp
<a href="Updatebookform.jsp"> UPDATE book record </a>&nbsp &nbsp &nbsp
<a href="view_searchbookform.jsp"> View particular book record </a>&nbsp &nbsp &nbsp
 <a href="view_all_book_data.jsp"> View all book record </a>&nbsp &nbsp &nbsp
</body>
</html>