 package com.Genericutility;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility 
{
	public void maximizewindow(WebDriver driver)
	{
		driver.manage().window().maximize();

	}

	public void waitpagelod(WebDriver driver)

	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
	}
	public void elementvisvisbile(WebDriver driver,WebElement element)
	{
		WebDriverWait Wait = new WebDriverWait(driver,10);
		Wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void select(WebElement element,int index )
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	public void select(WebElement element,String vtext )
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(vtext);
	}
	public void select1(WebElement element,String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	public void mouseover(WebDriver driver,WebElement element)
	{
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	public void draganddrop(WebDriver driver,WebElement src,WebElement dst)
	{
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dst).perform();

	}
	public void doubleclick(WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.doubleClick().perform();
	}
	public void rightclcik(WebDriver driver,WebElement element)
	{
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}
	public void enterkeypress(WebDriver driver)
	{
		Actions a = new Actions(driver); 
		a.sendKeys(Keys.ENTER).perform();
	}

	public void enterkey() throws Throwable 
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
	public void enterrelease() throws Throwable
	{
		Robot r = new Robot();
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void switchtoframes(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchtoframes(WebDriver driver,String nameOrID)
	{
		driver.switchTo().frame(nameOrID);
	}
	public void switchtoframes(WebDriver driver,WebElement address)
	{
		driver.switchTo().frame(address);

	}
	public void acceptalert(WebDriver driver)
	{
		driver.switchTo().alert();
	}
	public void cancelalert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	public void switchtowindow(WebDriver driver,String partialtitle)
	{
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		while(it.hasNext())
		{
			String windit = it.next(); 
			String title = driver.switchTo().window(windit).getTitle();
			if(title.contains(partialtitle))
			{
				break;
			}
		}
	}
	public void scrollbar(WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)","");

	}
	public void scrollaction(WebDriver driver,WebElement element)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;  
		int y = element.getLocation().getY();
		jse.executeScript("window.scrollBy(0,"+y+")",element);
	}
	 public void quits(WebDriver driver)
	 {
		  driver.quit();
	 }
	 public void closeApp(WebDriver driver)
	 {
		 driver.close();
	 }
	 public void copyandpaste(WebElement element,WebElement element1) throws Throwable
	 {
		 Robot robot = new Robot(); 
		 element.sendKeys(Keys.CONTROL+"c");
		 element1.sendKeys(Keys.CONTROL+"v");
		         
	 }
	 public static String getScreenShot(WebDriver driver ,String screenshotname) throws Throwable 
	 {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			String path = ".\\screenshot\\"+screenshotname+".png";
			File dst = new File(path);
			FileUtils.copyFile(src, dst);
			return path;
	 
}
	  public void notification()
	  {
		     ChromeOptions cp = new ChromeOptions();
		      cp.addArguments("---handled--");
	  }
}
	
	
	

	
	
	
	
	
	
	
	
	
	
