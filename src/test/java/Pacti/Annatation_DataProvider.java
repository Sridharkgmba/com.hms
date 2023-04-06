package Pacti;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Annatation_DataProvider
{
	@Test(dataProvider ="data" )
	public void getdata(String src,String dst,String dst1,String dst2)
	{
		System.out.println(src+""+dst+""+dst1+""+dst2);
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] obj  =new Object[4][4];
		 obj[0][0]="Qsp";
		 obj[0][1]="Testyantra";
		 obj[0][2]="loc";
		 obj[0][3]="Km";
		 
		
		obj[1][0]="hebble";
		obj[1][1]="Bangalore";
		obj[1][2]="mys";
		obj[1][3]="ten";
		
		obj[2][0]="hebble";
		obj[2][1]="Bangalore";
		obj[2][2]="mys";
		obj[2][3]="ten1";
		
		obj[3][0]="basvangudi";
		obj[3][1]="kathri";
     	obj[3][2]="jungle";
     	obj[3][3]="ten2";
     	
		
		return  obj;
	}

}
