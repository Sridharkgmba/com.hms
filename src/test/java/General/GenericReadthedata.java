package General;

import com.Genericutility.DatabaseUtility;

public class GenericReadthedata 
{
	public static void main(String[] args) throws Throwable 
	{
		DatabaseUtility dbi = new DatabaseUtility();
	    
		           dbi.connectiontoDB();
		           dbi.executeq("select *from product;");
		           dbi.closeDB();
	}
}
		              
		         