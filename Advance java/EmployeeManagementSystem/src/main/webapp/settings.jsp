<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Settings | EMS</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
  <style>
    body {
      margin: 0;
      font-family: 'Segoe UI', sans-serif;
      background: linear-gradient(to bottom right, #0f2027, #203a43, #2c5364);
      color: #fff;
      display: flex;
    }
    .sidebar {
      width: 250px;
      background: rgba(255,255,255,0.05);
      backdrop-filter: blur(20px);
      padding: 30px 20px;
      height: 100vh;
    }
    .sidebar h2 {
      text-align: center;
      margin-bottom: 40px;
      color: #fff;
    }
    .sidebar a {
      display: block;
      padding: 15px;
      margin: 10px 0;
      color: #ccc;
      text-decoration: none;
      border-radius: 8px;
      transition: 0.3s;
    }
    .sidebar a:hover {
      background: rgba(255, 255, 255, 0.1);
      color: #fff;
    }
    .main {
      flex: 1;
      padding: 40px;
    }
    .section {
      background: rgba(255, 255, 255, 0.1);
      backdrop-filter: blur(10px);
      padding: 20px;
      border-radius: 10px;
      margin-bottom: 30px;
    }
    label {
      display: block;
      margin: 10px 0 5px;
    }
    select, input[type="checkbox"] {
      padding: 10px;
      border-radius: 6px;
      border: none;
      background: rgba(255, 255, 255, 0.2);
      color: #fff;
    }
    .toggle-label {
      display: flex;
      align-items: center;
      gap: 10px;
    }
  </style>
</head>
<body>
  <div class="sidebar">
    <h2>EMS</h2>
    <a href="index.jsp"><i class="fas fa-chart-line"></i> Dashboard</a>
    <a href="employees.jsp"><i class="fas fa-users"></i> Employees</a>
    <a href="addEmployee.jsp"><i class="fas fa-user-plus"></i> Add Employee</a>
    <a href="departments.jsp"><i class="fas fa-building"></i> Departments</a>
    <a href="settings.jsp"><i class="fas fa-cog"></i> Settings</a>
    <a href="logout.jsp"><i class="fas fa-sign-out-alt"></i> Logout</a>
  </div>

  <div class="main">
    <h1>Settings</h1>

    <div class="section">
      <h2>Theme</h2>
      <label class="toggle-label">
        <input type="checkbox" id="darkModeToggle"> Enable Dark Mode
      </label>
    </div>

    <div class="section">
      <h2>User Preferences</h2>
      <label for="langSelect">Language:</label>
      <select id="langSelect">
        <option value="en">English</option>
        <option value="es">Spanish</option>
        <option value="fr">French</option>
      </select>

      <label for="notifCheckbox" class="toggle-label">
        <input type="checkbox" id="notifCheckbox"> Enable Notifications
      </label>
    </div>
  </div>

  <script>
    const darkToggle = document.getElementById('darkModeToggle');
    darkToggle.addEventListener('change', () => {
      if (darkToggle.checked) {
        document.body.style.background = '#111';
      } else {
        document.body.style.background = 'linear-gradient(to bottom right, #0f2027, #203a43, #2c5364)';
      }
    });
  </script>
</body>
</html>
