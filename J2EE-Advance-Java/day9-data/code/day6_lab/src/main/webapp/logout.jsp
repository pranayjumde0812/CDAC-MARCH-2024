<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout Page</title>
</head>
<body>
	<h5>In logout page ...</h5>
	<%-- sessionScope.get(user) : userBean ref -getUserDetails -User entity - getFirstName --%>
	<h5>Hello , ${sessionScope.user.userDetails.firstName} ${sessionScope.user.userDetails.lastName}</h5>
	<%--invalidate Http Session --%>
	${pageContext.session.invalidate()}
</body>
</html>