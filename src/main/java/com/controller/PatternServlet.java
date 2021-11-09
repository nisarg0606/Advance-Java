package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PatternServlet extends HttpServlet{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String n1 = request.getParameter("n1");
		int n = Integer.parseInt(n1);
		
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		
		out.print("<html><body>");
		
		for(int i = 0; i<= n; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				out.print(j + " ");
			}
			out.print("<br>");
		}
		out.print("</body></html>");
	}
}
