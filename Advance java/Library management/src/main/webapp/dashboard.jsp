<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
    <h2>Welcome to the Dashboard</h2>
    <p>Welcome, <%= session.getAttribute("user") %>!</p>
    <a href="books.jsp">View Books</a>
    <a href="logout.jsp">Logout</a>
</body>
</html>