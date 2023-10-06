<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--  out -->
<c:out value="welcome"/>

<!-- if -->
<c:set var="e" value="rashmi"/>
<c:if test ="${10<20}">
<c:out value = "${e}"/>
</c:if>
<br><br>

<!--  for -->
<c:forEach var="i" begin="0" end="5">
"${i} ${e}" <br>
</c:forEach>
 
<!--  catch -->
<c:catch  var="p">
<% 
int x=10/0;
%>
</c:catch>
<c:if test="${p!=null}">
<c:out value="${p}"/>
</c:if>

<!--  dbconnection -->
<sql:setDataSource
var="db" scope="session"
driver="com.mysql.cj.jdbc.Driver"
url="jdbc:mysql://localhost:3306/amazon2"
user="root"
password="Rashmi@0289"/>




<sql:update dataSource="${db}">
insert into customer2 values(?,?,?,?,?)
<sql:param value="shambhu@gmail.com"></sql:param>
<sql:param value="123"></sql:param>
<sql:param value="rupesh"></sql:param>
<sql:param value="pune"></sql:param>
<sql:param value="52000123"></sql:param>
</sql:update> 

 <sql:query var="rs" dataSource="${db}"> 
 SELECT * FROM customer2
</sql:query>

<br><br>
<table border=1 >
<tr><th>EMAIL</th><th>PASS</th><th>NAME</th><th>ADDRESS</th><th>MOBNO</th></tr>
<c:forEach var="data" items="${rs.rows}">
<tr><td><c:out value="${data.cemail}"></c:out>
<td><c:out value="${data.cpass}"></c:out>
<td><c:out value="${data.cname}"></c:out>
<td><c:out value="${data.caddress}"></c:out>
<td><c:out value="${data.cmobno}"></c:out>
</c:forEach>
</table>

<%-- <!-- redirect to -->
<c:set var="url" value="0" scope="request"/>  
  <c:if test="${url<1}">  
     <c:redirect url="http://facebook.com"/>  
  </c:if>  --%>


</body>
</html>