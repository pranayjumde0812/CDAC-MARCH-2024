<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Details Page</title>
</head>
<%!//JSP declaration block
	String mesg = "some mesg";
	int visits;

	int increment() {
		return visits++;
	}

	public void jspInit() {
		System.out.println("in jsp init");
		visits = 1;
	}%>
<body>
	<h4 align="center">
		Session ID -
		<%=session.getId()%></h4>

	<h4>Details via JSP Scriptlet</h4>
	<%
	//JSP scriptlet
	String email = request.getParameter("em");
	String pwd = request.getParameter("pass");
	out.print("<h4> Email " + email + " Password " + pwd + "</h4>");
	%>
	<hr />
	<h4>Details via JSP Expression</h4>
	<h5>
		Email -
		<%=request.getParameter("em")%></h5>
	<h5>
		Password -
		<%=request.getParameter("pass")%></h5>
	<hr />
	<h4>Details via EL Syntax</h4>
	<h5>Email - ${param.em}</h5>
	<h5>Password - ${param.pass}</h5>
	<h5>What will be the o/p ?</h5>
	<h5>${param}</h5>
	<h5>Print session ID using EL syntax</h5>
	<%--pageContext.getSession().getId() --%>
	<h5>Session ID - ${pageContext.session.id}</h5>
	<%--cookie.get("JSESSIONID").getValue() --%>
	<h5>Session ID, via cookies - ${cookie.JSESSIONID.value}</h5>
	<%--display visit counter --%>
	<h5>Visited - <%= increment() %></h5>
</body>
<%!public void jspDestroy() {
		System.out.println("in jsp destroy");
		visits =0;
	}%>
</html>