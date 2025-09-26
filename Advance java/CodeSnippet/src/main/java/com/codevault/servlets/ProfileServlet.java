package com.codevault.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.codevault.util.PasswordUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String DB_URL = "jdbc:mysql://localhost:3306/codevault";
	private static final String DB_USER = "root";
	private static final String DB_PASS = "yourpassword";

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute("userId") == null) {
			response.sendRedirect("index.jsp");
			return;
		}

		int userId = (int) session.getAttribute("userId");
		String action = request.getParameter("action");

		try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
			Class.forName("com.mysql.cj.jdbc.Driver");

			if ("updateName".equals(action)) {
				String newName = request.getParameter("newName");
				PreparedStatement ps = conn.prepareStatement("UPDATE users SET name = ? WHERE id = ?");
				ps.setString(1, newName);
				ps.setInt(2, userId);
				ps.executeUpdate();
				session.setAttribute("userName", newName);
			}

			if ("updatePassword".equals(action)) {
				String newPassword = request.getParameter("newPassword");
				String hashed = PasswordUtil.hashPassword(newPassword);
				PreparedStatement ps = conn.prepareStatement("UPDATE users SET password = ? WHERE id = ?");
				ps.setString(1, hashed);
				ps.setInt(2, userId);
				ps.executeUpdate();
			}

			response.sendRedirect("profile.jsp");

		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("profile.jsp?error=true");
		}
	}
}
