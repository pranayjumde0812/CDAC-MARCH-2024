<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout Page</title>
</head>
<body>
	<h5>Hello , ${requestScope.details.firstName} ${requestScope.details.lastName}</h5>
	<h6>You have logged out ....</h6>
	<h5>
	<c:url var="url" value="/"/>
		<a href="${url}">Visit Again</a>
	</h5>
</body>
</html>