package com.womensafety.servlet;

import java.io.IOException;

import com.womensafety.dao.UserDAO;
import com.womensafety.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class UserServlet extends HttpServlet {
	private UserDAO userDAO;

	@Override
	public void init() {
		userDAO = new UserDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		if ("register".equals(action)) {
			handleRegister(request, response);
		} else if ("login".equals(action)) {
			handleLogin(request, response);
		}
	}

	private void handleRegister(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");

		User user = new User(name, email, password, phone);
		boolean result = userDAO.registerUser(user);

		if (result) {
			response.sendRedirect("login.jsp?success=registered");
		} else {
			request.setAttribute("error", "Registration failed. Try again.");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
	}

	private void handleLogin(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		User user = userDAO.loginUser(email, password);

		if (user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("alert.jsp");
		} else {
			request.setAttribute("error", "Invalid email or password.");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
}
