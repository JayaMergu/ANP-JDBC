package MyProjectJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementinsert {
	public static void main(String[] args) {
		try {
			//1.Register Driver class.
			Class.forName("com.mysql.cj.jdbc.Driver");//"oracle.jdbc.driver.OracleDriver"
			//2.create connection
			Connection con=null;
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","security");
			//3.create preparedstatment
			PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?,?)");
			ps.setString(1,"E106");
			ps.setString(2,"Sarika");
			ps.setInt(3,30000);
			ps.setInt(4, 22);
			//4.execute query.
			int i=ps.executeUpdate();
			System.out.println(i+ "  Record inserted sucessfully");
			//5.close connection
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
