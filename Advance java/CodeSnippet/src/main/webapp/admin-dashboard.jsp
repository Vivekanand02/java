<%@ page import="java.util.*, com.codevault.model.*" %>
<%@ page session="true" %>
<%
    if (!"admin".equals(session.getAttribute("role"))) {
        response.sendRedirect("dashboard.jsp");
        return;
    }

    List<User> users = (List<User>) request.getAttribute("users");
    List<Snippet> snippets = (List<Snippet>) request.getAttribute("snippets");
%>
<!DOCTYPE html>
<html>
<head><title>Admin Dashboard</title></head>
<body>
    <h2>Admin Dashboard</h2>
    <h3>All Users</h3>
    <table border="1">
        <tr><th>ID</th><th>Name</th><th>Email</th><th>Role</th><th>Action</th></tr>
        <c:forEach var="u" items="${users}">
            <tr>
                <td>${u.id}</td>
                <td>${u.name}</td>
                <td>${u.email}</td>
                <td>${u.role}</td>
                <td>
                    <form action="AdminServlet" method="post" style="display:inline;">
                        <input type="hidden" name="userId" value="${u.id}" />
                        <button name="action" value="deleteUser">Delete</button>
                    </form>
                    <form action="AdminServlet" method="post" style="display:inline;">
                        <input type="hidden" name="userId" value="${u.id}" />
                        <button name="action" value="toggleRole">
                            ${u.role == "admin" ? "Demote to User" : "Promote to Admin"}
                        </button>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>

    <h3>All Snippets</h3>
    <table border="1">
        <tr><th>ID</th><th>UserID</th><th>Title</th><th>Language</th><th>Action</th></tr>
        <c:forEach var="s" items="${snippets}">
            <tr>
                <td>${s.id}</td>
                <td>${s.userId}</td>
                <td>${s.title}</td>
                <td>${s.language}</td>
                <td>
                    <form action="AdminServlet" method="post">
                        <input type="hidden" name="snippetId" value="${s.id}" />
                        <button name="action" value="deleteSnippet">Delete</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
