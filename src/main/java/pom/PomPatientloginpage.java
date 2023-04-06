package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Genericutility.FileUtility;
import com.Genericutility.Ipathconstant;

public class PomPatientloginpage 
{

	@FindBy(name="username")
	private WebElement user;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(name="submit")
	private WebElement login;
	
	@FindBy(xpath="//i[@class='ti-angle-down']")
	private WebElement logout;
	
	@FindBy(xpath="//a[contains(.,'Log Out')]")
	private WebElement clicklogout;

	public PomPatientloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
   public  void username_pass(String pun,String ppass )
   {
	   user.sendKeys(pun);
	   pass.sendKeys(ppass);
   }
  
   public  void login()
   {
	   login.click();
   }
	public void logout()
	{
		logout.click();
	}
	
	public void Plogout()
	{
		clicklogout.click();
	}
}

