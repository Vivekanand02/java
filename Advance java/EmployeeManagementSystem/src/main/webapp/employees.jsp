<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <title>Employees | EMS</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
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

    .filters {
      display: flex;
      gap: 15px;
      margin: 20px 0;
    }

    .filters input, .filters select {
      padding: 10px;
      border-radius: 6px;
      border: none;
      outline: none;
      background: rgba(255, 255, 255, 0.1);
      color: #fff;
      font-size: 14px;
    }

    table {
      width: 100%;
      border-collapse: collapse;
      background: rgba(255, 255, 255, 0.1);
      backdrop-filter: blur(10px);
      border-radius: 16px;
      overflow: hidden;
      box-shadow: 0 8px 32px rgba(0, 0, 0, 0.25);
    }

    th, td {
      padding: 15px;
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

    .btn {
      background-color: #00bcd4;
      border: none;
      color: #fff;
      padding: 8px 15px;
      border-radius: 6px;
      cursor: pointer;
    }

    .modal {
      display: none;
      position: fixed;
      top: 0;
      left: 0;
      width: 100%;
      height: 100%;
      background: rgba(0,0,0,0.6);
      justify-content: center;
      align-items: center;
    }

    .modal-content {
      background: rgba(255, 255, 255, 0.1);
      backdrop-filter: blur(15px);
      padding: 30px;
      border-radius: 10px;
      color: #fff;
      width: 400px;
    }

    .close {
      float: right;
      cursor: pointer;
      color: #f44336;
    }

    .modal-actions {
      margin-top: 20px;
      display: flex;
      justify-content: space-between;
    }

    .btn-danger {
      background-color: #f44336;
    }

    .btn-secondary {
      background-color: #607d8b;
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
    <div class="header">
      <h1>Employees</h1>
    </div>

    <div class="filters">
      <input type="text" id="searchInput" placeholder="Search by name...">
      <select id="deptFilter">
        <option value="">All Departments</option>
        <option value="HR">HR</option>
        <option value="IT">IT</option>
      </select>
    </div>

    <table id="employeeTable">
      <thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Department</th>
          <th>Email</th>
          <th>Join Date</th>
          <th>Action</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>EMP001</td>
          <td>John Doe</td>
          <td>HR</td>
          <td>john@example.com</td>
          <td>2023-01-10</td>
          <td><button class="btn" onclick="openModal('EMP001', 'John Doe', 'HR', 'john@example.com')">Edit</button></td>
        </tr>
        <tr>
          <td>EMP002</td>
          <td>Jane Smith</td>
          <td>IT</td>
          <td>jane@example.com</td>
          <td>2023-03-22</td>
          <td><button class="btn" onclick="openModal('EMP002', 'Jane Smith', 'IT', 'jane@example.com')">Edit</button></td>
        </tr>
      </tbody>
    </table>
  </div>

  <div class="modal" id="employeeModal">
    <div class="modal-content">
      <span class="close" onclick="closeModal()">&times;</span>
      <h2>Edit Employee</h2>
      <form id="editForm">
        <input type="hidden" id="modalId" />
        <p><label>Name: <input type="text" id="modalName" required></label></p>
        <p><label>Department: <input type="text" id="modalDept" required></label></p>
        <p><label>Email: <input type="email" id="modalEmail" required></label></p>
        <div class="modal-actions">
          <button type="submit" class="btn btn-secondary">Update</button>
          <button type="button" class="btn btn-danger" onclick="removeEmployee()">Remove</button>
        </div>
      </form>
    </div>
  </div>

  <script>
    const searchInput = document.getElementById('searchInput');
    const deptFilter = document.getElementById('deptFilter');
    const table = document.getElementById('employeeTable');

    searchInput.addEventListener('input', filterTable);
    deptFilter.addEventListener('change', filterTable);

    function filterTable() {
      const search = searchInput.value.toLowerCase();
      const dept = deptFilter.value;
      const rows = table.getElementsByTagName('tbody')[0].getElementsByTagName('tr');

      Array.from(rows).forEach(row => {
        const name = row.cells[1].textContent.toLowerCase();
        const department = row.cells[2].textContent;
        const match = name.includes(search) && (dept === '' || department === dept);
        row.style.display = match ? '' : 'none';
      });
    }

    function openModal(id, name, dept, email) {
      document.getElementById('modalId').value = id;
      document.getElementById('modalName').value = name;
      document.getElementById('modalDept').value = dept;
      document.getElementById('modalEmail').value = email;
      document.getElementById('employeeModal').style.display = 'flex';
    }

    function closeModal() {
      document.getElementById('employeeModal').style.display = 'none';
    }

    document.getElementById('editForm').addEventListener('submit', function(e) {
    	  e.preventDefault();
    	  const id = document.getElementById('modalId').value;
    	  const name = document.getElementById('modalName').value;
    	  const dept = document.getElementById('modalDept').value;
    	  const email = document.getElementById('modalEmail').value;

    	  // Find and update the row in the table
    	  const rows = table.getElementsByTagName('tbody')[0].getElementsByTagName('tr');
    	  for (let row of rows) {
    	    if (row.cells[0].textContent === id) {
    	      row.cells[1].textContent = name;
    	      row.cells[2].textContent = dept;
    	      row.cells[3].textContent = email;
    	      break;
    	    }
    	  }

    	  closeModal();
    	});


    function removeEmployee() {
    	  const id = document.getElementById('modalId').value;
    	  const rows = table.getElementsByTagName('tbody')[0].getElementsByTagName('tr');
    	  
    	  for (let row of rows) {
    	    if (row.cells[0].textContent === id) {
    	      row.remove();
    	      break;
    	    }
    	  }

    	  closeModal();
    	}

  </script>
</body>
</html>