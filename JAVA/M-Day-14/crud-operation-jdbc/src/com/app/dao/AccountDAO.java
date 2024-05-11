package com.app.dao;

import java.sql.SQLException;

public interface AccountDAO {
	// add a method for invoking a stored procedure from DB
	// to transfer funds
	String transferFunds(int sourceAccountNumber, int destinationAccountNumber, double amount) throws SQLException;
}
