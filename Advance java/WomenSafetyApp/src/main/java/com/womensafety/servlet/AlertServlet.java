package com.womensafety.servlet;

import java.io.IOException;
import java.time.LocalDateTime;

import com.womensafety.dao.AlertDAO;
import com.womensafety.model.Alert;
import com.womensafety.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AlertServlet extends HttpServlet {
	private AlertDAO alertDAO;

	@Override
	public void init() {
		alertDAO = new AlertDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String location = request.getParameter("location");
		HttpSession session = request.getSession(false);

		if (session != null && session.getAttribute("user") != null) {
			User user = (User) session.getAttribute("user");
			Alert alert = new Alert(user.getId(), location, LocalDateTime.now());

			boolean saved = alertDAO.saveAlert(alert);
			if (saved) {
				response.sendRedirect("alert.jsp?success=sent");
			} else {
				response.sendRedirect("alert.jsp?error=fail");
			}
		} else {
			response.sendRedirect("login.jsp");
		}
	}
}
