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
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Amzon 
{

	
	
		@Test
		public void test1() throws Throwable
		{  
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--disable-notifications");
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver(op);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.amazon.in/");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tcl tv");
			driver.findElement(By.id("nav-search-submit-button")).click();
			WebElement ele = driver.findElement(By.xpath("//span[.='TCL 108 cm (43 inches) 4K Ultra HD Certified Android Smart LED TV 43P615 (Black)']"));
			//WebElement ele1 = driver.findElement(By.xpath("//span[.='TCL 108 cm (43 inches) 4K Ultra HD Certified Android Smart LED TV 43P615 (Black)']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[@class='a-price-whole']"));
        
			Actions  a = new Actions(driver);
			Robot r = new Robot();
			a.contextClick(ele).perform();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);

			Set<String> wid = driver.getWindowHandles();
			Iterator<String> it = wid.iterator();

			while(it.hasNext())
			{
				String win = it.next();
				driver.switchTo().window(win);

			}
			
      System.out.println(ele.getText());

		}

}
