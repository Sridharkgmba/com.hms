package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Genericutility.JavaUtility;

public class PomDoctorAddPatient 
{

	@FindBy(xpath="//span[contains(.,'Patients')]")
	private WebElement patients;

	@FindBy(xpath="//span[contains(.,' Add Patient')]")
	private WebElement Addpatient;

	@FindBy(name="patname")
	private WebElement patientname;

	@FindBy(name="patcontact")
	private WebElement contact;

	@FindBy(id="patemail")
	private WebElement emailid;

	@FindBy(xpath="//label[@for='rg-male']")
	private WebElement male;

	@FindBy(name="pataddress")
	private WebElement addresss;

	@FindBy(name="patage")
	private WebElement Age;

	@FindBy(name="medhis")
	private WebElement medicalhis;

	@FindBy(id="submit")
	private WebElement sumnit;

	public PomDoctorAddPatient (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void patients()
	{
		patients.click();

	}
	public void Addpatient()
	{
		Addpatient.click();
	}
	public void pname(String nitesh)
	{
		patientname.sendKeys(nitesh);
	}
	public void pcontactno(String con )
	{
		contact.sendKeys(con);
	}
	public void pemailid(String niteshs)
	{
		emailid.sendKeys(niteshs);
	}
	public void clickmale()
	{
		male.click();
	}
    public void paddresss()
    {
    	addresss.sendKeys("T shartnagat bengalore road udipi");
    }
    public void pAge()
    {
    	Age.sendKeys("77");
    }
    public void pmedical()
    {
    	medicalhis.sendKeys("tata bye bye gaya restin peace");
    }
    public void psumnit()
    {
    	sumnit.click();
    }
    
    
}
