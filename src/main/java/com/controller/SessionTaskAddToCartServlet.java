package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionTaskAddToCartServlet")
public class SessionTaskAddToCartServlet extends HttpServlet {
	@SuppressWarnings("unchecked")
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productId = Integer.parseInt(request.getParameter("productid"));
		HttpSession session = request.getSession();
		ArrayList<Integer> products = (ArrayList<Integer>)session.getAttribute("products");
		products.add(productId);
		session.setAttribute("products", products);
		
//		session.setAttribute("productId", productId);
		
		response.sendRedirect("SessionTaskHome.jsp");
	}
}
