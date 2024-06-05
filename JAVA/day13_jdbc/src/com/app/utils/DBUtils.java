package com.app.utils;

import java.sql.*;

public class DBUtils {
	private static Connection connection;
	private static final String DB_URL;
	private static final String USER_NAME;
	private static final String PASSWORD;

	static {
		DB_URL = "jdbc:mysql://localhost:3306/jdbc1";
		USER_NAME = "root";
		PASSWORD = "1311";
	}

	public static Connection openConnection() throws /* ClassNotFoundException, */ SQLException {
		// OPTIONAL : load JDBC driver it throws ClassNotFoundException
//		Class.forName("com.mysql.cj.jdbc.Driver");
		// get connection form DB : mandatory!
		
		connection = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
		
		return connection;
	}
}
