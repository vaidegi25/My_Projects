package com.servletproject;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/productdata")
public class ProductData extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		int id=Integer.parseInt(req.getParameter("id"));
		String brand=req.getParameter("brand");
		double price =Double.parseDouble(req.getParameter("price"));
		double discount=Double.parseDouble(req.getParameter("discount"));
		
		try 
		{	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///productmob","root","root");
			PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?,?)");
			ps.setInt(1,id);
			ps.setString(2, brand);
			ps.setDouble(3, price);
			ps.setDouble(4, discount);
			
			int a=ps.executeUpdate();
			res.getWriter().println(a+ " row inserted");
			
		}
		catch (ClassNotFoundException  | SQLException e)
		{
			e.printStackTrace();
		} 
	}
}
