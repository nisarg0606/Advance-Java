<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	String username = (String) request.getAttribute("username");
	int basicsalary = (Integer) request.getAttribute("bs");
	int bonus = (Integer) request.getAttribute("bonus");
	int pf = (Integer) request.getAttribute("pf");
	int total = (Integer) request.getAttribute("total");
%>

	Username:
		<%=username %>
	<br>
	BasicSalary:
	 <%=basicsalary %>
	 <br>
	 Bonus +
	 <%=bonus%>
	 pf - <%=pf %>
	<br>
	Total:
	<%=total %>
</body>
</html>