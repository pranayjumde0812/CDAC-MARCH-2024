<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<jsp:useBean id="user" class="com.app.beans.UserBean" scope="session" />
<!DOCTYPE html>
<html>
<head>
<%-- <jsp:useBean id="user_registration" class="com.app.beans.UserBean" scope="session" /> --%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:setProperty property="*" name="user"/>
<body>
<h5>Registration Status - ${sessionScope.user.validateAndRegister()}</h5>
</body>
</html>