<%@ page import="java.util.*, com.womensafety.dao.UserDAO, com.womensafety.model.User" %>
<%
    List<User> userList = new UserDAO().getAllUsers();
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Manage Users</title>
    <style>
        body {
            background: #1c1c1c;
            color: white;
            font-family: 'Segoe UI', sans-serif;
        }

        table {
            width: 80%;
            margin: 40px auto;
            border-collapse: collapse;
            background: rgba(255, 255, 255, 0.1);
            backdrop-filter: blur(6px);
        }

        th, td {
            padding: 12px;
            border: 1px solid #ddd;
            text-align: center;
        }

        th {
            background: #00e5ff;
            color: black;
        }

        h2 {
            text-align: center;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <h2>All Registered Users</h2>
    <table>
        <tr>
            <th>ID</th><th>Name</th><th>Email</th><th>Phone</th>
        </tr>
        <% for (User user : userList) { %>
            <tr>
                <td><%= user.getId() %></td>
                <td><%= user.getName() %></td>
                <td><%= user.getEmail() %></td>
                <td><%= user.getPhone() %></td>
            </tr>
        <% } %>
    </table>
</body>
</html>
