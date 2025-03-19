package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicQuery {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase", "root", "root");
		
		// Comparsion  of sql query is comparsion
		// intilaization is prepared method will be prepare 
		PreparedStatement pst=con.prepareStatement("update employee set contact=? where id=?");
		
		// scanner to give dynamic execution 
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the id to update");
			int id=sc.nextInt();
			System.out.println("enter the contact to update");
			long contact=sc.nextLong();
			
			pst.setLong(1, contact);
			pst.setInt(2, id);
		}
		
		//execution of sql query is executred
		int a=pst.executeUpdate();
		System.out.println("*************" + a + "***************");
		
		con.close();
	}

}
