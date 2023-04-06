package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Genericutility.WebdriverUtility;

public class PomPatientAppintment 
{
	WebdriverUtility wdu= new WebdriverUtility();
	
	@FindBy(xpath="//div[@class='item-inner']/span[contains(.,'Book Appointment')]")
	private WebElement Appointmen; 
                                         
	@FindBy(xpath="//select[@name='Doctorspecialization']")
	private  WebElement Doctorspec;

	@FindBy(xpath="//select[@name='doctor']")
	private  WebElement Doctor;
	
	@FindBy(name="appdate")
	private WebElement Date;
	
	@FindBy(xpath="//td[.='20']")
	private WebElement time;
	
	@FindBy(id="timepicker1")
	private WebElement timepic;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement plogout;
	
	public PomPatientAppintment(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Appointment()
	{
		Appointmen.click();
	
	}
	public void Dspeclization()
	{
		 wdu.select(Doctorspec, "Gynecologist/Obstetrician1");
	
	}
	public void Doctor()
	{
		wdu.select(Doctor,"vs");
	}
	public void Date()
	{
		Date.click();
	}
	public void Time() 
	{
		time.click();
		
	}
	public void Timepic()
	{
		timepic.click();
	}
	public void logout()
	{
		plogout.click();
	}  
}
	


