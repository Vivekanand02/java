package jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

class Choices{
	void choice() {
		System.out.println("1.Add record");
		System.out.println("2.Update record");
		System.out.println("3.Remove record");
		System.out.println("4.Find record");
		System.out.println("5.Find all record");
		System.out.println("6.Exit");
		
	System.out.println("----------------------");
	}
}
public class ImployeesInformation {
	
 public static void main(String[] args) {
	 
	 	Choices c=new Choices();
		Scanner scanner=new Scanner(System.in);
		String add ="insert into employee(empId,empName,email,phone,city)values(?,?,?,?,?)";
		String update="UPDATE employee SET empId = ?, empName = ?, email = ?,phone = ?,city = ? WHERE empId=?";
		String url="jdbc:mysql://localhost:3306/office";
		String username="root";
		String password="root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url,username,password);
			System.out.println("Connection build...");
			System.out.println("---------------------");
			boolean exit=false;
			while(!exit) {
			c.choice();
			System.out.print("Enter any choice : ");
			Integer choose=scanner.nextInt();
			
			switch(choose) {
			case 1: System.out.println("Add record");
					System.out.println("-------------------");
					
					System.out.print("Enter the empId :");
					int empId=scanner.nextInt();
					scanner.nextLine();
					
					System.out.print("Enter the empName :");
					String empName=scanner.nextLine();
					
					System.out.print("Enter the email :");
					String email=scanner.nextLine();
					
					System.out.print("Enter the Phone no. :");
					String phone=scanner.nextLine();
				
					System.out.print("Enter the city :");
					String city=scanner.nextLine();
					
					PreparedStatement preparedStatement=connection.prepareStatement(add);
					preparedStatement.setInt(1,empId);
					preparedStatement.setString(2,empName);
					preparedStatement.setString(3,email);
					preparedStatement.setString(4,phone);
					preparedStatement.setString(5,city);
					
					int rowsAffected=preparedStatement.executeUpdate();
					System.out.println(rowsAffected+" row affected");
					break;
		   	case 2: System.out.println("Update the record");
		   	System.out.println("-------------------");
			
			System.out.print("Update the empId :");
			empId=scanner.nextInt();
			
			System.out.print("Update the empName :");
		empName=scanner.nextLine();
			
			System.out.print("Update the email :");
			email=scanner.nextLine();
			
			System.out.print("Update the Phone :");
			phone=scanner.nextLine();
			
			System.out.print("Update the city :");
			city=scanner.nextLine();
			
			preparedStatement=connection.prepareStatement(update);
			preparedStatement.setInt(1,empId);
			preparedStatement.setString(2,empName);
			preparedStatement.setString(3,email);
			preparedStatement.setString(4,phone);
			preparedStatement.setString(5,city);
				break;
		   	case 3: System.out.println("Exit");
		   	exit=true;
		   	break;
			}
			connection.close();
			
		}
	}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		scanner.close();
		
	}

}
