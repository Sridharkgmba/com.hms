package Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Query 
{
	public static void main(String[] args)
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://rmgtestingserver/domain/Hospital_Management_System/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='header']/descendant::a[.='contact']")).click();
		driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys("monisha");
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("monisharmba@gmail.com");
		driver.findElement(By.xpath("//input[@name='mobileno']")).sendKeys("64646464646");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("is their any doctor available in the weekend for ENT");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		driver.quit();
		WebDriverManager.chromedriver().setup();
		WebDriver driver1=new ChromeDriver();
		driver1.get("http://rmgtestingserver/domain/Hospital_Management_System/");
		driver1.findElement(By.xpath("//h3[.='Admin Login']/../descendant::a[.='Click Here']")).click();
		driver1.findElement(By.name("username")).sendKeys("admin");
		driver1.findElement(By.name("password")).sendKeys("Test@12345");
		driver1.findElement(By.xpath("//button[@type='submit']")).click();
		driver1.findElement(By.xpath("//div[@class='panel-body']/descendant::a[@href='unread-queries.php']")).click();
		WebElement sri = driver1.findElement(By.xpath("//td[.='sridhardhar']"));
		Point loc = sri.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver1;
		jse.executeScript("window.scrollBy("+x+","+y+")");
		driver1.findElement(By.xpath("//td[.='monisha']/following-sibling::td/descendant::i[@class='fa fa-file']")).click();
		driver1.findElement(By.xpath("//textarea[@name='adminremark']")).sendKeys("  m,./");
		driver1.findElement(By.xpath("//input[@type='submit']")).click();
		Alert a2 = driver1.switchTo().alert();
		a2.accept();
		driver1.findElement(By.xpath("//i[@class='ti-angle-down']")).click();
		driver1.findElement(By.xpath("//a[contains(.,'Log Out')]")).click();
		   
	
	
	}
}
