<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="login.jsp">login</a>
<form>
username<input type="text" name ="user"/>
<input type ="submit"/></form>


<%! int i,j,k;    %>
<h1>
<%  i=10;
j=20;
k=i+j;
	out.println(k);
	out.println(request.getParameter("user"));

 %>
 
 
<%=k %>


</h1>
</body>
</html>