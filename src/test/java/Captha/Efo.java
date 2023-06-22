package Captha;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.Tesseract;

public class Efo 
{
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--handled--");
		driver.get("https://unifiedportal-mem.epfindia.gov.in/memberinterface/");
		driver.findElement(By.id("userName")).sendKeys("101");
		driver.findElement(By.id("password")).sendKeys("Sridhar@2021");
		Thread.sleep(2000);
	   try {
		WebElement ele = driver.findElement(By.xpath("//*[@id='captchaDiv']/descendant::img[1]"));
		File src = ele.getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\Lenovo\\Desktop\\Sridhar\\com.hms\\screenshot\\cap1.png";
		FileHandler.copy(src, new File(path));
		Tesseract img = new Tesseract();
		String cap = img.doOCR(new File(path));
		System.out.println(cap);
	   }
	   catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}
}
