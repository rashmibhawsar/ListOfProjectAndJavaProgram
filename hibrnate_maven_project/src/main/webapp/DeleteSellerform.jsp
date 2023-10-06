<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="index.jsp"></jsp:include>
<form action="DeleteSeller.jsp">
<p> Delete form</p><BR>
  Regno<input type="number" name="regno"/><BR>
  <BR>
<input type="submit"/>

</form>
</body>
</html>
