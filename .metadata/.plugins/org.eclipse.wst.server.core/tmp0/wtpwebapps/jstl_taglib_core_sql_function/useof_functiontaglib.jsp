<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="str" value="hello rashmi how are u?"/>
<c:if test="${fn:contains(str,'rashmi') }">
<p> found rashmi in given string </p></c:if>
 length :${fn:length(str)}<br>
 index :${fn:indexOf(str,"how")}<br>
 uppercase: ${fn:toUpperCase(str)} <br>
 replace: ${fn:replace(str, "rashmi", "siya")}   
</body>
</html>