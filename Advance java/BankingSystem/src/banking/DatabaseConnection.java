package banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	static String url = "jdbc:mysql://localhost:3306/bank", password = "root", user = "root";

	public static void getConnection() {
		try {
			Class.forName("com.mysql.jdbc.cj.Driver");
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connection established.");

		}

		catch (ClassNotFoundException e) {
			System.out.println("Class not found!!!");
		} catch (SQLException e) {
			System.out.println("SQL has some issue");
		}
	}
}
