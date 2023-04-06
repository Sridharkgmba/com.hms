package Pacti;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Genericutility.ExcelUtility;

public class ResultDataprovider 
{
	

	@Test(dataProvider ="datas")
	
    public void getdata(String Src,String dst,String dst1)
    {
	    System.out.println(Src+""+dst+""+dst1);
		
	}
	
	@DataProvider
	public Object[][] datas() throws Throwable
	{
		 ExcelUtility ex = new ExcelUtility();
		  Object[][] value = ex.DataProviderdata("Data");
	
	return value;
}

}



