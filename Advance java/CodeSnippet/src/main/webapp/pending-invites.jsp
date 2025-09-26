<%@ page import="java.util.*, com.codevault.model.TeamInvite, com.codevault.dao.TeamDAO" %>
<%
    int userId = (int) session.getAttribute("userId");
    List<TeamInvite> invites = TeamDAO.getPendingInvites(userId);
%>

<h2>Pending Invitations</h2>
<% for (TeamInvite invite : invites) { %>
    <p>
        Team ID: <%= invite.getTeamId() %>
        <form action="TeamServlet" method="post" style="display:inline;">
            <input type="hidden" name="inviteId" value="<%= invite.getId() %>" />
            <input type="hidden" name="teamId" value="<%= invite.getTeamId() %>" />
            <input type="hidden" name="userId" value="<%= userId %>" />
            <button name="action" value="acceptInvite">Accept</button>
            <button name="action" value="rejectInvite">Reject</button>
        </form>
    </p>
<% } %>
