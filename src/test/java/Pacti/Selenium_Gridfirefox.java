package Pacti;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Gridfirefox
 {
   @Test
   public void test() throws Throwable
   {
	  ;
	   WebDriver driver=null;
	   String executemode="local";
	   if(executemode.equals("remote"))
	   {
		    java.net.URL url = new java.net.URL("http://192.168.253.64:1111/wd/hub");    ///remote 
		    DesiredCapabilities cap = new  DesiredCapabilities();
		     cap.setBrowserName("firefox");
		     cap.setPlatform(Platform.WINDOWS);
		     
		     driver=new RemoteWebDriver(url, cap);
	   }
		     else if(executemode.equals("local"))                   // local
		     {
		    	 WebDriverManager.firefoxdriver().setup();
		    	 driver =new FirefoxDriver();
	   }
	     
	      driver.get("https://google.com");
   }
}
