package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.UserDaoImpl;
import com.app.entities.User;

/**
 * Servlet implementation class LoginServlet
 * 
 */
@WebServlet(value = "/login", loadOnStartup = 1) // eager init
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDaoImpl userDao;

	/*
	 * Overriding form of method cannot throw any new checked or Broader exception
	 * 
	 */

	@Override
	public void init() throws ServletException {
		System.out.println("in init of " + getClass());
		try {
			// create user dao instance
			// dependent: servlet ,dependency, - user dao(DAL)
			// dependent object is creating its own dependency

			userDao = new UserDaoImpl();
		} catch (Exception e) {
			// centralized exc handling in Servlet
			/*
			 * In case of err in init --To inform the WC throw ServletException --WC will
			 * abort the life cycle Ctor of javax.servlet.ServletException(String mesg,
			 * Throwable rootCause)
			 */
			throw new ServletException("err in init - " + getClass(), e);
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			// WC invokes it once @ end of the life cycle
			// clean up Dao
			userDao.cleanUp();
		} catch (Exception e) {
			System.out.println("err in destroy - " + getClass());
		}

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. set resp cont type
		response.setContentType("text/html");
		// 2. Get PW to send text resp
		try (PrintWriter pw = response.getWriter()) {
			// 3. Get req params(email n pwd) from the req
			String email = request.getParameter("em");
			String password = request.getParameter("pass");
			// 4. Invoke user dao's --sign in method for user authentication
			User user = userDao.signIn(email, password);
			// 5 . check if valid (via null)
			if (user == null) {
				// invalid login --send retry link --login.html
				pw.print("<h5>Invalid Login , Please  <a href='login.html'>Retry</a><h5>");
			} else {
				// valid login --continue to role based authorization
//				pw.print("<h5>Successful Login </h5>");
//				pw.print("<h5> User Details "+user+"</h5>");
				if (user.getRole().equals("voter")) {
					// => voter login --> check the voting status
					// 1. javax.servlet.http.Cookie(String name, String value)
					Cookie c = new Cookie("user_details", user.toString());
					// 2. Send the cookie to client , using response header
					// HttpServletRsponse's Method
					response.addCookie(c);

					if (user.isStatus()) // => already voted --> redirect to logout page
						response.sendRedirect("logout");
					else // voter : not yet voted --> redirect to candidate list page
						response.sendRedirect("candidate_list");
					/*
					 * WC - 1. Clears / empties the PW's buffer. 2. Sends temporary redirect
					 * response - SC 302 , Location "candidate_list" resp body is empty
					 * 
					 * 3. Set Cookie - Cookie name value resp body - empty
					 * 
					 * 4. Client Browser
					 * 
					 * 
					 */

				} else {
					// admin login -- redirect the clnt to admin page in NEXT request coming from
					// the clnt

					response.sendRedirect("/admin");
				}

			}

		} // JVM : pw.close --> flush --> render/commits the resp
		catch (Exception e) {
			// inform the WC about the exc
			throw new ServletException("err in servicing " + getClass(), e);
		}

	}

}
