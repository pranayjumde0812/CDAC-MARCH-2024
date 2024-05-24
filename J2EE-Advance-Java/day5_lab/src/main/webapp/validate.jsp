<%@page import="com.app.core.User"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validation Page</title>
</head>
<%!HashMap<String, User> users;

	public void jspInit() {
		users = new HashMap<>();
		//populate the map
		users.put("abc@gmail.com", new User("abc@gmail.com", "1234", "abc1", 40));
		users.put("abc2@gmail.com", new User("abc2@gmail.com", "12346", "abc2", 24));
		System.out.println("map populated...");

	}%>
<body>
	<h4 align="center">
		Session ID from validate.jsp
		<%=session.getId()%></h4>

	<%
	//servicing --validation logic
	//1. get rq params
	String email = request.getParameter("em");
	String password = request.getParameter("pass");
	//2. validation
	User user = users.get(email);
	if (user != null) {
		//chk password
		if (password.equals(user.getPassword())) {
			//successful login
			out.print("Login successful!!!!!");
			//save validated user details under session scope
			session.setAttribute("user_info", user);
			//redirect
			response.sendRedirect(response.encodeRedirectURL("details.jsp"));
			System.out.println("after redirect");
			return;
		}
	}
	out.print("Invalid email or password");
	%>
	<h5>
		<a href="login2.jsp">Retry</a>
	</h5>
</body>
</html>