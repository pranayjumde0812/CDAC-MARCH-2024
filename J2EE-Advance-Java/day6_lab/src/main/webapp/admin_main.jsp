<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
	<h5>In admin page ...</h5>
	<h5 style="color: green;">${sessionScope.user.message}</h5>
	<%-- sessionScope.get(user) : userBean ref -getUserDetails -User entity - getFirstName --%>
	<h5>Hello , ${sessionScope.user.userDetails.firstName}
		${sessionScope.user.userDetails.lastName}</h5>
	<h6>You have logged in under ${sessionScope.user.userDetails.role}</h6>
	<%-- display top 2 candidate detail in a table --%>
	<table style="background-color: lightgrey; margin: auto">
		<caption>Top 2 Candidates</caption>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Party</th>
			<th>Votes</th>
		</tr>
		<c:forEach var="c" items="${sessionScope.candidate_bean.candidates}">
			<tr>
				<td>${c.candidateId}</td>
				<td>${c.candidateName}</td>
				<td>${c.party}</td>
				<td>${c.votes}</td>
			</tr>
		</c:forEach>
	</table>
	<hr />
	<table style="background-color: lightgrey; margin: auto">
		<caption>Partywise Votes</caption>
		<tr>
			<th>Party Name</th>
			<th>Votes</th>
		</tr>
		<c:forEach var="entry"
			items="${sessionScope.candidate_bean.partyVotes}">
			<tr>
				<td>${entry.key}</td>
				<td>${entry.value}</td>
			</tr>
		</c:forEach>
	</table>
	<%-- invalidate session --%>
	${pageContext.session.invalidate()}
	<h5>Admin has logged out...</h5>
	<h5>
		<a href="login.jsp">Visit Again</a>
	</h5>

</body>
</html>