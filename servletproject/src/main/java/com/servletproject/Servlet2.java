package com.servletproject;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/s2")
public class Servlet2 extends  GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String mail=(String) req.getAttribute("mail");
		String pwd=(String) req.getAttribute("pwd");
		
		res.getWriter().println("Email is : "+mail+ "Password is : " +pwd );
	}

}
