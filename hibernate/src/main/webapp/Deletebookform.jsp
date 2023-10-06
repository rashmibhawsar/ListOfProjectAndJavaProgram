<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="libraryindex.jsp"></jsp:include>
<form action="Deletebook.jsp">
<h3> Delete form</h3><BR>
  ISFC Code ?<input type="number" name="isfc"/><BR>
  <BR>
<input type="submit"/>

</form>
</body>
</html>