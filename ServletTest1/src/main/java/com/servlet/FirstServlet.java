package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Timer;

import javax.servlet.*;

import org.apache.tomcat.jni.Time;


public class FirstServlet implements Servlet {
	
	ServletConfig conf;
	public void init(ServletConfig config) {
		
		this.conf=conf;
		System.out.println("creating");
	}
	
	
	
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException {
		
		System.out.println("servicing");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>This is my badshah output</h1>");
		out.println("<h1>Todays Date and Time is :"+ new java.util.Date()+"</h1>");
		
	}
	public void destroy() {
		System.out.println("destroy servlet method");
	}

	
	
	public ServletConfig getServletConfig() {
		
		return this.conf;
	}
	
	
	public String getServletInfo() {
		
	return "This servlet is created by BADSHAH";
	
	}
}
