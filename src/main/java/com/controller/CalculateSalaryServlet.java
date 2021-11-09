package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateSalaryServlet extends HttpServlet{

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String bs = request.getParameter("bs");
		int basicsalary = Integer.parseInt(bs);
		
		boolean isError = false;
		
		int bonus = (basicsalary*10)/100;
		int pf = (int)(basicsalary*0.12);
		int total = basicsalary + bonus - pf;
		request.setAttribute("username", username);
		request.setAttribute("bs", basicsalary);
		request.setAttribute("bonus", bonus);
		request.setAttribute("pf", pf);
		request.setAttribute("total", total);
		
		RequestDispatcher rd = request.getRequestDispatcher("PrintSalary.jsp");
		rd.forward(request, response);
	}
}