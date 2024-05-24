<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log out page</title>
</head>
<body>
	<%--session.getAttribute("user_info").getName() --%>
	<h4 align="center">Hello , ${sessionScope.user_info.name}</h4>
	<%--invalidate session --%>
	<%-- <%
	 session.invalidate();
	%> --%>
	${pageContext.session.invalidate()}
	<h5>You have logged out...</h5>
	<h5>
		<a href="index.jsp">Visit Again</a>
	</h5>
</body>
</html>