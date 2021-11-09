<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Nisarg.in</title>
</head>
<body>
	<form action="SessionTaskLoginServlet" method="post">
		User name: <input type="text" name="userName"/>
		<br>
		Password: <input type="password" name="password"/>
		<br>
		<input type="submit" value="Login">
	</form>
</body>
</html>