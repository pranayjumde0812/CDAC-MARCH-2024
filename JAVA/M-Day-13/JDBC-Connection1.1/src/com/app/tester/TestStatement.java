package com.app.tester;

import static com.app.utils.DBUtils.openConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestStatement {

	public static void main(String[] args) {

		try (
				// create connectionresultSet.getString("first_name")
				Connection con = openConnection();
				// create statement
				Statement statement = con.createStatement();
				// Create Result set
				ResultSet resultSet = statement.executeQuery("select * from users order by email")

		) {

			// result set processing
			// cursor is at before 1st record
			while (resultSet.next()) {

				int id = resultSet.getInt("id");
				String fname = resultSet.getString("first_name");
				String lname = resultSet.getString("last_name");
				String email = resultSet.getString("email");
				String pass = resultSet.getString("password");
				Date dob = resultSet.getDate("dob");
				boolean status = resultSet.getBoolean("status");
				String role = resultSet.getString("role");

				System.out.println(id + " " + fname + " " + lname + " " + email + " " + pass + " " + dob + " " + status
						+ " " + role);
			}

		} // JVM :resultSet.close(),statement.close(), con.close()
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
