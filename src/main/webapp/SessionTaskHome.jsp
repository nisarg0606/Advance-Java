<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>Home Page</title>
</head>
<body>
	<div class="container">
	<h2>Home</h2>
	Welcome, ${userName}
	<br>
	<a href="SessionTaskViewMyCartServlet">My Cart</a>
	<a href="SessionTaskLogoutServlet">Logout</a>
	<br>
	<br>
	<br>
	<div class="row">
		<div class="col-md-4">
			<img alt="Maggie" src="assets/images/maggie.jpg">
			<br>Maggie<br>50<br>
			<a href="SessionTaskAddToCartServlet?productid=1">Add to Cart</a>
	</div>
	<div class="col-md-4">
			<img alt="Maggie" src="assets/images/maggie.jpg">
			<br>Maggie Chatakapataka<br>80<br>
			<a href="SessionTaskAddToCartServlet?productid=2">Add to Cart</a>
	</div>
	<div class="col-md-4">
			<img alt="Maggie" src="assets/images/maggie.jpg">
			<br>Tawa Maggie <br>100<br>
			<a href="SessionTaskAddToCartServlet?productid=3">Add to Cart</a>
	</div>
	</div>
</body>
</html>