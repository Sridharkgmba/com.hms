package Admin;

import java.awt.AWTException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login
{

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://rmgtestingserver/domain/Hospital_Management_System/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//h3[.='Admin Login']/../descendant::a[.='Click Here']")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@class='item-inner']/span[contains(.,'Doctors')]")).click();
		driver.findElement(By.xpath("//span[contains(.,' Add Doctor')]")).click();
		WebElement ele = driver.findElement(By.xpath("//select[@name='Doctorspecialization']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Gynecologist/Obstetrician1");
		driver.findElement(By.xpath("//input[@placeholder='Enter Doctor Name']")).sendKeys("abc");
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Doctor Clinic Address']")).sendKeys("Anjanagar Bangalore");
		driver.findElement(By.xpath("//input[@placeholder='Enter Doctor Consultancy Fees']")).sendKeys("500");
		driver.findElement(By.xpath("//input[@placeholder='Enter Doctor Contact no']")).sendKeys("6363784085");
		Random ran = new Random();
		int rn = ran.nextInt();
		String em="sridha";
		driver.findElement(By.xpath("//input[@placeholder='Enter Doctor Email id']")).sendKeys("em"+rn+"@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='New Password']")).sendKeys("7090800");
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("7090800");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		final Alert a5 = driver.switchTo().alert();
		Alert a2 = a5;
		Alert a = a2;
		a.accept();
		driver.findElement(By.xpath("//i[@class='ti-angle-down']")).click();
		driver.findElement(By.xpath("//a[contains(.,'Log Out')]")).click();
		driver.findElement(By.xpath("//a[@href='hms/user-login.php']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Sridharkg1990@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sridhar@1990");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@class='item-inner']/span[contains(.,'Book Appointment')]")).click();
		WebElement ele1 = driver.findElement(By.xpath("//select[@name='Doctorspecialization']"));
		Select selL = new Select(ele1);
		selL.selectByVisibleText("Gynecologist/Obstetrician1");
		final WebElement ele3 = driver.findElement(By.xpath("//select[@name='doctor']"));
		Select selll = new Select(ele3);
		selll.selectByVisibleText("abc");
		driver.findElement(By.name("appdate")).click();
		driver.findElement(By.xpath("//td[.='15']")).click();
		driver.findElement(By.id("timepicker1")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Alert  a3=a5;
		a3.accept();
		driver.findElement(By.xpath("//i[@class='ti-angle-down']")).click();
		driver.findElement(By.xpath("//a[contains(.,'Log Out')]")).click();
		driver.findElement(By.xpath("//a[@href='hms/doctor/']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("test@demo.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[contains(.,' Appointment History')]")).click();
		driver.findElement(By.xpath("//span[contains(.,'Patients')]")).click();
		driver.findElement(By.xpath("//span[contains(.,'Manage Patient')]")).click();
		WebElement fl = driver.findElement(By.xpath("//td[.='chandu417']"));
		Point loc = fl.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
		driver.findElement(By.xpath("//td[.='chandu417']/following-sibling::td/descendant::i[@class='fa fa-eye']")).click();
		driver.findElement(By.xpath("//button[.='Add Medical History']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='bp']")).sendKeys("90");
		driver.findElement(By.xpath("//input[@name='bs']")).sendKeys("150");
		driver.findElement(By.xpath("//input[@name='weight']")).sendKeys("67");
		driver.findElement(By.xpath("//input[@name='temp']")).sendKeys("40");
		driver.findElement(By.xpath("//textarea[@name='pres']")).sendKeys("Take rest for week and do Exicerse");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Alert  a6=driver.switchTo().alert();
		a6.accept();
		driver.findElement(By.xpath("//i[@class='ti-angle-down']")).click();
		driver.findElement(By.xpath("//a[contains(.,'Log Out')]")).click();
		   
		  
		      
		
	  
	  
	    
	}
}

