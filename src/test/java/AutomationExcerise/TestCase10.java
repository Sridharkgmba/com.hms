package AutomationExcerise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Genericutility.JavaUtility;
import com.Genericutility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase10
{
	@Test
	public void test10()
	{
		WebdriverUtility wu = new WebdriverUtility();
		JavaUtility ju = new JavaUtility();
		int j = ju.Random();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://automationexercise.com/");
		wu.maximizewindow(driver);
		wu.waitpagelod(driver);
		WebElement ele = driver.findElement(By.xpath("//h2[.='Subscription']"));
		wu.scrollaction(driver, ele);
		driver.findElement(By.id("susbscribe_email")).sendKeys("sridharkg1990@gmail.com");
		driver.findElement(By.id("subscribe")).click();
		
	}

}
