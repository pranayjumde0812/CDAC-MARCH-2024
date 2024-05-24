<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%--print session id on clnt browser using JSP expression --%>
	<h4 align="center">
		Session ID -
		<%=session.getId()%></h4>
	<h4>
		Welcome to JSP !!! , Server Time
		<%=LocalDateTime.now()%></h4>
	<h5>
		<a href="comments.jsp">Test Comments</a>
	</h5>
	<h5>
		<a href="login.jsp">User Login</a>
	</h5>
	<h5>
		<a href="login2.jsp">Test Scripting elems n EL syntax</a>
	</h5>
	<h5>
		<a href="test1.jsp">Centralized Error Handling in JSP</a>
	</h5>
	<h5>
		<a href="test2.jsp">Test include directive</a>
	</h5>
	<h5>
		<a href="test4.jsp?pid=123&p_name=bread&price=50">Test JSP's forward | include action</a>
	</h5>
</body>
</html>