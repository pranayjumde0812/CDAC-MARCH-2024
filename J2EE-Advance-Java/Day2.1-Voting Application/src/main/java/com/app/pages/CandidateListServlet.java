package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CandidateListServlet
 */
@WebServlet("/candidate_list")
public class CandidateListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. set cont type
		response.setContentType("text/html");
		// 2 get PW
		try (PrintWriter pw = response.getWriter()) {
			pw.print("<h5>in candidate list page....: successful login!</h5>");

			Cookie[] cookies = request.getCookies();
			if (cookies != null) {
				for (Cookie c : cookies) {
					if (c.getName().equals("user_details")) {
						pw.print("<h4> User Details " + c.getValue() + "</h4>");
						break;
					}
				}
			}
			// send voter details to the clnt
			pw.print("<h4> User Email - " + request.getParameter("em") + "</h4>");
		}
	}

}
