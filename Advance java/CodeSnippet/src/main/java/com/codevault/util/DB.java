package com.codevault.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

	private static final String url = "jdbc:mysql://localhost:3306/codevault";
	private static final String user = "root";
	private static final String pass = "root";

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // For MySQL 8+
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, pass);
	}
}
