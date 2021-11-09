package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet{
	public ServletLifeCycle() {
		System.out.println("Constructor(): ServletLifeCycle");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init(): ServletLifeCycle");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Service(): ServletLifeCycle");
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroy(): ServletLifeCycle");
	}
}
