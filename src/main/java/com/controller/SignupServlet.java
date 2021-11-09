package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupServlet extends 	HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Signup servlet called....");
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("pwd");
		
		
		System.out.println(firstName);
		System.out.println(email);
		System.out.println(password);
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("FirstName : "+firstName);
		out.print("<br>");
		out.print("Email : "+email+"<br>");
		out.print("Password : "+password );
		out.println("</body>");
		out.println("</html>");
	}
}