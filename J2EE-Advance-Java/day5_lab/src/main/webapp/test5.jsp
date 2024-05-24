<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details Page</title>
</head>
<body>
<h5>From 2nd page....</h5>
	<%--request.getAttribute("product_details") --%>
	<h4>Product Details - ${requestScope.product_details}</h4>
	<h5>param - ${param}</h5>
</body>
</html>