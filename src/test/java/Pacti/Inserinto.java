package Pacti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Inserinto 
{
	
	public static void main(String[] args) throws SQLException
	{
		Driver driver= new Driver();
		DriverManager.registerDriver(driver);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dmall","root","root");
		Statement state = con.createStatement();
		String qurey  ="insert into product values(77,'UB',99,88,99,'king',71)";
		 int eq = state.executeUpdate(qurey);
		if(eq==2)
		{
			System.out.println("data is updates");
		}else
		{
			System.err.println("data is not updated");
		}
		
	}
}

