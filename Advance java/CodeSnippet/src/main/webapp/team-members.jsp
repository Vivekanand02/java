<%@ page import="java.util.*, com.codevault.model.User, com.codevault.dao.TeamDAO" %>

<%@ page session="true" %>
<%
    int teamId = Integer.parseInt(request.getParameter("teamId"));
    List<User> members = TeamDAO.getMembers(teamId);
%>

<!DOCTYPE html>
<html>
<head>
    <title>Team Members</title>
    <style>
        body { font-family: Arial; }
        ul { list-style: none; padding: 0; }
        li { margin-bottom: 10px; }
        form { display: inline; }
    </style>
</head>
<body>

<h2>Team Members</h2>
<ul>
    <% for (User u : members) { %>
        <li>
            <strong><%= u.getName() %></strong> (<%= u.getEmail() %>)
            <form action="TeamServlet" method="post">
                <input type="hidden" name="teamId" value="<%= teamId %>" />
                <input type="hidden" name="userId" value="<%= u.getId() %>" />
                <button type="submit" name="action" value="removeUser">Kick</button>
            </form>
        </li>
    <% } %>
</ul>

</body>
</html>
