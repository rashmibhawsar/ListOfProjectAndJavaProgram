<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="forms" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="processform" method ="post"><br>
<h1> Customer Register form</h1>
Enter id <input type="number" name="id"/><br><br>
Enter name <input type="text" name="name"/><br><br>
Enter address <input type="text" name="address"/><br><br>
Enter marks<input type="number" name="marks"/><br><br>


<input type="submit"/>

</form>

</body>
</html>