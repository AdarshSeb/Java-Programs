package JDBCProgram;
import java.sql.*;
public class Prepstmt {

	public static void main(String[] args) {
		try
		{
            Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			
			PreparedStatement pst = con.prepareStatement("insert into test values(?,?)");
			
			pst.setString(1,"t12");
			pst.setString(2,"test12");
			int i= pst.executeUpdate();
			System.out.println("Rows affected "+i);
		
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
