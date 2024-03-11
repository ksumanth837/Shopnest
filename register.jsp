<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Register here</h2>
<div class="register">
  <form method="post" action="reg">
    <label><b>User Name</b></label><br>
    <input type="text" name="uname" id="textBox" placeholder="username"><br><br>
    
     <label><b>Email</b></label><br>
    <input type="text" name="mail" id="textBox" placeholder="email"><br><br>
    
     <label><b>Password</b></label><br>
    <input type="password" name="pass" id="textBox" placeholder="password"><br><br>
    
    <label><b>Gender</b></label><br>
    <input type="radio" name="gender" value="male">Male
    <input type="radio" name="gender" value="female">Female
    <input type="radio" name="gender" value="other">other
    
    <label><b>Address</b></label><br>
    <textarea rows="2" cols="20" id="textBox" name="address"></textarea><br><br>
    
    <input type="submit" id="sub" value="Register"> <br><br>
    <a href="login.jsp">Allready registered? Sign in instead</a>
  </form>
</div>
</body>
</html>