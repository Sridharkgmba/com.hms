package AutomationExcerise;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Genericutility.JavaUtility;
import com.Genericutility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase16 
{
	@Test

	public void test16() throws Throwable
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
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("sridharkg19"+j+"@gmail.com");
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
   
		WebElement ele4 = driver.findElement(By.xpath("//b[.='Account Created!']"));

		SoftAssert a1 = new SoftAssert();
		a1.assertEquals(ele4,"Account Created!']");
       driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
     //  driver.findElement(By.xpath("//span[.='Close']")).click();
		WebElement ele5 = driver.findElement(By.xpath("//a[@href='/product_details/1']"));
		    wu.scrollaction(driver, ele5);
		driver.findElement(By.xpath("//button[@class='btn btn-default cart']")).click();
		driver.findElement(By.xpath("//u[.='View Cart']")).click();
		System.out.println(driver.findElement(By.xpath("//a[.='Stylish Dress']")));
		driver.findElement(By.xpath("//a[.='Proceed To Checkout']")).click();
		driver.findElement(By.xpath("//a[.='Place Order']")).click();
		driver.findElement(By.name("name_on_card")).sendKeys("sridharkgg");
		driver.findElement(By.name("card-number")).sendKeys("986666616661");
		driver.findElement(By.name("cvc")).sendKeys("123");
		driver.findElement(By.name("expiry_month")).sendKeys("06");
		driver.findElement(By.name("expiry-year")).sendKeys("2024");
		driver.findElement(By.xpath("Pay and Confirm Order")).click();
		

		 
		 
		 
		 
		 
		   


		 
		 
		 
		 
		 
	}
}
