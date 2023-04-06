package com.Genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.PomPatientloginpage;
 

public class Baseclass 
{
	
	public WebdriverUtility wu = new WebdriverUtility();
	public FileUtility fu = new FileUtility();
	public ExcelUtility eu = new ExcelUtility();
	public DatabaseUtility du = new DatabaseUtility();
	public WebDriver driver;
	public static WebDriver edriver;

	@BeforeSuite(alwaysRun =true)
	public void configurBS() throws Throwable
	{
		du.connectiontoDB();
		System.out.println("---connect to Db-");
	}
    //@Parameters("BROWSER")
	@BeforeClass(alwaysRun =true)
	public void configurBC() throws Throwable
	{

		String BROWSER = fu.readdataproperty("browser");  // showing only chrome bcz in property file created only chrime
		String CURL = fu.readdataproperty("curl");
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		}else
		{
			System.out.println("invalid broswer");
		}
		       edriver =driver;
		 wu.maximizewindow(driver);
		 driver.get(CURL);
		 wu.waitpagelod(driver);

	}
	@BeforeMethod(alwaysRun =true)
	public void configurBM() throws Throwable
	{
/*         String user = fu.readdataproperty("user");
         String pass = fu.readdataproperty("password");
         PomPatientloginpage p = new PomPatientloginpage(driver);
         p.login();
         p.username_pass(user, pass);
                            */
	}
	@AfterMethod(alwaysRun =true)
	public void configurAM()
	{
            
	}
	@AfterClass(alwaysRun =true)
	public void configurAC()
	{
      //driver.quit();
	}
	@AfterSuite(alwaysRun =true)
	public void configurAS() throws Throwable
	{
     du.closeDB();
	}

}
