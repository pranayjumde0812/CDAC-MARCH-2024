package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.dao.UserDaoImpl;
import com.app.entities.User;

/**
 * Servlet implementation class VoterRegistrationServlet
 */
@WebServlet("/register_voter")
public class VoterRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1. set content type
		response.setContentType("text/html");
		
		try (PrintWriter out = response.getWriter()) {
			UserDaoImpl userDao = new UserDaoImpl();
			
			// 2. get http session
			HttpSession session = request.getSession();
			
			// 3. get the request parameters
			String fname = request.getParameter("fn");
			String lname = request.getParameter("ln");
			String email = request.getParameter("em");
			String password = request.getParameter("pass");
			String dob = request.getParameter("dob");
			
			try {
				User user = new User(fname, lname, email, password, Date.valueOf(dob));

				if (userDao.voterRegistration(user).equals("success")) {
					response.sendRedirect("login.html");
				} else {
					response.sendRedirect("voter_registration.html");
				}
			} catch (Exception e) {
				e.printStackTrace();
				response.sendRedirect("voter_registration.html");
			}

		} catch (Exception e) {
			throw new ServletException("Error in " + getClass(), e);
		}

	}

}
