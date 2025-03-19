package com.servletproject;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/homesess")
public class HomeSess extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String email = (String) session.getAttribute("email");
		
		if(email ==null) {
			req.getRequestDispatcher("homesess.html").forward(req, resp);
		}
		
		else {
			req.getRequestDispatcher("loginsess.html").forward(req, resp);
		}
	}

}
