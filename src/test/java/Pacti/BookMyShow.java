package Pacti;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow 
{
	public static void main(String[] args) throws Throwable {


		ChromeOptions OP = new ChromeOptions();
		OP.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(OP);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Rudhran']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='sc-qswwm9-8 jayiEd']//span[.='Book tickets']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='date-details  slick-slide']/descendant::div[contains(.,'16')]")).click();
		driver.findElement(By.xpath("//a[.='Venkateshwara Cinemas 2K, A/C Screen2: Gollarahati']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Venkateshwara Cinemas 2K, A/C Screen2: Gollarahati']/ancestor::div[@class='details']|div[@class='body showtimes-details-container ']/descendant::div[contains(.,'04:30 PM')]")).click();
		Thread.sleep(2000);



	}
}


