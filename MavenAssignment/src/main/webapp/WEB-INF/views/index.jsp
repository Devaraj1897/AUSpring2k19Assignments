<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of Students</title>
</head>
<body>
	<div align="center">
		<h1>Student List</h1>
		<table border="1">
			<th>SL NO</th>
			<th>Register Number</th>
			<th>Name</th>
			<th>Phone</th>
			<th>Age</th>
			<th>Address</th>

			<c:forEach var="student" items="${liststudents}" varStatus="status">
				<tr>
					<td>${status.index + 1}</td>
					<td>${student.regnum}</td>
					<td>${student.name}</td>
					<td>${student.phone}</td>
					<td>${student.age}</td>
					<td>${student.address}</td>
				</tr>
			</c:forEach>
		</table>
		<h3>
			<a href="newStudent">Add Student</a>
		</h3>
		<h3>Get Student by Register Number</h3>
		<form:form action="getByRegNum" method="post" modelAttribute="s">
			<table>

				<td>Register Number:</td>
				<td><form:input path="regnum" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Get Student"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>