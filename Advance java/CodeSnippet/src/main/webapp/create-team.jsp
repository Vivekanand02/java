<%@ page session="true" %>
<%@ page import="java.util.*" %>
<html>
<head><title>Create Team</title></head>
<body>
    <h2>Create a New Team</h2>
    <form action="TeamServlet" method="post">
        <input type="text" name="teamName" placeholder="Team Name" required />
        <button type="submit" name="action" value="createTeam">Create</button>
    </form>

    <h3>Invite to Team</h3>
   <form action="TeamServlet" method="post">
    <input type="hidden" name="action" value="sendInvite" />
    <input type="text" name="teamId" placeholder="Team ID" required />
    <input type="text" name="userId" placeholder="User ID to Invite" required />
    <button type="submit">Send Invite</button>
</form>
</body>
</html>
