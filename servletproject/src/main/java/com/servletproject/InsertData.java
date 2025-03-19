package com.servletproject;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/insert")
public class InsertData extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		int id=Integer.parseInt(req.getParameter("id"));
		String brand=req.getParameter("brand");
		double price =Double.parseDouble(req.getParameter("price"));
		double discount=Double.parseDouble(req.getParameter("discount"));
		
		
	}

}

