package com.servlet.http;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("get method invoked");
		
		resp.setContentType("Text/html");
		PrintWriter out = resp.getWriter();
		out.print("<h1>This is get method</h1>");
		out.print(new Date().toString());
	}

}
