<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Blogger Home page</title>
</head>
<body>
	<h5>${sessionScope.message}</h5>
	<h6>User Details - ${sessionScope.user_details}</h6>
	<table style="background-color: lightgrey; margin: auto">
		<caption>All Blog Posts</caption>
		<c:forEach var="dto" items="${requestScope.blog_posts}">
			<tr>
				<td>${dto.title}</td>
				<td>${dto.desc}</td>
				<td>${dto.updationDate}</td>
				<td>${dto.bloggerName}</td>
				<td>${dto.categoryName}</td>
			</tr>
		</c:forEach>
	</table>
	<c:url var="url" value="/users/logout"/>
	<h5 align="center"><a href="${url}">Log Out</a></h5>

</body>
</html>