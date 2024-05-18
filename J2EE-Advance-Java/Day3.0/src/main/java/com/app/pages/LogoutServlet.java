package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.dao.CandidateDaoImpl;
import com.app.dao.UserDaoImpl;
import com.app.entities.User;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1 set cont type
		response.setContentType("text/html");
		//2 get PW
		try(PrintWriter out=response.getWriter()) {
			//3. het HttpSession from WC
			HttpSession hs=request.getSession();
			System.out.println("Logout  servlet , session is new " + hs.isNew());// f
			System.out.println("session ID " + hs.getId());// same for the same clnt
			System.out.println("HS "+hs);
			System.out.println("request "+request);
			out.print("<h5>You have already voted !!!!!!!!!</h5>");
			//4. invalidate the session
			hs.invalidate();
			out.print("<h5>You have logged out....</h5>");
		}
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1. set cont type
		resp.setContentType("text/html");
		//2. get PW
		try(PrintWriter pw=resp.getWriter()) {
			//3. get http session from wc
			HttpSession hs=req.getSession();
			//4. get -- user details n daos
			User user=(User) hs.getAttribute("user_info");
			pw.print("<h5>Hello , "+user.getFirstName()+" "+user.getLastName()+"</h5>");
			UserDaoImpl userDao=(UserDaoImpl)hs.getAttribute("user_dao");
			CandidateDaoImpl candidateDao=(CandidateDaoImpl)hs.getAttribute("candidate_dao");
			//5. get selected candidate id from request param
			int candidateId=Integer.parseInt(req.getParameter("candidate_id"));
			//6. call dao's method to update voting status
			pw.print("<h5>"+userDao.updateVotingStatus(user.getUserId())+"</h5>");
			//7. call dao's method to incr the votes
			pw.print("<h5>"+candidateDao.incrementCandidateVotes(candidateId)+"</h5>");
			//8. discard http session
			hs.invalidate();
			pw.print("<h5>You have logged out....</h5>");
		} catch (Exception e) {
			throw new ServletException("err in do-post of "+getClass(), e);
		}
	}
	

}
