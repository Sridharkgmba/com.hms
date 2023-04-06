package General;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Genericutility.FileUtility;
import com.Genericutility.Ipathconstant;
import com.Genericutility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericQuery 
{
	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		FileUtility flu = new FileUtility();
		WebdriverUtility wbu = new WebdriverUtility();
		String URL = flu.readdataproperty("curl");
		String USER = flu.readdataproperty("user");
		String PASS = flu.readdataproperty("password");
		String Aurls = flu.readdataproperty("username1");
		String Apass = flu.readdataproperty("password1");

		driver.get(URL);
		wbu.maximizewindow(driver);
		wbu.waitpagelod(driver);
		driver.findElement(By.xpath("//div[@class='header']/descendant::a[.='contact']")).click();
		driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys("Kishana");
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("krishna@gmail.com");
		driver.findElement(By.xpath("//input[@name='mobileno']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("is their any doctor available in the weekend for ENT");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		wbu.acceptalert(driver);
		wbu.quits(driver);
		WebDriverManager.chromedriver().setup();
		WebDriver driver1=new ChromeDriver();
		driver1.get(URL);
		driver1.findElement(By.xpath("//h3[.='Admin Login']/../descendant::a[.='Click Here']")).click();
		driver1.findElement(By.name("username")).sendKeys(Aurls);
		driver1.findElement(By.name("password")).sendKeys(Apass);
		driver1.findElement(By.xpath("//button[@type='submit']")).click();
		driver1.findElement(By.xpath("//div[@class='panel-body']/descendant::a[@href='unread-queries.php']")).click();
		WebElement sri = driver1.findElement(By.xpath("//td[.='sridhardhar']"));
		wbu.scrollaction(driver1, sri);
		driver1.findElement(By.xpath("//td[.='monisha']/following-sibling::td/descendant::i[@class='fa fa-file']")).click();
		driver1.findElement(By.xpath("//textarea[@name='adminremark']")).sendKeys("avalilbe");
		driver1.findElement(By.xpath("//button[@name='update']")).click();
		wbu.acceptalert(driver1);
		driver1.findElement(By.xpath("//i[@class='ti-angle-down']")).click();
		driver1.findElement(By.xpath("//a[contains(.,'Log Out')]")).click();
	}
}
		
		
		
		


	
		

