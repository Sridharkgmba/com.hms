package Pacti;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider_Facebook 
{
	@DataProvider
	public Object[][] data() throws Throwable
	{
		FileInputStream fis = new  FileInputStream(".\\src\\test\\resources\\commonData.properties\\facebook.xlsx");
		Workbook wh = WorkbookFactory.create(fis);
		Sheet sh = wh.getSheet("Sheet1");
		int l = sh.getLastRowNum()+1;
		int ce = sh.getRow(0).getLastCellNum();
		Object[][] obj = new Object[l][ce];
		for(int i=0;i<l;i++)
		{
			for(int j=0;i<ce;i++)
			{
				 obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
	}
	
	@Test(dataProvider = "data")
	public void test(String Emailid,String Password )
	{
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(Emailid);
		driver.findElement(By.id("pass")).sendKeys(Password);
	}
}
