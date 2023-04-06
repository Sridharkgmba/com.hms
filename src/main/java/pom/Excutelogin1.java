package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Genericutility.FileUtility;
import com.Genericutility.Ipathconstant;
import com.Genericutility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excutelogin1
{

	public static void main(String[] args) throws Throwable
	{
		WebdriverUtility wdu= new WebdriverUtility();
		FileUtility fu = new FileUtility();
		String users = fu.readdataproperty("user");
		String pass = fu.readdataproperty("password");
		  
		WebDriverManager.chromedriver().setup();
		WebDriver  driver=   new ChromeDriver();
		wdu.maximizewindow(driver);
		wdu.waitpagelod(driver);
		driver.get(Ipathconstant.Hmsurl);
		driver.findElement(By.xpath("//a[@href='hms/user-login.php']")).click();
		PomPatientlogin1 t = new PomPatientlogin1(driver); 
		t.log(users, pass);
		t.getUsers();
		t.getPass();
		t.getLogin();
			
		
	}
}

