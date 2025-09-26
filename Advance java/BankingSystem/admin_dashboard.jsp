<%@ page import="java.util.*, model.User, model.Transaction" %>
<%
    HttpSession session = request.getSession(false);
    User admin = (User) session.getAttribute("user");
    if (admin == null || !admin.getRole().equals("admin")) {
        response.sendRedirect("login.jsp");
        return;
    }

    List<User> users = (List<User>) request.getAttribute("users");
    List<Transaction> txns = (List<Transaction>) request.getAttribute("transactions");
%>

<html>
<head><title>Admin Dashboard</title></head>
<body>
<h1>Welcome, Admin <%= admin.getName() %></h1>

<h2>All Users</h2>
<table border="1">
<tr>
    <th>ID</th><th>Name</th><th>Email</th><th>Role</th><th>Balance</th>
</tr>
<% for (User u : users) { %>
<tr>
    <td><%= u.getId() %></td>
    <td><%= u.getName() %></td>
    <td><%= u.getEmail() %></td>
    <td><%= u.getRole() %></td>
    <td><%= u.getBalance() %></td>
</tr>
<% } %>
</table>

<h2>All Transactions</h2>
<table border="1">
<tr>
    <th>ID</th><th>From</th><th>To</th><th>Amount</th><th>Type</th><th>Timestamp</th>
</tr>
<% for (Transaction t : txns) { %>
<tr>
    <td><%= t.getId() %></td>
    <td><%= t.getFrom() %></td>
    <td><%= t.getTo() %></td>
    <td><%= t.getAmount() %></td>
    <td><%= t.getType() %></td>
    <td><%= t.getTimestamp() %></td>
</tr>
<% } %>
</table>

<br><a href="logout.jsp">Logout</a>
</body>
</html>
