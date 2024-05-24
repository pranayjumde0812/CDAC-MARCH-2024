package com.app.beans;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.app.dao.CandidateDaoImpl;
import com.app.entities.Candidate;

public class CandidateBean {
//depcy -- candidate dao
	private CandidateDaoImpl candidateDaoImpl;

	public CandidateBean() throws SQLException {
		// create candidate dao instance
		candidateDaoImpl = new CandidateDaoImpl();
		System.out.println("candidate bean created");
	}

	public CandidateDaoImpl getCandidateDaoImpl() {
		return candidateDaoImpl;
	}

	// add B.L method to get top 2 candidates
	public List<Candidate> getCandidates() throws SQLException {
		return candidateDaoImpl.getTop2Candidates();
	}

	// add B.L method to get partywise votes
	public Map<String, Integer> getPartyVotes() throws SQLException {
		return candidateDaoImpl.getPartywiseVotes();
	}

}
