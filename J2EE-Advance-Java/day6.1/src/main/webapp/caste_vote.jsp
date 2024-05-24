<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${sessionScope.user.userDetails.userId}</h1>
<%-- <h1>${sessionScope.candidate_bean.candidateDetailsForVoter.candidatId}</h1> --%>
<%-- <h1>

<%-- <h2>${param.candidateId}</h2> --%>

<!-- Add vote To candidate -->
 ${sessionScope.candidate_bean.incrementVotes(${param.candidateId})}

<!-- Update User Voting Status -->
${sessionScope.user.userDao.incrementVotes(${sessionScope.user.userDetails.userId})}

</body>
</html>