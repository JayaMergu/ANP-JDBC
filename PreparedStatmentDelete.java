package MyProjectJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatmentDelete {
	public static void main(String[] args) {
		try
		{
			//1.Register Driver class.
			Class.forName("com.mysql.cj.jdbc.Driver");//"oracle.jdbc.driver.OracleDriver"
			//2.create connection
			Connection con=null;
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","security");
			//3.create preparedstatment
			PreparedStatement ps=con.prepareStatement("delete from emp where emp_id=?");
			ps.setString(1,"E106");
			
			//4.execute query.
			int i=ps.executeUpdate();
			System.out.println(i+ "  Record Deleted sucessfully");
			//5.close connection
			con.close();
		}catch(Exception e){
			System.out.println(e);
		} 

	}
}

/*OUTPUT:-
 * 
 * mysql> select * from emp;
+--------+---------+--------+------+
| emp_id | empName | salary | age  |
+--------+---------+--------+------+
| E106   | Sarika  | 30000  |   22 |
+--------+---------+--------+------+
1 row in set (0.02 sec)

mysql> select * from emp;
+--------+---------+--------+------+
| emp_id | empName | salary | age  |
+--------+---------+--------+------+
| E106   | Sarika  | 50000  |   22 |
+--------+---------+--------+------+
1 row in set (0.15 sec)

mysql> select * from emp;
Empty set (0.00 sec)
*/
