package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomDoctorLogin 
{
	@FindBy(xpath="//input[@name='username']")
	private WebElement Dusernames;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Dpasswords;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement sumbit;
	
	@FindBy(xpath="//i[@class='ti-angle-down']")
	private WebElement logout;
	
	@FindBy(xpath="//a[contains(.,'Log Out')]")
	private WebElement clicklogout;
	
	public PomDoctorLogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Duser(String Dusername)
	{
		Dusernames.sendKeys(Dusername);
	}
	public void Dpass(String Dpassword)
	{
		Dpasswords.sendKeys(Dpassword);	
	}
	public void login()
	{
		sumbit.click();
	}
	public void logout() 
	{
		logout.click();
		
	}
	public void Alogout()
	{
		clicklogout.click();
	}
	

}
