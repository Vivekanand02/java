package com.ems.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class DashboardServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int totalEmployees = 0;
		int totalDepartments = 0;
		int activeProjects = 0;
		int pendingRequests = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems_db", "root", "password");

			Statement stmt = conn.createStatement();

			ResultSet rs1 = stmt.executeQuery("SELECT COUNT(*) FROM employees");
			if (rs1.next())
				totalEmployees = rs1.getInt(1);

			ResultSet rs2 = stmt.executeQuery("SELECT COUNT(*) FROM departments");
			if (rs2.next())
				totalDepartments = rs2.getInt(1);

			ResultSet rs3 = stmt.executeQuery("SELECT COUNT(*) FROM projects WHERE status='Active'");
			if (rs3.next())
				activeProjects = rs3.getInt(1);

			ResultSet rs4 = stmt.executeQuery("SELECT COUNT(*) FROM requests WHERE status='Pending'");
			if (rs4.next())
				pendingRequests = rs4.getInt(1);

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		request.setAttribute("totalEmployees", totalEmployees);
		request.setAttribute("totalDepartments", totalDepartments);
		request.setAttribute("activeProjects", activeProjects);
		request.setAttribute("pendingRequests", pendingRequests);

		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}
}
