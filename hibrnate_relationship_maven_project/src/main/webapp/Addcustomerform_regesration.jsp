<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="customerindex.jsp"></jsp:include>
<form action="Addcustomer.jsp"><br>
<h1> Customer Register form</h1>
Enter cid <input type="number" name="cid"/><br><br>
Enter email <input type="text" name="email"/><br><br>
Enter pass <input type="password" name="pass"/><br><br>
Enter name <input type="text" name="cname"/><br><br>
Enter address <input type="text" name="address"/><br><br>
Enter mobileno <input type="number" name="mobno"/><br><br>
Enter SID <input type="number" name="sid"/><br><br>
<input type="submit"/>

</form>
</body>

</body>
</html>