package sms;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("DATABASE connected successfully");

		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;
	}
}
