<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cookie Trial</title>
</head>
<body>
	<a href="PrintAllCookies.jsp">PrintAllCookies</a>
	<form action="AddCookieServlet" method="post">
		CookieName: <input type="text" name="cname"/><br>
		CookieValue: <input type="text" name="cvalue"/><br>
		<input type="submit" value="AddCookie">
	</form>
</body>
</html>