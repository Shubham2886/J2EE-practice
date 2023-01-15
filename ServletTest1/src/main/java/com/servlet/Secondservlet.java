package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Secondservlet extends GenericServlet {

	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Generic sevlet");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.println("<h1>GOOD MORNING</h1>");
		out.println("<h1>JAI SHREE RAM</h1>");
		
	}
}
