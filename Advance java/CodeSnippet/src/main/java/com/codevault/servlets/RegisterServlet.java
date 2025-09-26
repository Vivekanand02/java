package com.codevault.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.codevault.util.PasswordUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Change these to match your DB setup
	private static final String url = "jdbc:mysql://localhost:3306/codevault";
	private static final String user = "root";
	private static final String pass = "root";

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		Connection conn = null;
		PreparedStatement checkStmt = null;
		PreparedStatement insertStmt = null;
		ResultSet rs = null;

		try {
			// Load JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Connect to DB
			conn = DriverManager.getConnection(url, user, pass);

			// Check if email already exists
			String checkQuery = "SELECT * FROM users WHERE email = ?";
			checkStmt = conn.prepareStatement(checkQuery);
			checkStmt.setString(1, email);
			rs = checkStmt.executeQuery();

			if (rs.next()) {
				// Email already registered
				response.sendRedirect("register.jsp?msg=exists");
			} else {
				// Insert new user
				String insertQuery = "INSERT INTO users (name, email, passwordHash) VALUES (?, ?, ?)";

				insertStmt = conn.prepareStatement(insertQuery);
				insertStmt.setString(1, name);
				insertStmt.setString(2, email);
				String hashedPassword = PasswordUtil.hashPassword(pass);
				insertStmt.setString(3, hashedPassword);

				int rowsInserted = insertStmt.executeUpdate();

				if (rowsInserted > 0) {
					response.sendRedirect("register.jsp?msg=success");
				} else {
					response.sendRedirect("register.jsp?msg=error");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("register.jsp?msg=error");
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (checkStmt != null)
					checkStmt.close();
				if (insertStmt != null)
					insertStmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}
