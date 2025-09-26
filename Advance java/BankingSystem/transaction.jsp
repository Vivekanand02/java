<%@ page import="java.util.*, model.Transaction, model.User" %>
<%
    HttpSession session = request.getSession(false);
    User user = (User) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }

    List<Transaction> history = (List<Transaction>) request.getAttribute("history");
%>
<html>
<head><title>Transaction History</title></head>
<body>
<h2>Transaction History</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>From</th>
        <th>To</th>
        <th>Amount</th>
        <th>Type</th>
        <th>Timestamp</th>
    </tr>
    <%
        for (Transaction t : history) {
    %>
    <tr>
        <td><%= t.getId() %></td>
        <td><%= t.getFrom() %></td>
        <td><%= t.getTo() %></td>
        <td><%= t.getAmount() %></td>
        <td style="color: <%= t.getType().equals("debit") ? "red" : "green" %>;">
            <%= t.getType() %>
        </td>
        <td><%= t.getTimestamp() %></td>
    </tr>
    <% } %>
</table>
<br><a href="dashboard.jsp">Back to Dashboard</a>
</body>
</html>
