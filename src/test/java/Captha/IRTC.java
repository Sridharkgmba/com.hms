package Captha;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.bouncycastle.crypto.tls.AlertDescription;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.Tesseract1;

public class IRTC 
{
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		  
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 ChromeOptions op = new ChromeOptions();
		 op.addArguments("--handled--");
		  
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//a[normalize-space()='LOGIN']")).click();
		WebElement ele = driver.findElement(By.xpath("//*[@id='nlpImgContainer']//following::img)[2]"));
		File srs = ele.getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\Lenovo\\Desktop\\Sridhar\\com.hms\\screenshot\\cap.png";
		org.openqa.selenium.io.FileHandler.copy(srs, new File(path));
		Thread.sleep(2000);
		Tesseract img = new Tesseract();
		String str = img.doOCR(new File(path));
		System.out.println(str);
		String captha=str.split("below")[1].replaceAll("[^a-zA-Z0-9]","");   // remove space and characters
		driver.findElement(By.xpath("//input[@placeholder='Enter Captcha']")).sendKeys(captha);


   
   
   }
   
}
