<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
   <%@ page isELIgnored="false" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> welcome to ur spring mvc framework home.jsp</h1>
<h2>${key}</h2>
<h2> name: ${stu.id}</h2>
<h2> rollno : ${stu.name}</h2>
<h2>marks:  ${stu.marks}</h2>
<h2>address:  ${stu.address}</h2>
<%-- <h2>marks:  ${stu.getMarks()}</h2>  u can do get--%>


</body>
</html>