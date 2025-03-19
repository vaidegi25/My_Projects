package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateEmp {
	public static void main(String[] args) throws SQLException {
		Driver dr =new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(dr);
		
		String path="jdbc:mysql://localhost:3306/newdatabase";
		String user = "root";
		String pwd = "root";
		Connection con=DriverManager.getConnection(path,user,pwd);
		 
		String query ="insert into employee values(1,'vaishu','vai@25',7305141548)"; 
		Statement st =con.createStatement();
		 
		int data = st.executeUpdate(query);
		System.out.println(data);
		 
		con.close();
		 
	}
}
