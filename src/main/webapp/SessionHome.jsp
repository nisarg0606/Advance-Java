<%@page import="java.util.ArrayList"%>
<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>SessionHome</h2>
	<a href="SessionPrintDataServlet">PrintData</a> | 
	<a href="SessionViewMyCart.jsp">View Cart</a>
	<a href="SessionLogoutServlet">Logout</a>
	<br>
	Good Morning, ${firstName}	
	<br>
	<h3>Product 1: Maggie</h3>
	<a href="SessionAddToCartServlet?id=1" id="1">Add to cart</a>
	<img src="assets/images/maggie.jpg" height="200" width="200">
	<a href="SessionAddToCartServlet?id=2" id="2">Add to cart</a>
	<h3>Product 2: Cheesy Masala Maggie</h3>
	<img src="assets/images/maggie.jpg" height="200" width="200">
	<a href="SessionAddToCartServlet?id=3" id="3">Add to cart</a>
	<h3>Product 3: Tawa Maggie</h3>
	<img src="assets/images/maggie.jpg" height="200" width="200">
</body>
</html>