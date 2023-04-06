package Pacti;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Icc 
{
	public static void main(String[] args) 
	{
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		List<WebElement> ele = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		  ArrayList<String>a=new ArrayList<String>();
		  for(int i=0;i<ele.size();i++)
		  {
			a.add(ele.get(i).getText());  
		  }
		  for(WebElement o:ele)
		  {
			  String rating="//span[.='"+o+"']/../following-sbiling::td[3]";
			  String Rating=driver.findElement(By.xpath(rating)).getText();
			  System.out.println("ele->"+o+"->(rating is)->"+Rating);
		  }
		  
}
}
