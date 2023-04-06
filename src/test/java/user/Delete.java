package user;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Delete 
{
	public static void main(String[] args) 
	{
		char driver='d';
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		String creat="should be created";
		d.get("http://rmgtestingserver/domain/Hospital_Management_System/");
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.findElement(By.xpath("//h3[.='Patients']/../descendant::a[.='Click Here']")).click();
		d.findElement(By.xpath("//a[contains(.,'Create an account')]")).click();
		d.findElement(By.xpath("//input[@name='full_name']")).sendKeys("sridharkg");
		d.findElement(By.xpath("//input[@name='address']")).sendKeys("23 Dawkavas Road Bel Layout Anjanagar");
		d.findElement(By.xpath("//input[@name='city']")).sendKeys("banaglore");
		d.findElement(By.xpath("//label[@for='rg-male']")).click();
		d.findElement(By.xpath("//input[@name='email']")).sendKeys("Sridharkgdhar@gmail.com");
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		d.findElement(By.xpath("//input[@name='password_again']")).sendKeys("123456");
		d.findElement(By.xpath("//label[@for='agree']")).click();
		d.findElement(By.xpath("//button[@type='submit']")).click();
		if(creat.equals(creat))
		{
			System.out.println("created");
		}
		else
		{
			System.out.println("not created");
		}
		final Alert a3 = d.switchTo().alert();
		Alert a = a3;
		a.accept();
		d.quit();
	String driver1="d1";
		WebDriverManager.chromedriver().setup();
		WebDriver d1=new ChromeDriver();
		d1.get("http://rmgtestingserver/domain/Hospital_Management_System/");
		d1.findElement(By.xpath("//h3[.='Admin Login']/../descendant::a[.='Click Here']")).click();
		d1.findElement(By.name("username")).sendKeys("admin");
		d1.findElement(By.name("password")).sendKeys("Test@12345");
		d1.findElement(By.xpath("//button[@type='submit']")).click();
		d1.findElement(By.xpath("//div[@class='item-inner']//span[contains(.,'Users')]")).click();
		d1.findElement(By.xpath("//span[contains(.,'Manage Users')]")).click();
		final WebElement ele = d.findElement(By.xpath("//td[.='sridharkg']"));
		final Point loc = ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		JavascriptExecutor jse=(JavascriptExecutor)d1;
		jse.executeScript("window.scrollBy("+x+","+y+")");
       d1.findElement(By.xpath("//td[.='sridharkg']/following-sibling::td/descendant::i[@class='fa fa-times fa fa-white']")).click();
       Alert a4=  d.switchTo().alert();
       a4.accept();

		




		
		
		

}
}
