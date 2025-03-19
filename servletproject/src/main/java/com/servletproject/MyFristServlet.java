package com.servletproject;

import java.io.IOException;
import java.io.PrintWriter;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/url1")
public class MyFristServlet {
	public void service(ServletRequest req,ServletResponse res) throws IOException, ServletException {
		PrintWriter pw=res.getWriter();
		pw.println("hello user");
		
		
//		RequestDispatcher rd=req.getRequestDispatcher("url2");
//		rd.include(req, res);
	}
	

}
