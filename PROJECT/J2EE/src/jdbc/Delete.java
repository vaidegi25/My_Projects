package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) throws SQLException {
		Driver dr=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(dr);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase", "root", "root");
		
		Statement st=con.createStatement();
		 String query="delete from employee where name='pavin'";
		
		int data = st.executeUpdate(query);
		
		System.out.println(data);
		
		con.close();
		
		
	}

}
