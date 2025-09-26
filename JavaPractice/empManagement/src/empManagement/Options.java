package empManagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class Options {
	Scanner scanner=new Scanner(System.in);
	static void connectivity() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
			}
	}
			void options() {
			System.out.println("Press 1 to Add new employee data");
			System.out.println("Press 2 to Update  employee data");
			System.out.println("Press 3 to Delete  employee data");
			System.out.println("Press 4 to Show employee data");
			System.out.println("Press 5 to Show all employee data");
			System.out.println("Press 6 to Exit");
		}
			 String insert="insert into employee(empId,empName,email,phone,city)values(?,?,?,?,?)";
			 String update="update employee set empName=? where empId=?";
			 String delete="delete from employee where empId=?";
			 String show="select * from employee where empId=?";
			 String showAll="select * from employee";
			
		    void add() {
		    	
		    System.out.print("Enter id of the employee : ");
			Integer id=scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("Enter name of the employee : ");
			String name=scanner.nextLine();
			
			System.out.print("Enter email of the employee : ");
			String email=scanner.nextLine();
			
			System.out.print("Enter phone of the employee : ");
			String phone=scanner.nextLine();
			
			System.out.print("Enter city of the employee : ");
			String city=scanner.nextLine();
			try {
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement(insert);
			preparedStatement.setInt(1,id);
			preparedStatement.setString(2,name);
			preparedStatement.setString(3,email);
			preparedStatement.setString(4,phone);
			preparedStatement.setString(5,city);
			
			int rowsAffected=preparedStatement.executeUpdate();
			System.out.println();
			 if (rowsAffected > 0) 
	                System.out.println("Employee added successfully.");
			 
	             else 
	                System.out.println("No employee added");
	            
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		 void update() {
			System.out.print("Update name of the employee : ");
			String name=scanner.nextLine();
			
			System.out.print("Enter the id of the employee : ");
			Integer id=scanner.nextInt();
			try {
				
				Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","root");
				PreparedStatement preparedStatement=connection.prepareStatement(update);
				preparedStatement.setString(1,name);
				preparedStatement.setInt(2,id);
				
				int rowsAffected=preparedStatement.executeUpdate();
				System.out.println();
				 if (rowsAffected > 0) 
		                System.out.println("Employee name updated successfully.");
				 
		             else 
		                System.out.println("No employee updated");
		            }
			
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		 void delete() {
			System.out.print("Delete id of the employee : ");
			Integer id=scanner.nextInt();
			
			try {
				Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","root");
				PreparedStatement preparedStatement=connection.prepareStatement(delete);
				preparedStatement.setInt(1,id);
				
				int rowsAffected=preparedStatement.executeUpdate();
				 if (rowsAffected > 0) 
		                System.out.println("Employee name deleted successfully.");
		             else 
		                System.out.println("No employee name deleted");
		       
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
		}
		 void show() {
			System.out.print("Enter Id of the employee : ");
			Integer id=scanner.nextInt();
			try {
				Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","root");
				PreparedStatement preparedStatement=connection.prepareStatement(show);
				preparedStatement.setInt(1,id);
				ResultSet resultSet=preparedStatement.executeQuery();
				 if (resultSet.next()) {
					 	System.out.println("----------------------");
		                System.out.println("ID: " + resultSet.getInt("empId"));
		                System.out.println("----------------------");
		                System.out.println("Name: " + resultSet.getString("empName"));
		                System.out.println("----------------------");
		                System.out.println("Email: " + resultSet.getString("email"));
		                System.out.println("----------------------");
		                System.out.println("Phone: " + resultSet.getString("phone"));
		                System.out.println("----------------------");
		                System.out.println("City: " + resultSet.getString("city"));
		                System.out.println("----------------------");
		            } else 
		            {
		                System.out.println("Record not found.");
		            }

				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		 void showAll() {
			 try {
					Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","root");
					PreparedStatement preparedStatement=connection.prepareStatement(showAll);
					ResultSet resultSet=preparedStatement.executeQuery();
					while(resultSet.next()) {
						
								System.out.println("----------------------");
				                System.out.println("ID: " + resultSet.getInt("empId"));
				                System.out.println("----------------------");
				                System.out.println("Name: " + resultSet.getString("empName"));
				                System.out.println("----------------------");
				                System.out.println("Email: " + resultSet.getString("email"));
				                System.out.println("----------------------");
				                System.out.println("Phone: " + resultSet.getString("phone"));
				                System.out.println("----------------------");
				                System.out.println("City: " + resultSet.getString("city"));
				                System.out.println("----------------------");
				      }
			 }
					catch(SQLException e) {
						e.printStackTrace();
					}
		}
	}
