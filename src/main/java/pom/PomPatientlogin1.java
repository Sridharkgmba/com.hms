package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Genericutility.Ipathconstant;

public class PomPatientlogin1
{
	@FindBy(name="username")
	private WebElement users;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(name="submit")
	private WebElement login;

	public PomPatientlogin1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getUsers() 
	{
		return users;
	}

	public WebElement getPass() 
	{
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	public void log(String user,String password)
	{
		users.sendKeys(user);
		pass.sendKeys(password);
		login.click();
		
		
	}
	

}
