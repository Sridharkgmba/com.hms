package com.Genericutility;

import java.io.FileInputStream;
import java.util.Properties;



public class FileUtility 
{
	public String readdataproperty(String key) throws Throwable
	{
		 

		FileInputStream fis	  =new FileInputStream(Ipathconstant.filepath);
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
		
		             
	}

}
