package Pacti;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;



public class ReadDatafromDatabase 
{
	public static void main(String[] args) throws SQLException 
	{
		Connection con=null;
		try
		{
			Driver driver= new Driver();
			DriverManager.registerDriver(driver);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
			Statement state = con.createStatement();
			String qurey  ="select * from student;";
			 ResultSet eq = state.executeQuery(qurey);

			while(eq.next())
			{
				System.out.println(eq.getString(1)+" "+eq.getString(2)+" "+eq.getString(3));
			}
		}
		catch(Exception e)
		{

			System.out.println(e.getMessage());	
		}
        finally
        {
        	con.close();
        }
	}
}

