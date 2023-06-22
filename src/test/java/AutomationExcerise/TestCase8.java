package AutomationExcerise;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Genericutility.JavaUtility;
import com.Genericutility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase8
{
	@Test
	public void test8()
	{
		WebdriverUtility wu = new WebdriverUtility();
		JavaUtility ju = new JavaUtility();
		int j = ju.Random();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://automationexercise.com/");
		wu.maximizewindow(driver);
		wu.waitpagelod(driver);
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		WebElement ele = driver.findElement(By.xpath("//a[@href='/product_details/1']"));
		wu.scrollaction(driver, ele);
		WebElement ele1 = driver.findElement(By.xpath("//h2[.='Blue Top']"));
		System.out.println(ele1);
	}
}
