<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
  form{
     margin-top: 100px;
  }
</style>
<title>Login</title>
</head>
<body>
<center>
<h1>Login Here</h1>
<form action="Homepage.jsp" method="get">
   Enter name:<br><input type="text" name="username">
   <br><br>
   Enter password:<br><input type="password" name="password">
   <br><br>
   <input type="submit">

</form>
</center>
</body>
</html>