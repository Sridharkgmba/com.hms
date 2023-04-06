package Pacti;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Readdata 
{
	public static void main(String[] args) throws Throwable
	{
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\commonData.properties\\Datas");
		Properties pro = new Properties();
		pro.load(fis);
		String Browser = pro.getProperty("browser");
		String URL = pro.getProperty("curl");
		String users = pro.getProperty("user");
		String passwords = pro.getProperty("password");
		System.out.println(Browser);
		System.out.println(URL);
		System.out.println(users);
		System.out.println(passwords);
		WebDriverManager.chromedriver().setup();
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(URL);
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElement(By.name("username")).sendKeys(users);
		  driver.findElement(By.name("password")).sendKeys(passwords);
		  driver.findElement(By.name("submit")).click();
		
	}

}
