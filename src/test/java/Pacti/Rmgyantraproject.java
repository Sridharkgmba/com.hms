package Pacti;

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

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rmgyantraproject 
{
	public static void main(String[] args) throws SQLException 
	{
		Connection con=null;
		try
		{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://rmgtestingserver:8084/");
		driver.findElement(By.name("username")).sendKeys("rmgyantra");
		driver.findElement(By.name("password")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		driver.findElement(By.xpath("//a[.='Projects']")).click();
		driver.findElement(By.xpath("//i[@class='material-icons']")).click();
		
		driver.findElement(By.name("projectName")).sendKeys("hms4");
		driver.findElement(By.name("createdBy")).sendKeys("sridhar");
		WebElement ele = driver.findElement(By.name("status"));
		   Select se = new Select(ele);
		   se.selectByVisibleText("Created");
		   driver.findElement(By.xpath("//input[@value='Add Project']")).click();
		   
		   Driver driver1    =new Driver();
		   DriverManager.registerDriver(driver1);
		  con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
		   Statement state = con.createStatement();
		   String  res ="select * from project";
		   ResultSet exeq = state.executeQuery(res);
		    boolean flag=true;                                   
		   while(exeq.next())
		   {
			   System.out.println(exeq.getString(4));
			   
		   }
		   if(flag)
		   {
			   System.out.println("data is created");
		   }
		   else
		   {
			   System.out.println("data is not created");
		   }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}
