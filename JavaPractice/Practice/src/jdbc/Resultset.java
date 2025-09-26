package jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Resultset {
	public static void main(String[] args) {
			String query="select * from employee";
			String url="jdbc:mysql://localhost:3306/office";
			String username="root";
			String password="root";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection=DriverManager.getConnection(url,username,password);
				Statement statement=connection.createStatement();
				ResultSet resultSet=statement.executeQuery(query);
				while(resultSet.next()) {
					System.out.println(resultSet.getInt(1));
					System.out.println(resultSet.getString(2));
					System.out.println("-----|-----|-----");
				}
				connection.close();
				}
			catch(ClassNotFoundException i) 
			{
				System.out.println(i);
			}
			
			catch(SQLException i) {
				i.printStackTrace();
			}
}
}
