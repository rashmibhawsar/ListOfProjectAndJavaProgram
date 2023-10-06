<%@page import="cdac.springmvc.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored = "false" %>
     
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<%-- <%@include file= "/ASpringMVCWithJdbc/src/main/webapp/WEB-INF/index.jsp" %> --%>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<title>Insert title here</title>
</head>


<body>

<br>
<table border="2" >
<tr>
<td>Rollno</td>
<td>Name</td>
<td>&#127968;Address</td>
<td>&#x261F;Marks</td>
<td>&#x261F;Action</td>
</tr>
<c:forEach items="${list}" var="item">
<tr>
<td>${item.id }</td>
<td>${item.name}</td>
<td>${item.address}</td>
<td>${item.marks}</td>
<td><a href ='processdeleteform6/${item.id}'><i class="material-icons" style="font-size:25px;color:red">delete</i></a></td>

</tr>
</c:forEach>

</body>
</html>