package Pacti;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminLogin 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.get("http://rmgtestingserver/domain/Hospital_Management_System/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//h3[.='Admin Login']/../descendant::a[.='Click Here']")).click();   
		 driver.findElement(By.name("username"));
		 driver.findElement(By.name("password")).sendKeys("Test@12345");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		  String t = driver.getTitle();
		    SoftAssert sa = new SoftAssert();
		    sa.assertEquals(t,"admin");
		    sa.assertAll();
		                 
	
	}

}
