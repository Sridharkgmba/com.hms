package Pacti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Genericutility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spiecejet 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		            WebdriverUtility wu = new WebdriverUtility();
		driver.navigate().to("https://www.spicejet.com/");
		     wu.maximizewindow(driver);
		       
		          wu.notification();
	     
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']")).sendKeys("mumbai");
		driver.findElement(By.xpath("//input[@id='BE_flight_arrival_city']")).sendKeys("bangalore");

//	        Date cd = new Date();
//	        String[] s = cd.toString().split(" ");
//	        String day = s[0];
//	        String month = s[1];
//	        String date = s[2];
//	        String year = s[5];
//	        
//	       String bd = day+""+month+""+date+""+year;
	        driver.findElement(By.xpath("//div[.='Departure Date']")).click();
	        driver.findElement(By.xpath("//div[.='Sun, 9 Apr 2023']/..//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();
	       
	        String rday = "Thu";
	        String rmonth = "04";
	        String rdate = "05";
	        String ryear = "2023";
	         String rd = rday+""+rmonth+""+rdate+""+ryear;
	         driver.findElement(By.xpath("//div[.='"+rd+"']")).click();
	}
}
