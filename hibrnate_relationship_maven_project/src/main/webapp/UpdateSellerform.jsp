<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="sellerindex.jsp"></jsp:include>
<p> Update form</p>
<form action="UpdateSeller.jsp"><br>
Enter Sid <input type="number" name="sid"/><br><br>
Enter mobno to update <input type="number" name="mobno"/><br><br>
<input type="submit"/>
</form>

</body>
</html>