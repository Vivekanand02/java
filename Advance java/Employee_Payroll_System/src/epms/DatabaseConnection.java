package epms;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	private static String url = "jdbc:mysql://localhost:3306/PayrollDB";
	private static String user = "root";
	private static String password = "root";

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Database established...");
		} catch (Exception e) {
			System.out.println("Database not established!!!" + e);
		}
		return connection;
	}
}
