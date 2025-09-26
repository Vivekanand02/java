<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>CodeVault - Register</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            background: #f5f7fa;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        .container {
            width: 100%;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background: linear-gradient(to bottom right, #1e3c72, #2a5298);
        }

        .register-box {
            background: white;
            padding: 2rem 3rem;
            border-radius: 12px;
            box-shadow: 0 4px 16px rgba(0,0,0,0.2);
            width: 400px;
        }

        .register-box h2 {
            margin-bottom: 1.5rem;
            text-align: center;
            color: #333;
        }

        .register-box input[type="text"],
        .register-box input[type="email"],
        .register-box input[type="password"] {
            width: 100%;
            padding: 0.8rem;
            margin-bottom: 1rem;
            border: 1px solid #ccc;
            border-radius: 8px;
            font-size: 1rem;
        }

        .register-box input[type="submit"] {
            width: 100%;
            padding: 0.8rem;
            background-color: #2a5298;
            border: none;
            border-radius: 8px;
            color: white;
            font-size: 1rem;
            cursor: pointer;
            transition: background 0.3s;
        }

        .register-box input[type="submit"]:hover {
            background-color: #1e3c72;
        }

        .register-box .login-link {
            margin-top: 1rem;
            text-align: center;
        }

        .register-box .login-link a {
            text-decoration: none;
            color: #2a5298;
            font-weight: bold;
        }

        .register-box .error {
            color: red;
            text-align: center;
            margin-bottom: 1rem;
        }

        .register-box .success {
            color: green;
            text-align: center;
            margin-bottom: 1rem;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="register-box">
        <h2>Create Your Account</h2>

        <% 
            String msg = request.getParameter("msg");
            if ("exists".equals(msg)) { 
        %>
            <div class="error">Email already registered!</div>
        <% 
            } else if ("success".equals(msg)) {
        %>
            <div class="success">Registration successful! <a href="index.jsp">Login now</a></div>
        <% } %>

        <form action="RegisterServlet" method="post">
            <input type="text" name="name" placeholder="Full Name" required />
            <input type="email" name="email" placeholder="Email" required />
            <input type="password" name="password" placeholder="Password" required />
            <input type="submit" value="Register" />
        </form>

        <div class="login-link">
            Already have an account? <a href="index.jsp">Login</a>
        </div>
    </div>
</div>

</body>
</html>
