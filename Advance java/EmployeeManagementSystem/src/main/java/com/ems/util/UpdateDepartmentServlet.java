package com.ems.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updateDepartment")
public class UpdateDepartmentServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");

		try (Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement("UPDATE departments SET name=? WHERE id=?")) {
			ps.setString(1, name);
			ps.setInt(2, id);
			ps.executeUpdate();
			response.sendRedirect("departments.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
