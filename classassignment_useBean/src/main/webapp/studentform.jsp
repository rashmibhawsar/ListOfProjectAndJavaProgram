<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Please enter student form...</h1><br>
<form method ="post" action ="student.jsp"><br>
RollNo    <input type="number" name ="rollno"/><br><br>
Name  <input type="TEXT" name ="name"/><br><br>

class  <input type="text" name ="whichclass"/><br><br>

Gender:
 MALE<input type="radio" id="male" name="gender" value="male"><br>
 FEMALE <input type="radio" id="female" name="gender" value ="female">
 <br><br>




  Country:
  <SELECT NAME="country" ID="list">
	<OPTION value=1>America</OPTION>
  	<OPTION value=2>Afria</OPTION>
  	<OPTION>Brazil</OPTION>
  	<OPTION>China</OPTION>
  	<OPTION>India</OPTION>
	</SELECT>

<br><br>


extra curiculum
 
    arts  <input type="checkbox" value="arts" name="extra"/><!-- whatever in value that will display-->
  

  <label for="checkbox-2">
  music   <input type="checkbox" value="music" name="extra"/>
   
  </label>
  <label for="checkbox-3">
 dance   <input type="checkbox" value="dance" name="extra"/>
   
  </label>


<input type ="submit"/></form>
</body>
</html>