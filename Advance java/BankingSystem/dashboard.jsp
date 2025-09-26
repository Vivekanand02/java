<%@ page import="model.User" %>
<%
    HttpSession session = request.getSession(false);
    User user = (User) session.getAttribute("user");

    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<html>
<head><title>Dashboard</title></head>
<body>
<h2>Welcome, <%= user.getName() %></h2>
<p>Email: <%= user.getEmail() %></p>
<p>Mobile: <%= user.getMobile() %></p>
<a href="Transfer.jsp">Transfer Funds</a> |
<a href="TransactionHistoryServlet">Transaction History</a> |
<a href="LogoutServlet">Logout</a>
</body>
</html>
