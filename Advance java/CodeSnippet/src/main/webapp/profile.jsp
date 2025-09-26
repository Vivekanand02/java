<%@ page import="jakarta.servlet.http.*,jakarta.servlet.*" %>
<%@ page session="true" %>
<%
    String userName = (String) session.getAttribute("userName");
    String userEmail = (String) session.getAttribute("userEmail");

    if (userName == null || userEmail == null) {
        response.sendRedirect("index.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Profile - CodeVault</title>
</head>
<body>
    <h2>My Profile</h2>
    <p><strong>Name:</strong> <%= userName %></p>
    <p><strong>Email:</strong> <%= userEmail %></p>

    <form action="ProfileServlet" method="post">
        <h3>Update Name</h3>
        <input type="text" name="newName" placeholder="Enter new name" required />
        <button type="submit" name="action" value="updateName">Update Name</button>

        <h3>Change Password</h3>
        <input type="password" name="newPassword" placeholder="Enter new password" required />
        <button type="submit" name="action" value="updatePassword">Update Password</button>
    </form>

    <a href="dashboard.jsp">← Back to Dashboard</a>
</body>
</html>
