<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login - Women Safety App</title>
    <link rel="stylesheet" href="css/styles.css">
    <style>
        body {
            background: url('https://images.unsplash.com/photo-1581093588401-430b3d308915') no-repeat center center fixed;
            background-size: cover;
            font-family: 'Segoe UI', sans-serif;
        }

        .glass-card {
            max-width: 400px;
            margin: 100px auto;
            padding: 30px;
            background: rgba(255, 255, 255, 0.15);
            border-radius: 15px;
            backdrop-filter: blur(10px);
            box-shadow: 0 8px 32px rgba(0,0,0,0.3);
            color: white;
            animation: fadeIn 1.5s ease-in-out;
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
            font-weight: bold;
        }

        input[type="email"], input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: none;
            border-radius: 8px;
            background-color: rgba(255, 255, 255, 0.2);
            color: #fff;
        }

        input::placeholder {
            color: #ddd;
        }

        input[type="submit"] {
            width: 100%;
            padding: 12px;
            border: none;
            border-radius: 8px;
            background-color: #512da8;
            color: white;
            font-weight: bold;
            cursor: pointer;
        }

        .message {
            text-align: center;
            color: #ffcccb;
            font-weight: bold;
        }

        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(-30px); }
            to { opacity: 1; transform: translateY(0); }
        }
    </style>
</head>
<body>
    <div class="glass-card">
        <h2>Login</h2>

        <% if (request.getAttribute("error") != null) { %>
            <div class="message"><%= request.getAttribute("error") %></div>
        <% } %>

        <form action="UserServlet" method="post">
            <input type="hidden" name="action" value="login">
            <input type="email" name="email" placeholder="Email Address" required>
            <input type="password" name="password" placeholder="Password" required>
            <input type="submit" value="Login">
        </form>
    </div>
</body>
</html>
