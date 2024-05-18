package com.app.dao;

import java.sql.SQLException;
import java.util.List;

import com.app.entities.Candidate;

public interface CandidateDao {
//add a method to list all candidates
	List<Candidate> getAllCandidates() throws SQLException;

	// add a method to increment votes
	String incrementCandidateVotes(int candidateId) throws SQLException;
}
