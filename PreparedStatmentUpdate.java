package MyProjectJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatmentUpdate {
	public static void main(String[] args) {
		try
		{
			//1.Register Driver class.
			Class.forName("com.mysql.cj.jdbc.Driver");//"oracle.jdbc.driver.OracleDriver"
			//2.create connection
			Connection con=null;
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","security");
			//3.create preparedstatment
			PreparedStatement ps=con.prepareStatement("update emp set SALARY=? where emp_id=?");
			ps.setInt(1,50000);
			ps.setString(2,"E106");
			//4.execute query.
			int i=ps.executeUpdate();
			System.out.println(i+ "  Record  updated sucessfully");
			//5.close connection
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}
}
