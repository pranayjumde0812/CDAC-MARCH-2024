<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:setProperty property="*" name="user" />
<%-- invoke user bean's method for validation n registration --%>
<h5> Registration status - ${sessionScope.user.validateAndRegister()}</h5>
<body>

</body>
</html>