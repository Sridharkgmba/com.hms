package Pacti;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;

import com.Genericutility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trail 
{
	public static void main(String[] args) throws Throwable 
	{
		ChromeOptions cp = new ChromeOptions();
		Map<String, Integer> conentsettings = new HashMap<String, Integer>();
		Map<String, Object> profile = new HashMap<String, Object>();
		Map<String, Object> prefs = new HashMap<String, Object>();
		conentsettings.put("notifications",2);
		profile.put("managed_default_content_setting",conentsettings);
		prefs.put("profile",profile);
		cp.setExperimentalOption("prefs", prefs);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(cp);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://mictests.com/");
		driver.findElement(By.xpath("//button[.='Test my mic']")).click();
		
	}
	
	}


		