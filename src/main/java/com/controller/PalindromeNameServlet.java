package com.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/PalindromeNameServlet")
public class PalindromeNameServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("nameValue");
		name = name.toLowerCase();
		StringBuilder sb = new StringBuilder(name);
        if(name.equals(sb.reverse().toString()))
        {
            System.out.println("String is Palindrome");
            request.setAttribute("name", name);
            RequestDispatcher rd = request.getRequestDispatcher("PrintPalindromeString.jsp");
            rd.forward(request, response);
        }
        else
        {
            System.out.println("String is not Palindrome");
            request.setAttribute("name", name);
            RequestDispatcher rd = request.getRequestDispatcher("PrintNonPalindromeString.jsp");
            rd.forward(request, response);
        }
	}
}
