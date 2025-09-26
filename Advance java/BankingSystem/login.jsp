<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Login</title></head>
<body>
<h2>Bank Login</h2>
<form action="LoginServlet" method="post">
    Email: <input type="email" name="email" required><br>
    Password: <input type="password" name="password" required><br>
    <input type="submit" value="Login">
</form>

<% String msg = request.getParameter("msg"); %>
<% if (msg != null) { %>
    <p style="color:red;"><%= msg.equals("failed") ? "Invalid credentials!" : "Registration successful!" %></p>
<% } %>
</body>
</html>
