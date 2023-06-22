package Pattern_Java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Genericutility.FileUtility;
import com.Genericutility.Ipathconstant;
import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trail 
{
	public static void main(String[] args) throws Throwable, IOException 
	{
	 String browser="chrome";
	 
		WebDriver driver;
	
		if(browser.equals("chromes"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
	}
	}
	