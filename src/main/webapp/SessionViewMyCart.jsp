<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>My Cart</h2>
	<%ArrayList<Integer> cart = (ArrayList<Integer>)request.getAttribute("cart");%>
	<%int maggie = 0;
	int cheesy_maggie_masala = 0;
	int tawa_maggie = 0;
	for(Integer id: cart){
		if(id == 1)
		{
			maggie++;
		}
		else if(id == 2)
		{
			cheesy_maggie_masala++;
		}
		else if(id == 3)
		{
			tawa_maggie++;
		}
		if(maggie != 0)
		{
			out.println("Maggie "+ maggie + "Price" + 50 +"Total " + maggie);
		}
		if(cheesy_maggie_masala != 0)
		{
			out.println("Cheesy Maggie Masalaa "+ cheesy_maggie_masala + "Price" + 70 +"Total " + cheesy_maggie_masala);
		}
		if(tawa_maggie != 0)
		{
			out.println("Tawa Maggie "+ tawa_maggie + "Price" + 90 +"Total " + tawa_maggie);
		}
	}%>
</body>
</html>