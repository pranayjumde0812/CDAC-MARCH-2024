package com.app.utils;

import java.sql.*;

public class DBUtils {
	private static Connection connection;

	public static void openConnection(String DB_URL, String USER_NAME, String PASSWORD)
			throws /* ClassNotFoundException, */SQLException {
		// OPTIONAL : load JDBC driver
		// Class.forName("com.mysql.cj.jdbc.Driver");
		// get conneciton form DB : mandatory!
		connection = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);// fixed connectivity
	}

	// get connection
	public static Connection getConnection() {
		return connection;
	}

	// add a static method to close connection
	public static void closeConnection() throws SQLException {
		if (connection != null)
			connection.close();
		System.out.println("db cn closed !");
	}

}
