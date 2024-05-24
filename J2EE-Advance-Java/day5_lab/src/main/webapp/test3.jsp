<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--try to display private members of the earlier page --%>
<h5>Instance var - <%= mesg1 %></h5>
<h5>Local var - <%= mesg2 %></h5>
<h5>Page scoped attribute - ${pageScope.nm1}</h5>
</body>
</html>