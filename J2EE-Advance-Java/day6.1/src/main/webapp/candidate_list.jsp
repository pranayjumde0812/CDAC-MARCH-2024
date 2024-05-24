<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Candidate list Page</title>
</head>
<body>
	<h5>In candidate list page ...</h5>
	<%-- sessionScope.get(user) : userBean ref -getUserDetails -User entity - getFirstName --%>
	<h5>Hello , ${sessionScope.user.userDetails.firstName}
		${sessionScope.user.userDetails.lastName}</h5>
	<h5>Voting status - ${sessionScope.user.userDetails.status}</h5>


	<table style="background-color: powderblue; margin: auto;" border=1>
		<caption>Caste Vote</caption>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Party</th>
			<th>Choose To Vote</th>
		</tr>
		<c:forEach var="c"
			items="${sessionScope.candidate_bean.candidateDetailsForVoter}">
			<tr>
				<td>${c.candidateId}</td>
				<td>${c.candidateName}</td>
				<td>${c.party}</td>
				<td><a href="caste_vote.jsp?candidateId=${c.candidateId}">Vote</a></td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>