package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DqlRestSet { 
	public static void main(String[] args) throws SQLException {
		Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase","root", "root");
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery("select email,name from employee");
		
		while(rs.next()) {
			//System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " " +rs.getString(3)+" "+rs.getLong(4));
			System.out.println(rs.getString(1)+" "+rs.getString(2));
		}
		
		con.close();
	}

}
