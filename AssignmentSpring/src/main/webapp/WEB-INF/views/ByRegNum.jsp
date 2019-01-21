<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Student details</h1>

<h4>Register Number : ${Student.getRegnum()} <h4>
<h4>Name : ${Student.getName()} <h4>
<h4>Phone : ${Student.getPhone()} <h4>
<h4>Age: ${Student.getAge()} <h4>
<h4>Address : ${Student.getAddress()} <h4>
<a href="goBack">Click here to go back</a>
</center>
</body>
</html>