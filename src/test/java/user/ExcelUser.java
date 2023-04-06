package user;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelUser 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		char driver='d';
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\commonData.properties\\Datas");
		Properties pobj = new Properties();
		pobj.load(fi);
		String URL = pobj.getProperty("curl");
		
       d.get(URL);
		d.findElement(By.xpath("//h3[.='Patients']/../descendant::a[.='Click Here']")).click();
		d.findElement(By.xpath("//a[contains(.,'Create an account')]")).click();
		FileInputStream fis =new FileInputStream(".\\src\\test\\resources\\commonData.properties\\Book2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("sheet1");
		HashMap<String, String> Map = new HashMap<String,String>();
		for(int i=0;i<sh.getLastRowNum();i++)
		{
			String key = sh.getRow(i).getCell(0).getStringCellValue();
			String value = sh.getRow(i).getCell(1).getStringCellValue();
			Map.put(key, value);

		}
		for(Entry<String, String> set:Map.entrySet())
		{
			d.findElement(By.name(set.getKey())).sendKeys(set.getValue());
		}

	}

}
