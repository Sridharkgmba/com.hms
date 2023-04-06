package com.Genericutility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtility 
{
	public int Random()
	{
		   java.util.Random ran = new java.util.Random();
		     int random = ran.nextInt(500);
		      return random;
	}
	
	 public String getsystemdata()
	 {
		   Date dt = new Date();
		   String date = dt.toString();
		   return date;
		   
	 }
	 public void formatsystemdate()
	 {
		     SimpleDateFormat dateFormat = new SimpleDateFormat("dd:MM:yyy hh:mm:ss");
		     Date dt = new Date();
		      String format = dateFormat.format(dt);
		      format.replace(":","-");
		         
	 }

}
