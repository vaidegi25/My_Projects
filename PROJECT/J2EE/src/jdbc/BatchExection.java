package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;

public class BatchExection {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("Jdbc:mysql://localhost:3306/newdatabase?user=root&password=root");
		
		java.sql.Statement st=con.createStatement();
		st.addBatch("insert into employee values(8,'jagan','jagan@gmail.com',9786765889)");
		st.addBatch("update employee set contact=789878790 where id=1");
		st.addBatch("delete from employee where id=3");
		
		int[] a=st.executeBatch();
		
		System.out.println(Arrays.toString(a));
		
		con.close();
	}

}
