package com.codevault.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.codevault.util.PasswordUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String DB_URL = "jdbc:mysql://localhost:3306/codevault";
	private static final String DB_USER = "root";
	private static final String DB_PASS = "root";

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password"); // Match the HTML input name

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
					PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE email = ?")) {

				stmt.setString(1, email);
				ResultSet rs = stmt.executeQuery();

				if (rs.next()) {
					String storedHash = rs.getString("passwordHash");

					boolean isMatch = PasswordUtil.checkPassword(password, storedHash);

					if (isMatch) {
						HttpSession session = request.getSession();
						session.setAttribute("userId", rs.getInt("id"));
						session.setAttribute("userName", rs.getString("name"));
						session.setAttribute("userEmail", rs.getString("email"));
						session.setAttribute("userRole", rs.getString("role"));

						response.sendRedirect("dashboard.jsp");
					} else {
						response.sendRedirect("index.jsp?error=invalid");
					}
				} else {
					response.sendRedirect("index.jsp?error=notfound");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("index.jsp?error=server");
		}
	}
}
