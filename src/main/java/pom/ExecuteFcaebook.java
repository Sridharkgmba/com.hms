package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Genericutility.FileUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExecuteFcaebook 
{
	public static void main(String[] args) throws Throwable 
	{
		 
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		FileUtility fu = new FileUtility();
		
		String fusername = fu.readdataproperty("fuser");
		String fpass = fu.readdataproperty("fpass ");
		driver.get("https://www.facebook.com/");
		PomFacebook p=	 new PomFacebook(driver);
		p.user_pass(fusername,fpass);
		p.login();

	}          

}