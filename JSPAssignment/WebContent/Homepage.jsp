<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage</title>
</head>
<body>
      
      <center>
       <h2>Counter</h2>
       <%
       
        String name=request.getParameter("username");
        String pwd=request.getParameter("password");
        if(name==null || name.length()<1)
        {
        	out.println("<script>alert(\"Name field is empty.\")</script>");
        }
        if(pwd==null || pwd.length()<1)
        {
        	out.println("<script>alert(\"Password not given\")</script>");
        }
        Integer i=(Integer)application.getAttribute("count");
        if(i==null || i==0)
        {
        	i=1;
        }
        else
        {
        	i++;
        }
        out.println("No of times visited ="+i);
        application.setAttribute("count",i);
        
        Cookie cookie=new Cookie("MyCookie",name);
        response.addCookie(cookie);
        out.println("<h4>MyCookie has been set to data "+name+"</h4>");
        %>
        <h2>JSTL IF TAG</h2>
        <c:set var="income" scope="session" value="${4000*4}"/>  
        <c:if test="${income > 8000}">  
        <p>My income is: <c:out value="${income}"/><p> 
        <h2>JSTL FOREACH TAG</h2>
        <c:forEach var="j" begin="1" end="3">  
        Item <c:out value="${j}"/><p>  
        </c:forEach>
       </c:if>
      </center>
</body>
</html>