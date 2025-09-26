package com.codevault.servlets;

import java.io.IOException;
import java.util.List;

import com.codevault.dao.SnippetDAO;
import com.codevault.model.Snippet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/SnippetServlet")
public class SnippetServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute("userId") == null) {
			response.sendRedirect("index.jsp");
			return;
		}

		int userId = (int) session.getAttribute("userId");
		String action = request.getParameter("action");

		if ("create".equals(action)) {
			userId = (int) session.getAttribute("userId");
			String title = request.getParameter("title");
			String code = request.getParameter("code");
			String language = request.getParameter("language");
			String teamIdParam = request.getParameter("teamId");
			Integer teamId = (teamIdParam == null || teamIdParam.isEmpty()) ? null : Integer.parseInt(teamIdParam);

			SnippetDAO.createSnippet(userId, title, code, language, teamId);
			response.sendRedirect("dashboard.jsp");

		} else if ("delete".equals(action))

		{
			int id = Integer.parseInt(request.getParameter("id"));
			SnippetDAO.deleteSnippetById(id);
		}

		response.sendRedirect("SnippetServlet");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute("userId") == null) {
			response.sendRedirect("index.jsp");
			return;
		}

		int userId = (int) session.getAttribute("userId");
		List<Snippet> snippets = SnippetDAO.getSnippetsByUser(userId);
		request.setAttribute("snippets", snippets);
		RequestDispatcher rd = request.getRequestDispatcher("snippets.jsp");
		rd.forward(request, response);
	}
}
