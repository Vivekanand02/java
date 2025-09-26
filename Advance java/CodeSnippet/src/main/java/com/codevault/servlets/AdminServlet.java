package com.codevault.servlets;

import java.io.IOException;
import java.util.List;

import com.codevault.dao.SnippetDAO;
import com.codevault.dao.UserDAO;
import com.codevault.model.Snippet;
import com.codevault.model.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		if (session == null || !"admin".equals(session.getAttribute("role"))) {
			response.sendRedirect("dashboard.jsp");
			return;
		}

		List<User> users = UserDAO.getAllUsers();
		List<Snippet> snippets = SnippetDAO.getAllSnippets();

		request.setAttribute("users", users);
		request.setAttribute("snippets", snippets);

		RequestDispatcher rd = request.getRequestDispatcher("admin-dashboard.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8"); // Optional: handle special characters
		String action = request.getParameter("action");

		if ("deleteUser".equals(action)) {
			String userIdStr = request.getParameter("userId");
			if (userIdStr != null) {
				int userId = Integer.parseInt(userIdStr);
				UserDAO.deleteUser(userId);
			}
		} else if ("toggleRole".equals(action)) {
			String userIdStr = request.getParameter("userId");
			if (userIdStr != null) {
				int userId = Integer.parseInt(userIdStr);
				UserDAO.toggleUserRole(userId);
			}
		} else if ("deleteSnippet".equals(action)) {
			String snippetIdStr = request.getParameter("snippetId");
			if (snippetIdStr != null) {
				int snippetId = Integer.parseInt(snippetIdStr);
				SnippetDAO.deleteSnippetById(snippetId); // Use admin version
			}
		}

		response.sendRedirect("AdminServlet");

	}

}
