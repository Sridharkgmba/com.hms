package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Genericutility.FileUtility;

public class PomFacebook 
{
	
	@FindBy(name="email")
	private WebElement user;
	
	@FindBy(name="pass")
	private WebElement passw;
	
	@FindBy(name="login")
	private WebElement log;
	
	public PomFacebook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void user_pass(String fusern,String fpass)
	{
		user.sendKeys(fusern);
		passw.sendKeys(fpass);
	}
	public void login()
	{
		log.click();
	}

}
