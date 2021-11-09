package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/SessionAddToCartServlet")
public class SessionAddToCartServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		HttpSession session = request.getSession();
		session.setAttribute("id", id);
		ArrayList<Integer> cart = (ArrayList<Integer>) session.getAttribute("cart");
		cart.add(id);
		session.setAttribute("cart", cart);
		response.sendRedirect("SessionHome.jsp");
	}
}
