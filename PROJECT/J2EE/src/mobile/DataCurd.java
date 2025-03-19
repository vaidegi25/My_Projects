package mobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DataCurd {
	
	static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/productmob?user=root&password=root");
		return con;
	}
	
	int insert(Product p) throws SQLException, ClassNotFoundException
	{	
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?,?)");
		ps.setInt(1, p.getId());
		ps.setString(2, p.getBrand());
		ps.setDouble(3, p.getCost());
		ps.setDouble(4, p.getDiscount());
		int a=ps.executeUpdate();
		return a;
	}
	
	Product fetch(int id) throws SQLException, ClassNotFoundException
	{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from product where id=?");
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
		Product p=new Product(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getDouble(4));
		return p;		
		}
		return null;
	}
	
	int delete(int id) throws ClassNotFoundException, SQLException {
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("delete from product where id=?");
		ps.setInt(1, id);
		int a=ps.executeUpdate();
		return a;
	}
	
	List<Product> fetchAll() throws ClassNotFoundException, SQLException
	{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from product");
		ResultSet rs=ps.executeQuery();
		List<Product> pl=new ArrayList<Product>();
		while(rs.next())
		{
			Product p=new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getDouble(4));
			pl.add(p);
		}
		return pl;
	}

}
