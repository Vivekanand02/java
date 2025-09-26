<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
<form action="regForm" method="post">
    Name : <input type="text" name="name1" required><br><br>
    Password : <input type="password" name="pass1" required><br><br>
    Email : <input type="email" name="email1" required><br><br>
    Gender : <input type="radio" name="gender1" value="Male" required>Male
             <input type="radio" name="gender1" value="Female">Female<br><br> 
    City : <select name="city1" required> 
            <option value="">Select City</option> 
            <option value="Delhi">Delhi</option> 
            <option value="Ghaziabad">Ghaziabad</option>
            <option value="Noida">Noida</option>
            <option value="Jaipur">Jaipur</option>
            <option value="Kolkata">Kolkata</option>
        </select><br><br>
    <input type="submit" value="Register">
</form>
</body>
</html>