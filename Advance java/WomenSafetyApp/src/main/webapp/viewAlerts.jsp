<%@ page import="java.util.*, com.womensafety.dao.AlertDAO, com.womensafety.model.Alert" %>
<%
    List<Alert> alerts = new AlertDAO().getAllAlerts();
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Alerts</title>
    <style>
        body {
            background: #121212;
            color: white;
            font-family: 'Segoe UI', sans-serif;
        }

        table {
            width: 90%;
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
            background: #f50057;
            color: white;
        }

        h2 {
            text-align: center;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <h2>All Emergency Alerts</h2>
    <table>
        <tr>
            <th>ID</th><th>User ID</th><th>Location</th><th>Timestamp</th>
        </tr>
        <% for (Alert a : alerts) { %>
            <tr>
                <td><%= a.getId() %></td>
                <td><%= a.getUserId() %></td>
                <td><%= a.getLocation() %></td>
                <td><%= a.getTimestamp() %></td>
            </tr>
        <% } %>
    </table>
</body>
</html>
