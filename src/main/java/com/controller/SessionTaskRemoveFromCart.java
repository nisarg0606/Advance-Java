package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionTaskRemoveFromCart")
public class SessionTaskRemoveFromCart extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		int productId = Integer.parseInt(request.getParameter("productid"));
//		HttpSession session = request.getSession();
//		ArrayList<Integer> products = (ArrayList<Integer>)session.getAttribute("products");
//		if(products.size() == 0)
//		{
//			response.sendRedirect("SessionTaskViewMyCartServlet");			
//		}
//		else {
//			for(int productId: products)
//			{
//				if(productId == 1)
//					products.remove(productId);
//				else if(productId == 2)
//					products.remove(productId);
//				else if(productId == 3)
//					products.remove(productId);
//			}
//			
//		}
//		int productId = Integer.parseInt(request.getParameter("productid"));
//		HttpSession session = request.getSession();
//		ArrayList<Integer> products = (ArrayList<Integer>)session.getAttribute("products");
//		products.remove(productId);
//		session.setAttribute("products", products);
//		response.sendRedirect("SessionTaskViewMyCartServlet");
//		session.setAttribute("products", products);
//		response.sendRedirect("SessionTaskViewMyCartServlet");
		int productId = Integer.parseInt(request.getParameter("productid"));
		HttpSession session = request.getSession();
		ArrayList<Integer> products = (ArrayList<Integer>) session.getAttribute("products");
		System.out.println(products);
		Iterator<Integer> itr = products.iterator();
		while(itr.hasNext())
		{
			int data = (Integer)itr.next();
			if(data == productId)
			{
				itr.remove();
				break;
			}
		}
		System.out.println(products +"after removing it from the list");
		session.setAttribute("products", products);
		response.sendRedirect("SessionTaskViewMyCartServlet");
	}
}
