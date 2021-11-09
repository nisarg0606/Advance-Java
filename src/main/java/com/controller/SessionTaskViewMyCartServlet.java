package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionTaskViewMyCartServlet")
public class SessionTaskViewMyCartServlet extends HttpServlet{

protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session = request.getSession();
	PrintWriter out = response.getWriter();
	
	ArrayList<Integer> products = (ArrayList<Integer>)session.getAttribute("products");
	
	response.setContentType("text/html");
	
	out.print("<html><body>");
	
	if(products.size() == 0)
	{
		out.print("Cart is Empty                   ");
		
		out.print("<a href=SessionTaskHome.jsp>Back</a>");
//		response.sendRedirect("SessionTaskHome.jsp");
	}
	else {
		int maggieCounter = 0;
		int chatakapatakamaggieCounter = 0;
		int tawamaggieCounter = 0;
		for(int productId: products)
		{
			if(productId == 1)
				maggieCounter++;
			else if(productId == 2)
				chatakapatakamaggieCounter++;
			else if(productId == 3)
				tawamaggieCounter++;
		}
		
		out.print("<table>");
		out.print("<tr>");
		out.print("<th>ProductName</th><th>Price</th><th>Qty</th><th>Total</th><th>Remove From Cart</th>");
		out.print("</tr>");

		if (maggieCounter != 0) {
			out.print("<tr><td>Maggie</td><td>50</td><td>" + maggieCounter + "</td><td>"
					+ (50 * maggieCounter) + "</td><td>"+ "<a href=SessionTaskRemoveFromCart?productid=1>RFC</a>"+"</td></tr>");
		}

		if (chatakapatakamaggieCounter != 0) {
			out.print("<tr><td>Chatakapataka Maggie</td><td>80</td><td>" + chatakapatakamaggieCounter + "</td><td>"
					+ (80 * chatakapatakamaggieCounter) + "</td><td>"+ "<a href=SessionTaskRemoveFromCart?productid=2>RFC</a>"+"</td></tr>");
		}

		if (tawamaggieCounter != 0) {
			out.print("<tr><td>Tawa Maggie</td><td>100</td><td>" + tawamaggieCounter + "</td><td>" 
					+ (100 * tawamaggieCounter)+ "</td><td>"+ "<a href=SessionTaskRemoveFromCart?productid=3>RFC</a>"+"</td></tr>");
		}
		out.print("</table>");
		out.print("Grand Total = "+ ((50 * maggieCounter)+(80 * chatakapatakamaggieCounter)+(100 * tawamaggieCounter)));
	}
//	if(session.getAttribute("productId") == null)
//	{
//		out.print("Cart is Empty");
//	}else {
//		int productId = (Integer)session.getAttribute("productId");
//		if(productId == 1)
//		{
//			out.print("Maggie 50");
//		}
//		if(productId == 2)
//		{
//			out.print("Maggie Chatakapataka 80");			
//		}
//		if(productId == 3)
//		{
//			out.print("Tawa Maggie 100");
//		}
//	}
	out.print("</body></html>");
	
}
}
