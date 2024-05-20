<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details Page</title>
</head>
<body>
	<h5>
		Login Successful , via
		<%=page%></h5>
	<%--sessionScope.get("user_info) OR session.getAttribute("user_info") --%>
	<h5>User Details - ${sessionScope.user_info}</h5>
	<%
	 String encodedURL=response.encodeURL("logout.jsp");
	%>
	<h5>
		<a href="<%= encodedURL %>">Log Me Out</a>
	</h5>
</body>
</html>