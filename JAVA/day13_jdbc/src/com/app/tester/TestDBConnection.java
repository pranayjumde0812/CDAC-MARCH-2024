package com.app.tester;

import java.sql.*;
import static com.app.utils.DBUtils.openConnection;

public class TestDBConnection {

	public static void main(String[] args) {
		try (Connection cn = openConnection()) {
			System.out.println("connected to DB " + cn);//
		} // JVM : cn.close()
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
