package com.womensafety.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;
import com.womensafety.model.User;
import com.womensafety.util.DBConnection;
import com.womensafety.util.PasswordUtil;

public class UserDAO {

	// Method for User Registration
	public boolean registerUser(User user) {
		boolean result = false;
		try (Connection conn = DBConnection.getConnection()) {
			String sql = "INSERT INTO users (name, email, password, phone) VALUES (?, ?, ?, ?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, user.getName());
			stmt.setString(2, user.getEmail());
			stmt.setString(3, PasswordUtil.hashPassword(user.getPassword())); // Password hashed
			stmt.setString(4, user.getPhone());

			result = stmt.executeUpdate() > 0; // If insertion is successful, result = true
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// Method for User Login
	public User loginUser(String email, String password) {
		User user = null;
		try (Connection conn = DBConnection.getConnection()) {
			String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, email);
			stmt.setString(2, PasswordUtil.hashPassword(password)); // Password hashed

			ResultSet rs = stmt.executeQuery();
			if (rs.next()) { // User found
				user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getString("phone"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user; // Return user or null
	}
}
