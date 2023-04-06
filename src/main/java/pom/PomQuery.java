package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomQuery 
{
	@FindBy(xpath="//div[@class='header']/descendant::a[.='contact']")
	private WebElement contact;
	
	@FindBy(xpath="//input[@name='fullname']")
	private WebElement fullname;
	
	@FindBy(xpath="//input[@name='emailid']")
	private WebElement emailid;
	
	@FindBy(xpath="//input[@name='mobileno']")
	private WebElement mobileno;
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement desc;
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement sumbit;
	
	public PomQuery(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void cclicl()
	{
		contact.click();
	}
	public void fullname(String Ugaram)
	{
		fullname.sendKeys(Ugaram);
	}
	public void emailid(String Ugaram)
	{
		emailid.sendKeys(Ugaram);
	}
	public void mobilno(String con)
	{
		 mobileno.sendKeys(con);
	}
	public void desc()
	{
		 desc.sendKeys("i am gettting headache  at every day in the early morning is their any soloution" );
	}
	public void sumbit()
	{
		sumbit.click();
	}


}
