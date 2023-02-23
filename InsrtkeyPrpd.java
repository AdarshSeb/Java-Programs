package JDBCProgram;

import java.sql.*;
import java.io.*;

public class InsrtkeyPrpd {

	public static void main(String[] args) {
		try
		{
            Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			
			PreparedStatement pst = con.prepareStatement("insert into test values(?,?)");
			try
			{
				DataInputStream din = new DataInputStream(System.in);
				System.out.println("enter the id");
				String tid = din.readLine();
				System.out.println("enter the name");
				String tname = din.readLine();
				pst.setString(1, tid);
				pst.setString(2, tname);
			}
			catch(IOException ie)
			{
				System.out.println(ie);
			}
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
