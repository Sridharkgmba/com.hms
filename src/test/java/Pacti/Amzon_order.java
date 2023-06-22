package Pacti;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(com.Genericutility.Listnerimplmentclass.class)
public class Amzon_order 
{
	public static void main(String[] args) throws Throwable {


		ChromeOptions OP = new ChromeOptions();
		OP.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(OP);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iphone 14");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//div[.='Apple iPhone 14 (128 GB) - Midnight']"));
		Point loc = ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");

		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);

		Set<String> wi = driver.getWindowHandles();
		Iterator<String> it = wi.iterator();
		while(it.hasNext())
		{
			String n = it.next();
			driver.switchTo().window(n);
		}
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_3SkBxJ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Login']")).click();
		Thread.sleep(2000);
		//		             driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9844138658");
		Thread.sleep(2000);
		System.out.println(ele.getText());

	}

}


