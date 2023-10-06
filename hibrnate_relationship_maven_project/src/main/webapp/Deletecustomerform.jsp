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
<form action="Deletecustomer.jsp">
<h3> Delete form</h3><BR>
  CustomerID<input type="number" name="cid"/><BR>
  <BR>
<input type="submit"/>

</form>
</body>
</html>