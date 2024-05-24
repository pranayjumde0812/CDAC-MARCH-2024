<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Handling Page</title>
</head>
<body>
	<h5 style="color: red;">
		Error Message
		<%=exception%></h5>
		<h3 align="center">Via EL syntax</h3>
		<h5 style="color: red;">Exception Details - ${pageContext.exception}</h5>
		<h5 style="color: red;">Exception Message ${pageContext.exception.message} </h5>
		<h5 style="color: red;">Error Code ${pageContext.errorData.statusCode}</h5>
		<h5 style="color: red;">Error causing page - ${pageContext.errorData.requestURI}</h5>
</body>
</html>