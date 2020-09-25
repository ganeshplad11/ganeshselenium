package DatabasUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
public class JDBCCON {

//	private static final Connection DriverManager = null;

	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			//Connection con = DriverManager.getConnection("locahost:1522/XEPDB1","system","system");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@locahost:1522/XEPDB1","system","system");

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from Device");
			while (rs.next())
			{
				System.out.println(rs.getString("ID"));
			}
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
