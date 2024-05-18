package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.dao.CandidateDaoImpl;
import com.app.entities.Candidate;
import com.app.entities.User;

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
			// get clnt details from the HttpSession
			// 1. get HttpSeesion from WC
			HttpSession hs = request.getSession();
			System.out.println("Candidate list servlet , session is new " + hs.isNew());// f
			System.out.println("session ID " + hs.getId());// same for the same clnt
			// get state from session scope
			User user = (User) hs.getAttribute("user_info");
			if (user != null) {
				pw.print("<h4> Hello " + user.getFirstName() + " " + user.getLastName() + "</h4>");
				pw.print("<h3 align='center'> Candidate List </h3>");
				// 2. get candidate dao from session
				CandidateDaoImpl dao = (CandidateDaoImpl) hs.getAttribute("candidate_dao");
				// 3. invoke dao's method to get list of candidates
				List<Candidate> candidateList = dao.getAllCandidates();
				// 4. dynamic form generation
				pw.print("<form action='logout' method='post'>");
				for (Candidate c : candidateList) {
					pw.print("<h5><input type='radio' name='candidate_id' value='" + c.getCandidateId() + "'/>"
							+ c.getCandidateName() + " " + c.getParty() + "</h5>");
				}
				pw.print("<h5><input type='submit' value='Vote'/></h5>");
				
				pw.print("</form>");
			} else
				pw.print("<h4> No Cookies , Session Tracking Failed !!!!</h4>");
			} catch (Exception e) {
			throw new ServletException("err in do-get of " + getClass(), e);
		}
	}

}
