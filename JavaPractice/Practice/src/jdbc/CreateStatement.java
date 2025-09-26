package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
public class CreateStatement {

	public static void main(String[] args) {
	String sql="select * from employee";
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","root");
	Statement statement=connection.createStatement();
//	int count=statement.executeUpdate(sql);
//	System.out.println(count);
	ResultSet resultSet=statement.executeQuery(sql);
	if(resultSet.next()) {
		System.out.println(resultSet.getInt(1));
		System.out.println(resultSet.getString(2));
	}
	else {
		System.out.println("Record not found!!!");
	}
}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
 }
}
