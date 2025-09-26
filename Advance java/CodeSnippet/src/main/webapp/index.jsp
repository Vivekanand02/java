<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>CodeVault - Login</title>
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
            background: linear-gradient(to bottom right, #283e51, #485563);
        }

        .login-box {
            background: white;
            padding: 2rem 3rem;
            border-radius: 12px;
            box-shadow: 0 4px 16px rgba(0,0,0,0.2);
            width: 350px;
        }

        .login-box h2 {
            margin-bottom: 1.5rem;
            text-align: center;
            color: #333;
        }

        .login-box input[type="email"],
        .login-box input[type="password"] {
            width: 100%;
            padding: 0.8rem;
            margin-bottom: 1rem;
            border: 1px solid #ccc;
            border-radius: 8px;
            font-size: 1rem;
        }

        .login-box input[type="submit"] {
            width: 100%;
            padding: 0.8rem;
            background-color: #3f72af;
            border: none;
            border-radius: 8px;
            color: white;
            font-size: 1rem;
            cursor: pointer;
            transition: background 0.3s;
        }

        .login-box input[type="submit"]:hover {
            background-color: #2f5f98;
        }

        .login-box .register-link {
            margin-top: 1rem;
            text-align: center;
        }

        .login-box .register-link a {
            text-decoration: none;
            color: #3f72af;
            font-weight: bold;
        }

        .login-box .error {
            color: red;
            text-align: center;
            margin-bottom: 1rem;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="login-box">
        <h2>Login to CodeVault</h2>

        <% String error = request.getParameter("error");
           if(error != null) { %>
           <div class="error">Invalid email or password</div>
        <% } %>

        <form action="LoginServlet" method="post">
            <input type="email" name="email" placeholder="Email" required />
            <input type="password" name="password" placeholder="Password" required />
            <input type="submit" value="Login" />
        </form>

        <div class="register-link">
            Don't have an account? <a href="register.jsp">Register</a>
        </div>
    </div>
</div>

</body>
</html>
