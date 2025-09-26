<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Add Employee | EMS</title>
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

    .sidebar a:hover,
    .sidebar a.active {
      background: rgba(255, 255, 255, 0.1);
      color: #fff;
    }

    .main {
      flex: 1;
      padding: 40px;
    }

    h1 {
      margin-bottom: 30px;
    }
   
.popup {
  position: fixed;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  background: rgba(255, 255, 255, 0.1);
  backdrop-filter: blur(12px);
  padding: 25px 40px;
  color: #fff;
  font-size: 1.2rem;
  border-radius: 12px;
  box-shadow: 0 0 25px rgba(0, 188, 212, 0.3);
  border: 1px solid rgba(255, 255, 255, 0.15);
  z-index: 1000;
  display: none;
  text-align: center;
}
    

    form {
      max-width: 500px;
      background: rgba(255, 255, 255, 0.1);
      backdrop-filter: blur(10px);
      padding: 30px;
      border-radius: 12px;
      box-shadow: 0 8px 32px rgba(0, 0, 0, 0.25);
    }

    label {
      display: block;
      margin-bottom: 10px;
      font-weight: bold;
    }

    input, select {
      width: 100%;
      padding: 10px;
      margin-bottom: 20px;
      border-radius: 6px;
      border: none;
      outline: none;
      background: rgba(255, 255, 255, 0.2);
      color: #fff;
    }

    button {
      background-color: #00bcd4;
      border: none;
      padding: 10px 20px;
      border-radius: 6px;
      color: #fff;
      cursor: pointer;
      font-weight: bold;
    }
  </style>
</head>
<body>
  <div class="sidebar">
    <h2>EMS</h2>
    <a href="index.jsp"><i class="fas fa-chart-line"></i> Dashboard</a>
    <a href="employees.jsp"><i class="fas fa-users"></i> Employees</a>
    <a href="addEmployee.jsp" class="active"><i class="fas fa-user-plus"></i> Add Employee</a>
    <a href="departments.jsp"><i class="fas fa-building"></i> Departments</a>
    <a href="settings.jsp"><i class="fas fa-cog"></i> Settings</a>
    <a href="logout.jsp"><i class="fas fa-sign-out-alt"></i> Logout</a>
  </div>

  <div class="main">
    <h1>Add New Employee</h1>
    <form action="addEmployee" method="post" id="employeeForm">

      <label for="name">Full Name</label>
      <input type="text" id="name" name="name" required>

      <label for="department">Department</label>
      <select id="department" name="department" required>
        <option value="">Select Department</option>
        <option value="HR">HR</option>
        <option value="IT">IT</option>
        <option value="Finance">Finance</option>
        <option value="Marketing">Marketing</option>
      </select>

      <label for="email">Email</label>
      <input type="email" id="email" name="email" required>

      <label for="joinDate">Joining Date</label>
      <input type="date" id="joinDate" name="joinDate" required>

      <button type="submit">Add Employee</button>
      <div class="popup" id="successPopup">
  Employee added successfully!
</div>
    </form>
  </div>
<%
    String successMsg = (String) session.getAttribute("success");
    if (successMsg != null) {
%>
  <script>
    const popup = document.getElementById("successPopup");
    popup.style.display = "block";
    setTimeout(() => popup.style.display = "none", 1800);
  </script>
<%
    session.removeAttribute("success");
    }
%>

</body>
</html>
