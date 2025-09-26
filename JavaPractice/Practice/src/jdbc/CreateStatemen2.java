package jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateStatemen2 {

	public static void main(String[] args) {
		String query="insert into employee(empId,empName)values(2,'vivi')";
		String url="jdbc:mysql://localhost:3306/office";
		String username="root";
		String password="root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class loaded successfully...");
			Connection connection=DriverManager.getConnection(url,username,password);
			System.out.println("Connected successfully...");
			Statement statement=connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("Statement created...");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	

	}

}
