package com.servletproject;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/sendredirect")
public class SendRedirect extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("--------Service Phase--------");
		
		String email=req.getParameter("useremail");
		String pass = req.getParameter("userpassword");
		
		if(!email.isBlank() && !pass.isBlank()) {
			resp.sendRedirect("homesess.html");
		}
		else {
			resp.sendRedirect("loginsess.html");
		}

}
	
	@Override
	public void init() throws ServletException {
		System.out.println("--------Init Phase---------");
	}
	
	@Override
	public void destroy() {
		System.out.println("-----------Destroy Phase-----------");
	}
}
	
