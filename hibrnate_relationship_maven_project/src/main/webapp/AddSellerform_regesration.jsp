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
<form action="AddSeller.jsp"><br>
<h1>Seller Register form</h1>
Enter sellerid <input type="number" name="sid"/><br><br>
Enter Company name <input type="text" name="cname"/><br><br>
Enter address <input type="text" name="address"/><br><br>
Enter mobile <input type="number" name="mobno"/><br><br>
<input type="submit"/>

</form>
</body>
</html>