package com.app.tester;

import static com.app.utils.DBUtils.openConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class TestPreparedStatement {

	public static void main(String[] args) {

		try (
				// Need Scanner
				Scanner sc = new Scanner(System.in);
				
				// create connectionresultSet.getString("first_name")
				Connection con = openConnection();
				
				// create prepare statement
				PreparedStatement pst = con.prepareStatement("select * from users where email=? and password=?");

		) {
			String email = sc.next();
			String pass = sc.next();
			pst.setString(1, email);
			pst.setString(2, pass);

			try (ResultSet resultSet = pst.executeQuery()) {
				if (resultSet.next()) {
					System.out.println("User Logged In " + resultSet.getString("first_name"));
				} else {
					System.out.println("Invalid Credentials");
				}
			}

		} // JVM :resultSet.close(),statement.close(), con.close()
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
