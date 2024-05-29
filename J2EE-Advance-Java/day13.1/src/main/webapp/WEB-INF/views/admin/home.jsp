<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
<h5>${sessionScope.message}</h5>
<h6>User Details - ${sessionScope.user_details}</h6>
<c:url var="url" value="/users/logout"/>
	<h5 align="center"><a href="">Log Out</a></h5>

</body>
</html>