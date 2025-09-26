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
<head><title>Transfer Funds</title></head>
<body>
<h2>Transfer Money</h2>
<form action="TransferServlet" method="post">
    Recipient Email: <input type="email" name="toEmail" required><br>
    Amount: <input type="number" name="amount" step="0.01" required><br>
    <input type="submit" value="Transfer">
</form>
<% String msg = request.getParameter("msg"); %>
<% if (msg != null) { %>
    <p style="color:<%= msg.equals("success") ? "green" : "red" %>;">
        <%= msg.equals("success") ? "Transfer successful!" : "Transfer failed or insufficient balance!" %>
    </p>
<% } %>
</body>
</html>
