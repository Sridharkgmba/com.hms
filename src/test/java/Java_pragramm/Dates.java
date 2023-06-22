package Java_pragramm;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates
{
	public static void main(String[] args) 
	{
		    
		      SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		               Date d1 = new Date();
		                   String f = d.format(d1);
		                   System.out.println(f);
	
}

}
