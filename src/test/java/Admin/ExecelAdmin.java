package Admin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.bouncycastle.crypto.tls.HashAlgorithm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExecelAdmin 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=   new ChromeDriver();
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\commonData.properties\\Datas");
		Properties pobj = new Properties();
		String url = pobj.getProperty("curl1");
		String USER = pobj.getProperty("username1");
		String PASS = pobj.getProperty("password1");
		pobj.load(fi);
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\commonData.properties\\Book2.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		          Sheet sh = wb.getSheet("sheet2");
		
		driver.get("http://rmgtestingserver/domain/Hospital_Management_System/");
		driver.findElement(By.xpath("//h3[.='Admin Login']/../descendant::a[.='Click Here']")).click();
		driver.findElement(By.name("username")).sendKeys(USER);
		driver.findElement(By.name("password")).sendKeys(PASS);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@class='item-inner']/span[contains(.,'Doctors')]")).click();
		driver.findElement(By.xpath("//span[contains(.,' Add Doctor')]")).click();
		WebElement ele = driver.findElement(By.xpath("//select[@name='Doctorspecialization']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Gynecologist/Obstetrician1");
		 
		HashMap<String, String> map = new HashMap<String, String>();
		 for(int i=0;i<sh.getLastRowNum();i++)
		 {
			   String key = sh.getRow(i).getCell(0).getStringCellValue();
			   String value = sh.getRow(i).getCell(1).getStringCellValue();
			   map.put(key, value);
		 }
		  for(Entry<String, String> set:map.entrySet())
		  {
			  driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
		  }
		
		
	}

}
