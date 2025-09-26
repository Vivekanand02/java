package chatApplication;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	private String url = "jdbc:mysql://localhost:3306/chats";
	private String user = "root";
	private String password = "root";

	public DatabaseConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, user, password);

			System.out.println("Connection established...");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
