<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="TeamServlet" method="post">
    <input type="hidden" name="action" value="sendInvite" />
    <input type="text" name="teamId" placeholder="Team ID" required />
    <input type="text" name="userId" placeholder="User ID to Invite" required />
    <button type="submit">Send Invite</button>
</form>

</body>
</html>