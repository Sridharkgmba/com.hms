package Pacti;

import static org.testng.Assert.fail;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Genericutility.Baseclass;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(com.Genericutility.Listnerimplmentclass.class)
public class TestngAddDoctor extends Baseclass
{
	@Test
	public void Adddoc() throws AWTException 
	{	
		
	
		driver.findElement(By.xpath("//h3[.='Admin Login']/../descendant::a[.='Click Here']")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@class='item-inner']/span[contains(.,'Doctors')]")).click();
		driver.findElement(By.xpath("//span[contains(.,' Add Doctor')]")).click();
		WebElement ele = driver.findElement(By.xpath("//select[@name='Doctorspecialization']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Gynecologist/Obstetrician1");
		driver.findElement(By.xpath("//input[@placeholder='Enter Doctor Name']")).sendKeys("abc");
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Doctor Clinic Address']")).sendKeys("Anjanagar Bangalore");
		driver.findElement(By.xpath("//input[@placeholder='Enter Doctor Consultancy Fees']")).sendKeys("500");
		driver.findElement(By.xpath("//input[@placeholder='Enter Doctor Contact no']")).sendKeys("6363784085");
		Random ran = new Random();
		int rn = ran.nextInt();
		String em="sridha";	    
		driver.findElement(By.xpath("//input[@placeholder='Enter Doctor Email id']")).sendKeys("em"+rn+"@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='New Password']")).sendKeys("7090800");
		Assert.fail();
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("7090800");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	  
		
	}
}

