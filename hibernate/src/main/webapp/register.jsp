
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@page import="org.hibernate.*,org.hibernate.cfg.*" %>
<%@page import="com.model.*" %>

<title>Insert title here</title>
</head>
<body>
 <%
 //load session factory from hibernate.cfg.xml
 
 SessionFactory sf= new Configuration().configure().buildSessionFactory();
 
 Session s= sf.openSession();//like preparedstatement 
 Transaction t=s.beginTransaction();
 lmsuser d= new lmsuser();
 d.setUid(Integer.parseInt(request.getParameter("uid")));
 d.setName(request.getParameter("uname"));
 d.setEmail(request.getParameter("email"));
 d.setPass(Integer.parseInt(request.getParameter("pass")));
 d.setAddress(request.getParameter("address"));
 d.setMobile(Integer.parseInt(request.getParameter("mobno")));
 
 s.save(d);//hibernate will write insert query to store class data to table
 t.commit();
 out.println("data inserted , now do login");
 


 
 %>


</body>
</html>