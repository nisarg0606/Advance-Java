<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="PalindromeNameServlet" method="POST">
		Name: <input type="text" name = "nameValue" value="${nameValue}" />
		<br>
		<input type="submit" value="submit" />
	</form>
</body>
</html>