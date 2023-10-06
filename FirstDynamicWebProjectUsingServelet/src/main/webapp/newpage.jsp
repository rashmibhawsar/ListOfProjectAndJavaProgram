<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="a" class="mvc.adminmodel" scope="session"></jsp:useBean>
<jsp:getProperty property="email" name="a"/>
<jsp:getProperty property="pass" name="a"/>


</body>
</html>