<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register - Women Safety App</title>
    <link rel="stylesheet" href="css/styles.css">
    <style>
        body {
            background: url('https://images.unsplash.com/photo-1508780709619-79562169bc64') no-repeat center center fixed;
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

        input[type="text"], input[type="email"], input[type="password"] {
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
            background-color: #d81b60;
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
        <h2>Register</h2>

        <% if (request.getParameter("error") != null) { %>
            <div class="message"><%= request.getParameter("error") %></div>
        <% } %>

        <form action="UserServlet" method="post">
            <input type="hidden" name="action" value="register">
            <input type="text" name="name" placeholder="Full Name" required>
            <input type="email" name="email" placeholder="Email Address" required>
            <input type="password" name="password" placeholder="Password" required>
            <input type="text" name="phone" placeholder="Phone Number" required>
            <input type="submit" value="Register">
        </form>
    </div>
</body>
</html>
