package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDEl {
	public static void main(String[] args) throws SQLException {
		Driver di= new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(di);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase","root", "root");
		
		Statement st1=con.createStatement();
		
		String query="update employee set contact = 7091234458 where name='pavin'";
		int data =st1.executeUpdate(query);
		System.out.println(data);
		 
		con.close(); 
	}

}
																												