package General;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Genericutility.DatabaseUtility;
import com.Genericutility.JavaUtility;
import com.Genericutility.WebdriverUtility;
import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericRmgyantraproject 
{
	
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		WebdriverUtility wbu = new WebdriverUtility();
		DatabaseUtility dbu = new DatabaseUtility();
		      JavaUtility jbu = new JavaUtility();
		wbu.maximizewindow(driver);
		wbu.waitpagelod(driver);
		driver.get("http://rmgtestingserver:8084/");
		driver.findElement(By.name("username")).sendKeys("rmgyantra");
		driver.findElement(By.name("password")).sendKeys("rmgy@9999");	 		
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		driver.findElement(By.xpath("//a[.='Projects']")).click();
		driver.findElement(By.xpath("//i[@class='material-icons']")).click();
		
		int ran = jbu.Random();

		driver.findElement(By.name("projectName")).sendKeys("myprojects"+ran);
		driver.findElement(By.name("createdBy")).sendKeys("sridhar");
		WebElement ele = driver.findElement(By.xpath("(//select[@name='status'])[2]"));
		wbu.select(ele,"Created");
		driver.findElement(By.xpath("//input[@value='Add Project']")).click();

		dbu.getconn();
		dbu.executeq("select * from project;");
	}
}
		
		
	
