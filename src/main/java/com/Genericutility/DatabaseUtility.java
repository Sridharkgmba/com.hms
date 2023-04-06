package com.Genericutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtility 
{
	Connection con=null;	
	public void connectiontoDB() throws Throwable
	{
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection(Ipathconstant.DBurl,Ipathconstant.DBusername,Ipathconstant.DBpassword);
		

	}
	public void getconn() throws Throwable
	{
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		con=DriverManager.getConnection(Ipathconstant.DBS,Ipathconstant.DBuser,Ipathconstant.DBpass);
		
	}
	
	public void executeq(String query) throws Throwable
	{
		  ResultSet quer = con.createStatement().executeQuery(query);
		      while(quer.next())
		      {
		    	 System.out.println(quer.getString(1)+" "+quer.getString(2));
		      }
	}


	public String executequeryandgetdata(String query,int columnIndex,String expdata) throws Throwable
	{
		ResultSet result = con.createStatement().executeQuery(query);
		
		boolean flag = true;
		while(result.next())
		{
			String data = result.getString(columnIndex);
			System.out.println(data);
			if(data.equalsIgnoreCase(expdata))
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("data is verifed");
			return expdata;
		}else
		{
			System.out.println("data is not verifed");
		}
		return "";
	}
	public void closeDB() throws Throwable
	{
		con.close();
		System.out.println("DB is should be closed");
	}
}

  

