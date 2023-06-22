package Pacti;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Img 
{
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.1mg.com/");
	ChromeOptions cp = new ChromeOptions();
	cp.addArguments("---disabled notification---");
	driver.manage().timeouts().implicitlyWait(20 ,TimeUnit.SECONDS);
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='style__banner-close-button___2QheJ']"))).click();
	Actions a =new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//a[@class='button-text t-service-labs web-left-nav']/div[.='Lab Tests']"))).click().build().perform();
	driver.switchTo().frame(driver.findElement(By.id("google_esf']")));
	driver.findElement(By.xpath("//div[@class='UpdateCityModal__cancel-btn___2jWwS UpdateCityModal__btn___oMW5n']")).click();
	driver.findElement(By.xpath("//span[@class='style__closeOld___3PoPd']")).click(); // need help
	WebElement ele = driver.findElement(By.xpath("//h3[.='Comprehensive Gold Full Body Checkup']"));
	Point loc = ele.getLocation();
	int x = loc.getX();
	int y = loc.getY();
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy("+x+","+y+")");
	driver.findElement(By.xpath("//button[.='ADD TO CART']")).click();

	}
}
