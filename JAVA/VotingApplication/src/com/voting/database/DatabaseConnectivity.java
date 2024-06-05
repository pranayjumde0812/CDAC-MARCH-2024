package com.voting.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectivity {
    private static Connection connection;
    private static final String DB_URL;
    private static final String USERNAME;
    private static final String PASSWORD;

    static {
        DB_URL = "jdbc:mysql://localhost:3306/voter_application_jdbc";
        USERNAME = "root";
        PASSWORD = "1311";
    }

    public static Connection openConnection() throws ClassNotFoundException, SQLException {
        // Load Driver
//        Class.forName("com.mysql.cj.jdbc.Driver");

        // Get Connection
        connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
//        System.out.println(connection);

        return connection;
    }

    //add a static method to close connection
    public static void closeConnection() throws SQLException {
        if (connection != null)
            connection.close();
        System.out.println("Database Connection Closed !");
    }


}
