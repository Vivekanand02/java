<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List, com.codevault.model.Team, com.codevault.dao.TeamDAO" %>

<%
    Integer userId = (Integer) session.getAttribute("userId");
    List<Team> teams = null;

    if (userId != null) {
        teams = TeamDAO.getTeamsByUser(userId);
    }
%>

<form action="SnippetServlet" method="post">
    <input type="text" name="title" placeholder="Title" required>
    
    <textarea name="code" placeholder="Enter code here..." required></textarea>
    
    <select name="language" required>
        <option value="">-- Select Language --</option>
        <option value="Java">Java</option>
        <option value="Python">Python</option>
        <option value="JavaScript">JavaScript</option>
        <option value="C++">C++</option>
        <!-- Add more as needed -->
    </select>
    
    <select name="teamId">
        <option value="">-- Personal Snippet --</option>
        <% if (teams != null) {
               for (Team t : teams) { %>
            <option value="<%= t.getId() %>"><%= t.getName() %></option>
        <%   }
           } %>
    </select>

    <button type="submit" name="action" value="create">Create Snippet</button>
</form>
