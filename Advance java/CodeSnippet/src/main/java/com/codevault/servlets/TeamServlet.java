package com.codevault.servlets;

import java.io.IOException;

import com.codevault.dao.TeamDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/TeamServlet")
public class TeamServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");

		if ("createTeam".equals(action)) {
			String name = request.getParameter("teamName");
			int ownerId = (int) request.getSession().getAttribute("userId");
			TeamDAO.createTeam(name, ownerId);
		} else if ("removeUser".equals(action)) {
			int teamId = Integer.parseInt(request.getParameter("teamId"));
			int userId = Integer.parseInt(request.getParameter("userId"));
			TeamDAO.removeUserFromTeam(teamId, userId);
			response.sendRedirect("team-members.jsp?teamId=" + teamId);
		} else if ("sendInvite".equals(action)) {
			int teamId = Integer.parseInt(request.getParameter("teamId"));
			int invitedUserId = Integer.parseInt(request.getParameter("userId"));
			TeamDAO.sendInvite(teamId, invitedUserId);
			response.sendRedirect("create-team.jsp");
		} else if ("acceptInvite".equals(action) || "rejectInvite".equals(action)) {
			int inviteId = Integer.parseInt(request.getParameter("inviteId"));
			int teamId = Integer.parseInt(request.getParameter("teamId"));
			int userId = Integer.parseInt(request.getParameter("userId"));
			boolean accepted = "acceptInvite".equals(action);

			TeamDAO.handleInvite(inviteId, teamId, userId, accepted);
			response.sendRedirect("pending-invites.jsp");
		}

		response.sendRedirect("create-team.jsp");
	}
}
