package web_pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet1
 */
//@WebServlet("/myservlet1")  // no need when we do xml mapping for the class
/*
 * Its a run time , class level , mandatory annotation meant for web container
 * when you deploy a web app , WC creates a map key -- url pattern(/myservlet)
 * value -- F.Q. Servlet Class Name URL -- http://host:port/myservlet
 * 
 * http -- app layer protocol(schme) host -- DNS qualified host
 * name(www.abc.com) OR IP address port -- TCP port number (default port = 8080)
 * 
 * URI/Path -- /Day1.1/myservlet
 * 
 * /Day1.1 - context (=web app) root
 * 
 * /myservlet -- URL pattern
 * 
 */
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("In Init Method from " + getClass());
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("In Do get " + getClass());
		// 1. set response content type
		response.setContentType("text/html");

		// 2. Get the PrintWriter from HttpServletResponse
		// to send buffered text contents --> to the client
		try (PrintWriter pw = response.getWriter()) {
			// add dynamic contents to PW's buffer
			pw.print("<h1> Hello Guys, i am pranay" + LocalDate.now() + "</h1>");
		}

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	public void destroy() {
		System.out.println("In Destroy Method" + getClass());
	}

}
