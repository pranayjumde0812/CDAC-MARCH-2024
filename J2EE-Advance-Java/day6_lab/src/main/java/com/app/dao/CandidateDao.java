package com.app.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.app.entities.Candidate;

public interface CandidateDao {
//add a method to get all candidate details
	List<Candidate> getAllCandidates() throws SQLException;

	// add a method to inc votes
	String incrementVotes(int candidateId) throws SQLException;

	// add a method to get top 2 candidates
	List<Candidate> getTop2Candidates() throws SQLException;

	// add a method to get party wise votes
	Map<String, Integer> getPartywiseVotes() throws SQLException;

}
