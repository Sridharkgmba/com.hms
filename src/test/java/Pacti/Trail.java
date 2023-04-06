package Pacti;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trail 
{
	
	public static void main(String[] args) 
	{  
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		WebElement src = driver.findElement(By.xpath("//li[.='Item 1']"));
		WebElement dsc = driver.findElement(By.xpath("//li[.='Item 7']"));
		    Point loc = src.getLocation();
          System.out.println(loc.getX());
		  System.out.println(loc.getY());
		    Actions a = new Actions (driver);
			a.dragAndDrop(src, dsc).perform();

		
	}
	                                 
		
		
		
		
		
		
	
	}

		

	
	  
	        
	  
  
		
