package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Genericutility.WebdriverUtility;

public class PomUserSignup
{

	        
	@FindBy(xpath="//a[contains(.,'Create an account')]")
	private WebElement create;

	@FindBy(xpath="//input[@name='full_name']")
	private WebElement fullname;

	@FindBy(xpath="//input[@name='address']")
	private WebElement address;

	@FindBy(xpath="//input[@name='city']")
	private WebElement city;

	@FindBy(xpath="//label[@for='rg-male']")
	private WebElement male;

	@FindBy(xpath="//input[@name='email']")
	private WebElement email;

	@FindBy(xpath="//input[@name='password']")
	private WebElement password;

	@FindBy(xpath="//input[@name='password_again']")
	private WebElement passwordagain;
	
	@FindBy(xpath="//label[@for='agree']")
	private WebElement agree;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement sumbit;
	
	public PomUserSignup(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void ucreate()
	{
		create.click();
	}
	public void ufullname(String mahesh)
	{
		fullname.sendKeys(mahesh);
	}
	public void uaddress()
	{
		address.sendKeys("mysore road chruch street Mangalore");
	}
	public void city(String managlore)
	{
		city.sendKeys(managlore);
		
	}
	public void umale()
	{
		male.click();
	}
	public void uemail(String mahes)
	{
		email.sendKeys(mahes);
	}
	public void upassword()
	{
		password.sendKeys("Mahesh@12");
	}
	public void upasswordagain()
	{
		
		passwordagain.sendKeys("Mahesh@12");
	}
	public void uagree()
	{
		agree.click();
	}
	public void usumbit()
	{
		sumbit.click();
	}
	
	


}
