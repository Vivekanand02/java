<%@ page import="java.util.*,com.codevault.model.Snippet" %>
<%@ page session="true" %>
<%
    if (session.getAttribute("userId") == null) {
        response.sendRedirect("index.jsp");
        return;
    }
    List<Snippet> snippets = (List<Snippet>) request.getAttribute("snippets");
%>
<!DOCTYPE html>
<html>
<head>
    <title>My Snippets - CodeVault</title>
</head>
<body>
    <h2>Welcome, <%= session.getAttribute("userName") %></h2>

    <form action="SnippetServlet" method="post">
        <h3>Create Snippet</h3>
        <input type="text" name="title" placeholder="Title" required /><br>
        <textarea name="code" rows="8" cols="50" placeholder="Write your code here..." required></textarea><br>
        <select name="language">
            <option>Java</option>
            <option>Python</option>
            <option>SQL</option>
            <option>HTML</option>
        </select>
        <button type="submit" name="action" value="create">Save Snippet</button>
    </form>

    <hr>

    <h3>Your Snippets</h3>
    <c:forEach var="s" items="${snippets}">
        <div style="border:1px solid gray; margin:10px; padding:10px;">
            <h4>${s.title} - [${s.language}]</h4>
            <pre>${s.code}</pre>
            <form action="SnippetServlet" method="post" style="display:inline;">
                <input type="hidden" name="id" value="${s.id}" />
                <button type="submit" name="action" value="delete">Delete</button>
            </form>
        </div>
    </c:forEach>

    <br>
    <a href="dashboard.jsp">← Back to Dashboard</a>
</body>
</html>
