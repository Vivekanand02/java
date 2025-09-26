package com.ems.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deleteDepartment")
public class DeleteDepartmentServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));

		try (Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement("DELETE FROM departments WHERE id=?")) {
			ps.setInt(1, id);
			ps.executeUpdate();
			response.sendRedirect("departments.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
