<%@page import="Dao.bookdao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
String bname = request.getParameter("bname");
String aname = request.getParameter("aname");
int price = Integer.parseInt(request.getParameter("price"));
int NoOfPage = Integer.parseInt(request.getParameter("NoOfPages"));
b.addbook(isfc, bname, aname, price, NoOfPage);
%>

</body>
</html>