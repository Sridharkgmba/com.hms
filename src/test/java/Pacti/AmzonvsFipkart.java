package Pacti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Genericutility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmzonvsFipkart 
{
public static void main(String[] args) {
		
		WebdriverUtility wb = new WebdriverUtility();
		WebDriverManager.chromedriver().setup();
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("realme narzo N53 (Feather Gold, 4GB+64GB");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement ele = driver.findElement(By.xpath("//span[.='realme narzo N53 (Feather Gold, 4GB+64GB) 33W Segment Fastest Charging | Slimmest Phone in Segment | 90 Hz Smooth Display']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[@class='a-price-whole']"));

		System.out.println(ele);

        		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("realme narzo N53 (Feather Gold, 4GB+64GB");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		WebElement ele2 = driver.findElement(By.xpath("//div[.='realme Narzo N53 (Feather Gold, 64 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		wb.scrollaction(driver, ele2);
		System.out.println(ele2);
		if(ele==ele2)
		{
			System.out.println(ele);
		}else
		{
			System.out.println(ele2);
		}

	}
}
 


