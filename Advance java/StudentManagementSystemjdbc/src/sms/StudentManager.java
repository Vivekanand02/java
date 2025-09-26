package sms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentManager {

	private Connection connection;

	public StudentManager() {
		connection = DatabaseConnection.getConnection();

	}

	public void addStudent(String name, String course) {
		String sql = "INSERT into student(name,course)values(?,?)";
		try (PreparedStatement pstmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			pstmt.setString(1, name);
			pstmt.setString(2, course);

			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Student added Successfully!!!");
	}

	public void view() {
		String sql = "select * from student ";
		try (PreparedStatement pstmt = connection.prepareStatement(sql)) {

			ResultSet resultSet = pstmt.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name") + " "
						+ resultSet.getString("course"));

			}
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}

	public void update(int id, String course) {
		String sql = "UPDATE student set course=? where id=?";
		try (Connection connection = DatabaseConnection.getConnection();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {
			pstmt.setString(1, course);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
			pstmt.close();
			System.out.println("Student details updated.");
			return;
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Student Id not found.");
	}

	public void remove(int id) {
		String sql = "Delete from student where id=?";
		try (Connection connection = DatabaseConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
			preparedStatement.setInt(1, id);
			int rowAffected = preparedStatement.executeUpdate();
			if (rowAffected > 0)
				System.out.println("Student removed successfully...");
			else
				System.out.println("ID not found!!!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
