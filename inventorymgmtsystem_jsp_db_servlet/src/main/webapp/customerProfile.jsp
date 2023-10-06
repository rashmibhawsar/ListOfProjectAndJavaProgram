<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%out.println("welcome  "+ request.getParameter("email")); %>\
<%=request.getAttribute("code") %>
<br><br><br>
<a href="Changepasswordform.jsp">changepassword</a><br>
<a href="feedbackform.jsp">Feedback</a><br>
<a href="logoutpage.jsp">logout</a><br>
</body>
</html>