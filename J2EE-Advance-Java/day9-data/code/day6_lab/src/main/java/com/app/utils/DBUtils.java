package com.app.utils;

import java.sql.*;

public class DBUtils {
	private static Connection connection;
	private static final String DB_URL;
	private static final String USER_NAME;
	private static final String PASSWORD;
	static {
		DB_URL = "jdbc:mysql://localhost:3306/iacsd_mar24";
		USER_NAME = "root";
		PASSWORD = "root";
	}

	public static Connection openConnection() 
			throws /* ClassNotFoundException, */SQLException {
		// OPTIONAL : load JDBC driver
	//	Class.forName("com.mysql.cj.jdbc.Driver");
		// get conneciton form DB : mandatory!
		connection = DriverManager.getConnection
				(DB_URL, USER_NAME, PASSWORD);//fixed connectivity
		return connection;
	}
	//add a static method to close connection
	public static void closeConnection() throws SQLException{
		if(connection != null)
			connection.close();
		System.out.println("db cn closed !");
	}
}
