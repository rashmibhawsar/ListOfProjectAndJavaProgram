<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>------ Edit Student Page -------</h2>
<forms:form action="${pageContext.request.contextPath}/updatestu" modelAttribute="student">
<table>
<tr><td><forms:label path="id">ID</forms:label></td>
<td><forms:input path="id" disabled="disabled"/></td></tr>
<tr><td><forms:label path="name">Name</forms:label></td>
<td><forms:input path="name"/>
</td></tr>
<tr><td><forms:label path="marks">Marks</forms:label></td>
<td><forms:input path="marks"/>
</td></tr>
<tr><td><forms:label path="address">Address</forms:label></td>
<td><forms:input path="address"/>
</td></tr>
<tr><td><Input type="submit" value="UpdateStudent"></td></tr>
</table>
</forms:form>
</body>
</html>