package Pacti;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Genericutility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mytra 
{
	public static void main(String[] args) throws Throwable {
		ChromeOptions cp = new ChromeOptions();
		Map<String, Integer> conentsettings = new HashMap<String, Integer>();
		Map<String, Object> profile = new HashMap<String, Object>();
		Map<String, Object> prefs = new HashMap<String, Object>();
		conentsettings.put("notifications",2);
		profile.put("managed_default_content_setting",conentsettings);
		prefs.put("profile",profile);
		cp.setExperimentalOption("prefs", prefs);
		WebdriverUtility wu = new	WebdriverUtility();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(cp);
		wu.maximizewindow(driver);
		//	wu.notification();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//a[.='Home & Living']")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='desktop-categoryContainer']/following::ul[@data-reactid='575']"));
		wu.notification();
		int s = ele.size();
		for(int i=0;i<s;i++)
		{
			WebElement el = ele.get(i);
			System.out.println(el.getText());
		}
		WebElement ele3 = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		ele3.sendKeys("men t jacket");
		wu.enterkey();
		wu.enterrelease();
		 List<WebElement> c = driver.findElements(By.xpath("//img"));
		 for(         WebElement c1:c)
		 {
			         System.out.println(c1.getText());
		 }
		 
		      
		 
	}
	
	

}
