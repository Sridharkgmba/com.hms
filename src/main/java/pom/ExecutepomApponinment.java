package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Genericutility.FileUtility;
import com.Genericutility.Ipathconstant;
import com.Genericutility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExecutepomApponinment 
{
	public static void main(String[] args) throws Throwable
	{
		WebdriverUtility wdu= new WebdriverUtility();
		WebDriverManager.chromedriver().setup();
		WebDriver  driver=   new ChromeDriver();
		       FileUtility fu = new FileUtility();
		        String USER = fu.readdataproperty("user");
		        String PASS = fu.readdataproperty("password");
		wdu.maximizewindow(driver);
		wdu.waitpagelod(driver);
		driver.get(Ipathconstant.Hmsurl);
		driver.findElement(By.xpath("//a[@href='hms/user-login.php']")).click();
		PomPatientloginpage pl = new PomPatientloginpage(driver);
	
		pl.username_pass(USER, PASS);
		
		pl.login();
		

		PomPatientAppintment pa = new PomPatientAppintment(driver);
		pa.Appointment();
		pa.Dspeclization();
		pa.Doctor();
		pa.Date();
		pa.Time();
		pa.Timepic();
		pa.logout();
		wdu.acceptalert(driver);


	}

}


