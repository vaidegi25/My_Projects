package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrintStudData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school?user=root&password=root");
		PreparedStatement pst=con.prepareStatement("select sname from student where class=9  and percentage=(select max(percentage) from student )");
		
		int a=pst.executeUpdate();
		System.out.println(a);
		
		con.close();
		
	}
}
