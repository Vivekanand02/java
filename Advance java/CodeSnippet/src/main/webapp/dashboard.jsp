<%@ page import="jakarta.servlet.http.*, jakarta.servlet.*" %>
<%@ page import="java.util.List" %>
<%@ page import="com.codevault.dao.TeamDAO, com.codevault.dao.SnippetDAO" %>
<%@ page import="com.codevault.model.Snippet, com.codevault.model.Team" %>
<%@ page session="true" %>
<%
    Integer userId = (Integer) session.getAttribute("userId");
    String name = (String) session.getAttribute("userName");
    if (userId == null || name == null) {
        response.sendRedirect("index.jsp");
        return;
    }

    String selectedTeamIdParam = request.getParameter("teamId");
    Integer selectedTeamId = (selectedTeamIdParam != null && !selectedTeamIdParam.isEmpty()) 
        ? Integer.parseInt(selectedTeamIdParam) 
        : null;

    List<Team> userTeams = TeamDAO.getTeamsByUser(userId);
    List<Snippet> snippets;

    if (selectedTeamId == null) {
        // Fetch personal snippets
        snippets = SnippetDAO.getSnippetsByUser(userId);
    } else {
        // Fetch team snippets (wrap selected teamId in a list)
        List<Integer> teamIds = new java.util.ArrayList<>();
        teamIds.add(selectedTeamId);
        snippets = SnippetDAO.getSnippetsByTeamId(teamIds);
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Dashboard - CodeVault</title>
</head>
<body>
    <h2>Welcome, <%= name %>!</h2>
    <p>This is your dashboard.</p>
    <a href="LogoutServlet">Logout</a>

    <form action="dashboard.jsp" method="get">
        <select name="teamId">
            <option value="">My Snippets</option>
            <% for (Team team : userTeams) { %>
                <option value="<%= team.getId() %>" <%= (selectedTeamId != null && selectedTeamId == team.getId()) ? "selected" : "" %>>
                    <%= team.getName() %>
                </option>
            <% } %>
        </select>
        <button type="submit">Filter</button>
    </form>

    <h3><%= (selectedTeamId == null ? "My Snippets" : "Team Snippets") %></h3>
    <% for (Snippet s : snippets) { %>
    <div style="border: 1px solid #ccc; margin: 10px; padding: 10px;">
        <h4><%= s.getTitle() %> [<%= s.getLanguage() %>]</h4>
        <pre><%= s.getCode() %></pre>

        <% if (s.getTeamId() != null) { %>
            <p>Shared in Team ID: <%= s.getTeamId() %></p>
        <% } else { %>
            <p><em>Private Snippet</em></p>
        <% } %>
    </div>
<% } %>

</body>
</html>
