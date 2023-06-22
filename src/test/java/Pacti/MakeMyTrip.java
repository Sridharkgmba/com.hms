package Pacti;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip 
{
	public static void main(String[] args) throws Throwable {
		
	
	ChromeOptions OP = new ChromeOptions();
	OP.addArguments("--disable-notifications");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver(OP);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-cy='fromCity']")).sendKeys("Delhi");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[.='New Delhi, India']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-cy='fromCity']")).sendKeys("mumbai");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[.='Mumbai, India']")).click();
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.id("departure"));
	  Actions a = new Actions(driver);
	  a.moveToElement(ele).perform();
	  driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected DayPicker-Day--today']/descendant::p[@class=' todayPrice']")).click();
	
	
	
	

}
}
