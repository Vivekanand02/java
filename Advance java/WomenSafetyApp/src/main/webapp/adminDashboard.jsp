<%@ page session="true" %>
<%
    String adminUser = (String) session.getAttribute("admin");
    if (adminUser == null) {
        response.sendRedirect("../login.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin Dashboard - Women Safety</title>
    <link rel="stylesheet" href="../css/styles.css">
    <style>
        body {
            background: linear-gradient(to right, #4b6cb7, #182848);
            color: #fff;
            font-family: 'Segoe UI', sans-serif;
        }

        .container {
            max-width: 1000px;
            margin: 50px auto;
            background: rgba(255, 255, 255, 0.1);
            padding: 30px;
            border-radius: 15px;
            backdrop-filter: blur(10px);
            box-shadow: 0 0 15px rgba(0,0,0,0.5);
        }

        h2 {
            text-align: center;
            margin-bottom: 30px;
        }

        .dashboard-links {
            display: flex;
            justify-content: space-around;
            margin-top: 20px;
        }

        a.button {
            padding: 12px 20px;
            background-color: #00e5ff;
            color: black;
            text-decoration: none;
            border-radius: 8px;
            font-weight: bold;
            transition: 0.3s;
        }

        a.button:hover {
            background-color: #00bcd4;
            color: white;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Welcome Admin</h2>
        <div class="dashboard-links">
            <a class="button" href="manageUsers.jsp">Manage Users</a>
            <a class="button" href="viewAlerts.jsp">View Alerts</a>
        </div>
    </div>
</body>
</html>
