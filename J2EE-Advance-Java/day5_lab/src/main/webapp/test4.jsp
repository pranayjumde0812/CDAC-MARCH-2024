<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h5>From 1st page....</h5>
	<%-- display product details using EL syntax --%>
	<%-- <h5>Product ID - ${param.pid}</h5>
	<h5>Product Name - ${param.p_name}</h5>
	<h5>Product Price - ${param.price}</h5>
	<h5>${param}</h5> --%>
	<%--create an attribute to store product details 
	n forward the clnt to test5.jsp--%>
	<%
	out.flush();//no Illgeal state exc
	//create request scoped attribute to store product details
	String details=request.getParameter("pid")+" "
	+request.getParameter("p_name")+" "
			+request.getParameter("price");
	request.setAttribute("product_details", details);
	%>
	<jsp:include page="test5.jsp" />
	<h5>post include contents....</h5>
</body>
</html>