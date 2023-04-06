package General;

import com.Genericutility.ExcelUtility;

public class GenericReadExcel 
{
	public static void main(String[] args) throws Throwable 
		
	
	{
		  ExcelUtility exu = new ExcelUtility();
		  String str = exu.readdatafromexcel("Sheet1", 2, 1);
		  System.out.println(str);
		
	}

}
