package AutomationExcerise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Genericutility.JavaUtility;
import com.Genericutility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(com.Genericutility.Listnerimplmentclass.class)
public class TestCase1 
{
	@Test
	
		public void test1()
		{

		WebdriverUtility wu = new WebdriverUtility();
		JavaUtility ju = new JavaUtility();
		int j = ju.Random();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://automationexercise.com/");
		wu.maximizewindow(driver);
		wu.waitpagelod(driver);
		 Assert.assertEquals("https://automationexercise.com/","https://automationexercise.com/");
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.name("name")).sendKeys("sridhar"+j);
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("sridharkg"+j+"@gmail.com");
		driver.findElement(By.xpath("//button[.='Signup']")).click();
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("password")).sendKeys("98331486+j");
		WebElement ele = driver.findElement(By.id("days"));
		wu.select(ele, 19);
		WebElement ele1 = driver.findElement(By.id("months"));
		wu.select(ele1, "February");
		WebElement ele2 = driver.findElement(By.id("years"));
		wu.select1(ele2, "1990");
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.id("first_name")).sendKeys("sri"+j);
		driver.findElement(By.id("last_name")).sendKeys("gowda"+j);
		driver.findElement(By.id("company")).sendKeys("test"+j);
		driver.findElement(By.id("address1")).sendKeys("address1+j");
		driver.findElement(By.id("address2")).sendKeys("address2"+j);
		WebElement ele3 = driver.findElement(By.id("country"));
		wu.select(ele3,"India");
		driver.findElement(By.name("state")).sendKeys("kara"+j);
		driver.findElement(By.name("city")).sendKeys("banenga"+j);
		driver.findElement(By.name("zipcode")).sendKeys("560091");
		driver.findElement(By.id("mobile_number")).sendKeys("9844413"+j);
		driver.findElement(By.xpath("//button[.='Create Account']")).click();

	}
}
