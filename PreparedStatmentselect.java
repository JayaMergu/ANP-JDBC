package MyProjectJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatmentselect {
	public static void main(String[] args) {
		try
		{
			//1.Register Driver class.
			Class.forName("com.mysql.cj.jdbc.Driver");//"oracle.jdbc.driver.OracleDriver"
			//2.create connection
			Connection con=null;
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","security");
			//3.create preparedstatment
			PreparedStatement ps=con.prepareStatement("select *from emp");
		         ResultSet rs=ps.executeQuery();
		         while(rs.next())
		         {
		        	 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		         }
			
			
			//5.close connection
			con.close();
		}catch(Exception e){
			System.out.println(e);
		} 
	}


}
