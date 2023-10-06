<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="Dao.bookdao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
bookdao b = new bookdao();
int isfc = Integer.parseInt(request.getParameter("isfc"));

int price = Integer.parseInt(request.getParameter("price"));



b.updatebook(isfc, price);

%>
</body>
</html>