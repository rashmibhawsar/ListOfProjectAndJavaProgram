<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

   

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="s" class="classassignment.studentmvc">
<jsp:setProperty name="s" property="rollno"/>
<jsp:setProperty name="s" property="name"/>
<jsp:setProperty name="s" property="whichclass"/>
<jsp:setProperty name="s" property="gender"/>
<jsp:setProperty name="s" property="country"/>
<jsp:setProperty name="s" property="extra" param="extra"/>
</jsp:useBean>


<table border=2>
<tr><td><jsp:getProperty name="s" property="rollno"/>
<tr><td><jsp:getProperty name="s" property="name"/>
<tr><td><jsp:getProperty name="s" property="whichclass"/>
<tr><td><jsp:getProperty name="s" property="gender"/>
<tr><td><jsp:getProperty name="s" property="country"/>
<tr><td><table>
<%

String k[]=request.getParameterValues("extra");
if(k!=null)
{
for(int i=0;i<k.length;i++)
{
	out.print("  "+k[i]);
}	
}
%>
</table>
</body>
</html>