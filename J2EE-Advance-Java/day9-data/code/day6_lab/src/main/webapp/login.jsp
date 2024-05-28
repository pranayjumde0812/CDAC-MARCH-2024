<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<%--session.getAttribute("user") - null -> session.setAttribute("user",new UserBean()); --%>
<jsp:useBean id="user" class="com.app.beans.UserBean" scope="session" />
<%-- create candidate bean --%>
<jsp:useBean id="candidate_bean" class="com.app.beans.CandidateBean"
	scope="session" />
<body>
	<%--sessionScope.get(user) : UserBean ref --> geMessage() --%>
	<h5 style="color: red;">${sessionScope.user.message}</h5>
	<form action="validate.jsp" method="post">
		<table style="background-color: lightgrey; margin: auto">
			<tr>
				<td>Enter User Email</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><input type="password" name="password" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Login" /></td>
				<td><a href="voter_registration.jsp">Sign Up</a></td>
			</tr>
		</table>
	</form>

</body>
</html>