package Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddSpecilization
{
		public static void main(String[] args) 
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("http://rmgtestingserver/domain/Hospital_Management_System/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//h3[.='Admin Login']/../descendant::a[.='Click Here']")).click();
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("Test@12345");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.findElement(By.xpath("//div[@class='item-inner']/span[contains(.,'Doctors')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'Doctor Specialization')]")).click();
			driver.findElement(By.name("doctorspecilization")).sendKeys("Heart");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Alert a = driver.switchTo().alert();
			a.accept();
			 

}
}
