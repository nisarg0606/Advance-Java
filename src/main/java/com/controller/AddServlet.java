package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n1 = Integer.parseInt(request.getParameter("n1"));
		String no2 = request.getParameter("n2");
		int n2 = Integer.parseInt(no2);
		
		int ans = n1 + n2;
		System.out.println(ans);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		out.print("Addition = "+ans);
		out.print("</body></html>");
		
	}
}
