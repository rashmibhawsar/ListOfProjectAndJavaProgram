<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.ResultSet"%>
<%@page import="DAO.CustomerDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Please enter ur feedback.....</h1><br>
<form method ="post" action ="feedbackuser.jsp"><br><br>
enter name   <input type="text" name ="name"/><br><br>
rate product  <input type="number" name ="rating"/><br><br>
product comment/compliment  <input type="text" name ="comment"/><br><br>
<input type ="submit"/></form>
</body>
</html>