package Pacti;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Grid
 {
   @Test
   public void test() throws Throwable
   {
	  ;
	   WebDriver driver=null;
	   String executemode="remote";
	   if(executemode.equals("remote"))
	   {
		    java.net.URL url = new java.net.URL("http://192.168.253.64:1111/wd/hub");    ///remote 
		    DesiredCapabilities cap = new  DesiredCapabilities();
		     cap.setBrowserName("chrome");
		     cap.setPlatform(Platform.WINDOWS);
		     
		     driver=new RemoteWebDriver(url, cap);
	   }
		     else if(executemode.equals("local"))                   // local
		     {
		    	 WebDriverManager.chromedriver().setup();
		    	 driver=new ChromeDriver();
	   }
	     
	      driver.get("https://google.com");
   }
}
