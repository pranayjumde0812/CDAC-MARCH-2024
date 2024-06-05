package com.app.dao;

import static com.app.utils.DBUtils.closeConnection;
import static com.app.utils.DBUtils.openConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class AccountDAOImpl implements AccountDAO {

	private Connection con;
	private CallableStatement callableStatement;

	public AccountDAOImpl() throws SQLException {
		// get DB Connection
		con = openConnection();

		// create CST to invoke stored procedure
		callableStatement = con.prepareCall("{call transfer_funds_proc(?,?,?,?,?)}");

		// register OUT param
		callableStatement.registerOutParameter(4, Types.DOUBLE);
		callableStatement.registerOutParameter(5, Types.DOUBLE);
		System.out.println("Account DAO created");
	}

	@Override
	public String transferFunds(int sourceAccountNumber, int destinationAccountNumber, double amount)
			throws SQLException {

		// 1.set IN param
		callableStatement.setInt(1, sourceAccountNumber);
		callableStatement.setInt(2, destinationAccountNumber);
		callableStatement.setDouble(3, amount);

		// 2. Execute the procedure
		if (!callableStatement.execute()) {
			return "Money transfer successfully";
		}
		return "Something went wrong";
	}

	public void cleanUp() throws SQLException {
		System.out.println("user dao cleaned up");

		if (callableStatement != null)
			callableStatement.close();
		closeConnection();
	}

}
