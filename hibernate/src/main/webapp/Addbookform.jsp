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
<form action="Addbook.jsp"><br>
<h1> Customer Register form</h1>
Enter isfc <input type="number" name="isfc"/><br><br>
Enter bookname <input type="text" name="bname"/><br><br>
Enter authorname <input type="text" name="aname"/><br><br>
Enter price <input type="number" name="price"/><br><br>
Enter NoOfPages <input type="number" name="NoOfPages"/><br><br>

<input type="submit"/>

</form>
</body>

</body>
</html>