package com.servletproject;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginsess")
public class LoginSess extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String email =req.getParameter("useremail");
		 String pass =req.getParameter("userpassword");
		 
		 if(email.equals("abc@gmail.com") && pass.equals("abc123")) {
			 HttpSession session =req.getSession();
			 session.setAttribute("email", email);
			 req.getRequestDispatcher("homesess.html").forward(req, resp);
			 
		 }
		 
		 else {
			 req.getRequestDispatcher("loginsess.html").forward(req, resp);
		 }
	}

}
