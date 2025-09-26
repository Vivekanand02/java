
import 	java.sql.Connection;
import 	java.sql.DriverManager;
import 	java.sql.SQLException;
import 	java.sql.Statement;
public class Demo {

	public static void main(String[] args) {
		String className="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/products?autoReconnect=true&useSSL=false";
		String userName="root";
		String password="root";
		String sql="create table employee (empId int,empName varchar(20))";
		try {
			Class.forName(className);
			Connection connection=DriverManager.getConnection(url,userName,password);
			Statement statement=connection.createStatement();
			int count=statement.executeUpdate(sql);
			System.out.println(count);
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
