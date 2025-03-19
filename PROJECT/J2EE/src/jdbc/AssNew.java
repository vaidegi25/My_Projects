package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class AssNew 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase","root", "root");
		
		PreparedStatement pst = con.prepareStatement("insert into employee values(?,?,?,?)");
		
	
		
			try (Scanner sc = new Scanner (System.in)) 
			{
				
			System.out.println("how much rows want : ");
			int row=sc.nextInt();
				for(int i=1;i<=row;i++) 
				{
				System.out.println("enter the id");
				int id=sc.nextInt();
				System.out.println("enter the name");
				String name=sc.next();
				System.out.println("enter the email");
				String email=sc.next();
				System.out.println("enter the contact");
				long contact=sc.nextLong(); 
				
				pst.setInt(1, id);
				pst.setString(2, name);
				pst.setString(3, email);
				pst.setLong(4, contact);
			}
				int a=pst.executeUpdate();
				System.out.println(a);
			}
			con.close();
		}
	}







// 1 insert 2 rows with prepare stat

// 2)  select name , contact where id=?

// o/p => id=1 => abc 123456789
// o/p => id=2 => xyz 987654321
