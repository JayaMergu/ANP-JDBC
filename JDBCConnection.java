package MyProjectJDBC;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class JDBCConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		try {
		//1.Register Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");//"oracle.jdbc.driver.OracleDriver"
		//2.Create connection
			Connection con=null;
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anp","root","security");
			System.out.println(con);
		//3.Create statement
			Statement stmt=con.createStatement();
		//4.execute query
			ResultSet rs=stmt.executeQuery("select * from demo");
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		//5.close connection
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
