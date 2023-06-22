package AutomationExcerise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Genericutility.JavaUtility;
import com.Genericutility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(com.Genericutility.Listnerimplmentclass.class)
public class Testcase6 
{
	@Test
	
	public void test()
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
		 driver.findElement(By.xpath("//i[@class='fa fa-envelope']")).click();
		 driver.findElement(By.xpath("//input[@data-qa='name']")).sendKeys("sridharkg");
		 driver.findElement(By.xpath("//input[@data-qa='email']")).sendKeys("sridharkg"+j+"@gmail.com");
		 driver.findElement(By.xpath("//input[@data-qa='subject']")).sendKeys("i am looking for t shirts");
		 driver.findElement(By.id("message")).sendKeys("around 2000 can i but");
		 driver.findElement(By.name("upload_file")).sendKeys("C:\\Users\\Lenovo\\Desktop\\Sridhar_Cv.pdf");
		
		 driver.findElement(By.xpath("//input[@data-qa='submit-button']")).click();
		 wu.acceptalert(driver);
		 driver.close();
		
	
		
	}

}
