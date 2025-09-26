<%@ page import="com.womensafety.model.User" %>
<%@ page session="true" %>
<%
    User user = (User) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Send Alert - Women Safety</title>
    <style>
        body {
            background: linear-gradient(135deg, #f44336, #e91e63);
            font-family: 'Segoe UI', sans-serif;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        .alert-box {
            background: rgba(255, 255, 255, 0.1);
            padding: 40px;
            border-radius: 20px;
            color: #fff;
            text-align: center;
            backdrop-filter: blur(8px);
            box-shadow: 0 0 20px rgba(0,0,0,0.4);
            animation: popIn 1s ease-in-out;
        }

        .alert-box h2 {
            margin-bottom: 20px;
        }

        button {
            background: #fff;
            color: #d50000;
            padding: 15px 30px;
            border: none;
            font-size: 18px;
            font-weight: bold;
            border-radius: 10px;
            cursor: pointer;
            transition: all 0.3s ease;
        }

        button:hover {
            background: #d50000;
            color: #fff;
        }

        @keyframes popIn {
            0% { transform: scale(0.8); opacity: 0; }
            100% { transform: scale(1); opacity: 1; }
        }

        .status {
            margin-top: 15px;
            font-weight: bold;
            color: #ffeb3b;
        }
    </style>
</head>
<body>
    <div class="alert-box">
        <h2>Welcome, <%= user.getName() %>!</h2>
        <form id="alertForm" action="AlertServlet" method="post">
            <input type="hidden" name="location" id="locationInput">
            <button type="submit">Send Emergency Alert</button>
        </form>
        <div class="status" id="status"></div>
    </div>

    <script>
        const statusEl = document.getElementById("status");
        const locationInput = document.getElementById("locationInput");

        function fetchLocation() {
            if (navigator.geolocation) {
                navigator.geolocation.getCurrentPosition(position => {
                    const lat = position.coords.latitude;
                    const lon = position.coords.longitude;
                    locationInput.value = `Lat: ${lat}, Lon: ${lon}`;
                    statusEl.textContent = "Location fetched successfully!";
                }, () => {
                    statusEl.textContent = "Failed to fetch location.";
                });
            } else {
                statusEl.textContent = "Geolocation not supported.";
            }
        }

        window.onload = fetchLocation;
    </script>
</body>
</html>
