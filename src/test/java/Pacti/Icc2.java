package Pacti;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class Icc2 
{
	@Test
	public void test1() throws Throwable
	{  
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/odi");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		

		    List<WebElement> ele = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		    List<WebElement> ele1= driver.findElements(By.xpath("//tbody/tr/td[3]"));
		    List<WebElement> ele2= driver.findElements(By.xpath("//tbody/tr/td[4]"));
		    List<WebElement> ele3= driver.findElements(By.xpath("//tbody/tr/td[5]"));
		     ArrayList<WebElement> a = new ArrayList<WebElement>();
		     
		     a.addAll(ele);
		     a.addAll(ele1);
		     a.addAll(ele2);
		     a.addAll(ele3);
		    
		      int count = a.size();
		     for(int i=0;i<count;i++)
		     {
		    	 System.out.println(a.get(i).getText());
		     
		     
		     }
				
			}
	

		           
		
		
	}
		     
	



