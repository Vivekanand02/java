package epms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class User {
	int id;
	String name;

}

class Admin extends User {
	private static Connection connection;

	public Admin() {
		Admin.connection = DatabaseConnection.getConnection();
	}

	public static void addEmployee(int id, String name, String role, double salary, String employementType) {
		String sql = "insert into employees(id,name,role,salary,employment_type )values(?,?,?,?,?)";

		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, role);
			pstmt.setDouble(4, salary);
			pstmt.setString(5, employementType);
			pstmt.executeUpdate();
			System.out.println("Employee added...");
			pstmt.close();
		} catch (Exception e) {
			System.out.println("facing error to add employee!!!" + e);
		}
	}

	public static void removeEmployee(int id) {
		String sql = "delete from employees where id=?";

		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			System.out.println("Employee removed successfully...");
			pstmt.close();
		} catch (Exception e) {
			System.out.println("Employee not removed!!!" + e);
		}
	}

	public static void viewEmployee(int id) {
		String sql = "select * from employees where id=?";

		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet resultSet = pstmt.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name"));
			}
			System.out.println("Employee displayed...");
			pstmt.close();
		} catch (Exception e) {
			System.out.println("Employee not displayed!!!" + e);
		}
	}

	public static void updateEmployee(int id, String name) {
		String sql = "update from employee set name=? where id=?";

		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
			System.out.println("Employee details updated successfully...");
			pstmt.close();
		} catch (Exception e) {
			System.out.println("Employee details not updated!!!" + e);
		}
	}
}

class Employee extends User {
	private String role;
	private Double salary;
	private String employmentType;

	public Employee(int id, String name, String role, Double salary, String employmentType) {
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
		this.employmentType = employmentType;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public Double getSalary() {
		return salary;
	}

	public String getEmploymentType() {
		return employmentType;
	}
}

class FullTimeEmployee extends Employee {
	public FullTimeEmployee(int id, String name, String role, Double salary) {
		super(id, name, role, salary, "FullTime");
	}

	public double calculateSalary() {
		return getSalary();
	}
}

class PartTimeEmployee extends Employee {
	private int hoursWorked;
	private double hourlyRate;

	public PartTimeEmployee(int id, String name, String role, double hourlyRate, int hoursWorked) {
		super(id, name, role, hourlyRate * hoursWorked, "PartTime");
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	public double calculateSalary() {
		return hourlyRate * hoursWorked;
	}
}
