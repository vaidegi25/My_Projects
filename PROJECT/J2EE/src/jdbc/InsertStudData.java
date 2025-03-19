package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertStudData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root", "root");
		PreparedStatement pst=con.prepareStatement("insert into student values (?,?,?,?,?)");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many rows you want");
			int row =sc.nextInt();
			
			for(int i=0;i<=row;i++)
			{
				System.out.println("enter the student id : " );
				int id=sc.nextInt();
				System.out.println("enter the student name : ");
				String sname=sc.next();
				System.out.println("enter the student city :");
				String city=sc.next();
				System.out.println("enter the student class :");
				int classs=sc.nextInt();
				System.out.println("enter the student percentage : ");
				int per=sc.nextInt();
				
				sc.close();
				
				pst.setInt(1, id);
				pst.setString(2, sname);
				pst.setString(3, city);
				pst.setInt(4, classs);
				pst.setInt(5, per);
				
				int a=pst.executeUpdate();
				System.out.println(a);	
			}	
		
		con.close();
	}
}
