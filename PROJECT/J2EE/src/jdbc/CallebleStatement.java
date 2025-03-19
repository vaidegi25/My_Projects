package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CallebleStatement {
		
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			Scanner sc=new Scanner(System.in);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase?user=root&password=root");
			
			CallableStatement cs=con.prepareCall("call mydb.updatecontact(?,?)");
			System.out.println("enter the name of employee where you want to update contact");
			String name=sc.next();
			System.out.println("enter the contact to update");
			long contact=sc.nextLong();
			sc.close();
			cs.setLong(1, contact);
			cs.setString(2,name);
			
			int a=cs.executeUpdate();
			
			System.out.println(a+" rows updated");
			
			con.close();
		}
	}

