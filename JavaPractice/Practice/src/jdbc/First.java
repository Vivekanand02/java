package jdbc;

import 	java.sql.Connection;
import 	java.sql.DriverManager;
import 	java.sql.SQLException;
import 	java.sql.Statement;
public class First {

	public static void main(String[] args) {
		String sql="drop table employee";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","root");
			Statement statement=connection.createStatement();
			int count=statement.executeUpdate(sql);
			System.out.println(count);
			System.out.println("Done...");
			connection.close();
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		}
}
