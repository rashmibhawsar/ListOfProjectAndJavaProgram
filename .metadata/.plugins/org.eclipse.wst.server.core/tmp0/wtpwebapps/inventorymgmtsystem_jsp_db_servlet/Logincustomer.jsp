<%@page import="java.sql.ResultSet"%>
<%@page import="DAO.CustomerDao"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String email=request.getParameter("email");
String pass=request.getParameter("pass");
out.println(email +"  "+ pass);
//copied databaseconfig file from old project
//copied CustomerDAO file from old project-->paste-->java folder
CustomerDao c = new CustomerDao();

 ResultSet rs=c.loginuser(email, pass); ///call loginuser in customerDAO
 if(rs.next()) // check the 1st data in db table.. if true it will do inside ..
 {
	 session.setAttribute("email",email);// in jsp u can directly set attributes..else 1st Httpsession s = request.getsession();
	 session.setAttribute("pass",pass);// then s.setAttribute.
	// response.sendRedirect("CustomerDao.java");//?????
	 RequestDispatcher rd= request.getRequestDispatcher("customerProfile.jsp");
	 request.setAttribute("code",12344);
	 rd.forward(request,response);
	 
 }
 else
 {
	 response.sendRedirect("Login.jsp");
 }


%>
</body>
</html>