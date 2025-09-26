<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.sql.*" %>

<head>
    <title>Book List</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <h1>Available Books</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>ISBN</th>
            <th>Available</th>
        </tr>
        <%
            ResultSet rs = (ResultSet) request.getAttribute("books");
            while (rs.next()) {
        %>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("title") %></td>
            <td><%= rs.getString("author") %></td>
            <td><%= rs.getString("isbn") %></td>
            <td><%= rs.getBoolean("available") ? "Yes" : "No" %></td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>