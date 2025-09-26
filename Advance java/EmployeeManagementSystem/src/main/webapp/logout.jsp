<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Logout | EMS</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
    body {
      margin: 0;
      font-family: 'Segoe UI', sans-serif;
      background: linear-gradient(to bottom right, #0f2027, #203a43, #2c5364);
      color: #fff;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }

    .container {
      background: rgba(255, 255, 255, 0.08);
      backdrop-filter: blur(15px);
      padding: 60px;
      border-radius: 20px;
      text-align: center;
      box-shadow: 0 0 20px rgba(255, 255, 255, 0.1);
      border: 1px solid rgba(255, 255, 255, 0.15);
    }

    h1 {
      font-size: 2.8rem;
      margin-bottom: 20px;
      color: #00e5ff;
    }

    p {
      font-size: 1.2rem;
      color: #ddd;
      margin-top: 10px;
    }

    .timer {
      margin-top: 15px;
      font-weight: bold;
      color: #90caf9;
    }
  </style>
  
</head>
<body>
  <div class="container">
    <h1>You have been logged out</h1>
    <p>Thank you for using the Employee Management System.</p>
    <p><strong>Welcome Again!</strong></p>
    <div class="timer">This window will close in <span id="timerValue">5</span> seconds...</div>
  </div>
  <script>
    let seconds = 5;
    const timer = setInterval(() => {
      document.getElementById("timerValue").innerText = seconds;
      seconds--;
      if (seconds < 0) {
        clearInterval(timer);
        window.open('', '_self', '');
        window.close();
      }
    }, 1000);
  </script>
</body>
</html>
