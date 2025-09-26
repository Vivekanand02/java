<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <title>Departments | EMS</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css" />
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

    .header {
      display: flex;
      justify-content: space-between;
      align-items: center;
    }

    .form-section, .list-section {
      margin-top: 30px;
      background: rgba(255, 255, 255, 0.1);
      backdrop-filter: blur(10px);
      padding: 20px;
      border-radius: 10px;
    }

    input[type="text"] {
      padding: 10px;
      border-radius: 6px;
      border: none;
      outline: none;
      width: 70%;
      background: rgba(255, 255, 255, 0.1);
      color: #fff;
      margin-right: 10px;
    }

    .btn {
      background-color: #00bcd4;
      border: none;
      color: #fff;
      padding: 10px 20px;
      border-radius: 6px;
      cursor: pointer;
    }

    table {
      width: 100%;
      border-collapse: collapse;
      margin-top: 20px;
    }

    th, td {
      padding: 12px;
      text-align: left;
      color: #eee;
      border-bottom: 1px solid rgba(255,255,255,0.1);
    }

    th {
      background-color: rgba(0, 188, 212, 0.2);
    }

    tr:hover {
      background-color: rgba(255, 255, 255, 0.05);
    }

    .btn-danger {
      background-color: #f44336;
    }

    .btn-edit {
      background-color: #607d8b;
    }

    .popup {
      position: fixed;
      top: 50%;
      left: 50%;
      transform: translate(-50%, -50%);
      background-color: rgba(255, 255, 255, 0.95);
      color: #333;
      padding: 20px 30px;
      border-radius: 10px;
      box-shadow: 0 0 20px rgba(0, 188, 212, 0.5);
      z-index: 1000;
      font-size: 18px;
      display: none;
    }

    .popup input {
      margin-top: 10px;
      padding: 8px;
      width: 100%;
      border-radius: 6px;
      border: 1px solid #ccc;
    }

    .popup .btn {
      margin-top: 15px;
    }
  </style>
</head>
<body>
  <div class="sidebar">
    <h2>EMS</h2>
    <a href="index.jsp"><i class="fas fa-chart-line"></i> Dashboard</a>
    <a href="employees.jsp"><i class="fas fa-users"></i> Employees</a>
    <a href="add_employee.jsp"><i class="fas fa-user-plus"></i> Add Employee</a>
    <a href="departments.jsp"><i class="fas fa-building"></i> Departments</a>
    <a href="settings.jsp"><i class="fas fa-cog"></i> Settings</a>
    <a href="logout.jsp"><i class="fas fa-sign-out-alt"></i> Logout</a>
  </div>

  <div class="main">
    <div class="header">
      <h1>Departments</h1>
    </div>

    <div class="form-section">
      <h2>Add Department</h2>
      <input type="text" id="deptName" placeholder="Enter department name" required />
      <button class="btn" onclick="addDepartment()">Add</button>
    </div>

    <div class="list-section">
      <h2>Department List</h2>
      <table id="deptTable">
        <thead>
          <tr>
            <th>#</th>
            <th>Department</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody></tbody>
      </table>
    </div>
  </div>

  <div class="popup" id="successPopup">Department added successfully!</div>

  <div class="popup" id="editPopup">
    <label for="editInput">Edit Department:</label>
    <input type="text" id="editInput" />
    <button class="btn" onclick="confirmEdit()">Update</button>
    <button class="btn btn-danger" onclick="closeEditPopup()">Cancel</button>
  </div>

  <script>
    let departments = [];
    let currentEditIndex = null;

    // Load departments from backend
    window.onload = async function() {
      await loadDepartments();
    }

    // Fetch departments from backend and render them
    async function loadDepartments() {
      try {
        const response = await fetch('DepartmentServlet'); // Replace with the correct servlet URL
        if (response.ok) {
          departments = await response.json(); // Assuming the backend sends the departments as JSON
          renderDepartments();
        } else {
          alert('Failed to load departments');
        }
      } catch (error) {
        alert('Error: ' + error);
      }
    }

    // Render the departments table
    function renderDepartments() {
      const tableBody = document.getElementById('deptTable').getElementsByTagName('tbody')[0];
      tableBody.innerHTML = ''; // Clear previous rows

      departments.forEach((dept, index) => {
        const row = tableBody.insertRow();
        const cell1 = row.insertCell(0);
        const cell2 = row.insertCell(1);
        const cell3 = row.insertCell(2);

        cell1.textContent = index + 1;
        cell2.textContent = dept.name; // Assuming department has a "name" field
        cell3.innerHTML = `
          <button class="btn btn-edit" onclick="editDepartment(${index})">Edit</button>
          <button class="btn btn-danger" onclick="removeDepartment(${index})">Remove</button>
        `;
      });
    }

    // Add new department
    async function addDepartment() {
      const deptName = document.getElementById('deptName').value.trim();
      if (deptName === '') return alert('Please enter a department name.');

      try {
        const response = await fetch('DepartmentServlet', {
          method: 'POST',
          headers: { 'Content-Type': 'application/json' },
          body: JSON.stringify({ name: deptName }) // Sending department name as JSON
        });

        if (response.ok) {
          document.getElementById('deptName').value = '';
          loadDepartments(); // Reload the department list
          showSuccessPopup();
        } else {
          alert('Failed to add department');
        }
      } catch (error) {
        alert('Error: ' + error);
      }
    }

    // Show success popup
    function showSuccessPopup() {
      const popup = document.getElementById('successPopup');
      popup.style.display = 'block';
      setTimeout(() => {
        popup.style.display = 'none';
      }, 1500);
    }

    // Remove department
    async function removeDepartment(index) {
      const deptId = departments[index].id; // Assuming each department has an "id"
      try {
        const response = await fetch('DepartmentServlet', {
          method: 'DELETE',
          headers: { 'Content-Type': 'application/json' },
          body: JSON.stringify({ id: deptId }) // Sending department ID to delete
        });

        if (response.ok) {
          loadDepartments(); // Reload the department list
        } else {
          alert('Failed to remove department');
        }
      } catch (error) {
        alert('Error: ' + error);
      }
    }

    // Edit department
    function editDepartment(index) {
      currentEditIndex = index;
      document.getElementById('editInput').value = departments[index].name;
      document.getElementById('editPopup').style.display = 'block';
    }

    // Confirm edit
    async function confirmEdit() {
      const newDeptName = document.getElementById('editInput').value.trim();
      if (newDeptName === '') return alert('Department name cannot be empty.');

      const deptId = departments[currentEditIndex].id;
      try {
        const response = await fetch('DepartmentServlet', {
          method: 'PUT',
          headers: { 'Content-Type': 'application/json' },
          body: JSON.stringify({ id: deptId, name: newDeptName })
        });

        if (response.ok) {
          document.getElementById('editPopup').style.display = 'none';
          loadDepartments(); // Reload the department list
        } else {
          alert('Failed to update department');
        }
      } catch (error) {
        alert('Error: ' + error);
      }
    }

    // Close edit popup
    function closeEditPopup() {
      document.getElementById('editPopup').style.display = 'none';
    }
  </script>
</body>
</html>
