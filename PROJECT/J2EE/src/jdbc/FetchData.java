package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchData {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql:///school", "root", "root");
		PreparedStatement pst = con.prepareStatement("select percentage from student where class=? and percentage>?");
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the class : ");
			 int classs = sc.nextInt();
			 
			 System.out.println("enter the percentage : ");
			 int per = sc.nextInt();
			 
			 pst.setInt(1, classs);
			 pst.setInt(2, per);
		}
		 
		 ResultSet a=pst.executeQuery();
		 System.out.println(a);
		 
		 con.close();
	}

}
