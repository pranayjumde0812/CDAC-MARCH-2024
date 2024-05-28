<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
	<%-- <h6>Welcome ${requestScope.user.role}, ${requestScope.user}</h6> --%>
	<h2>This is Admin dashboard</h2>
	<h3 align="center">${sessionScope.message}</h3>
	
	<h4 align="right"><a href="/logout">Logout</a></h4>
</body>
</html>