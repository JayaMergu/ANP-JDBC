package MyProjectJDBC;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class DeleteStatment {

	public static void main(String[] args) {
		try
		{
			//1.Register Driver class.
			Class.forName("com.mysql.cj.jdbc.Driver");//"oracle.jdbc.driver.OracleDriver"
			//2.create connection
			Connection con=null;
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","security");
			System.out.println(con);
			//3.create statment
			java.sql.Statement stmt=con.createStatement();
			//4.execute query.
			String sql="delete from emp where emp_id='E105'";
		     int i=stmt.executeUpdate(sql);
		     System.out.println(i+" Record deleted sucessfully");
			//5.close connection
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
/*mysql> select * from emp;
+--------+---------+--------+------+
| emp_id | empName | salary | age  |
+--------+---------+--------+------+
| E105   | PRANALI | 70000  |   23 |
| E107   | PRANALI | 50000  |   23 |
+--------+---------+--------+------+
2 rows in set (0.00 sec)
mysql> select * from emp;
+--------+---------+--------+------+
| emp_id | empName | salary | age  |
+--------+---------+--------+------+
| E107   | PRANALI | 50000  |   23 |
+--------+---------+--------+------+
1 row in set (0.00 sec)
 * */
