package com.servletproject;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/formdata")
public class FormData extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("username");
		long contactno = Long.parseLong(req.getParameter("usercontact"));
		
		res.getWriter().println("Name is : " +name + "and Contact no : " +contactno); 
	}
	
	

	
		
}
