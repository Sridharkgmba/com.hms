package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Genericutility.WebdriverUtility;

public class PomAddDocotor 
{
	WebdriverUtility wdu	 =new WebdriverUtility();
	
	@FindBy(name="username")   
	private WebElement Auser;
	
	@FindBy(name="password")   
	private WebElement Apass;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Aloign;
	
	@FindBy(xpath="//div[@class='item-inner']/span[contains(.,'Doctors')]")
	private WebElement Doctors; 
	
	@FindBy(xpath="//span[contains(.,' Add Doctor')]")
	private WebElement AddDoct;
	
	@FindBy(xpath="//select[@name='Doctorspecialization']")
	private WebElement DoctSpec;
	
	@FindBy(xpath="//input[@placeholder='Enter Doctor Name']")
    private WebElement Doctname;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Doctor Clinic Address']")
	private WebElement Clini;
	
	@FindBy(xpath="//input[@placeholder='Enter Doctor Consultancy Fees']")
	private WebElement consulfee;
	
	@FindBy(xpath="//input[@placeholder='Enter Doctor Contact no']")
	private WebElement DContactno;
	
	@FindBy(xpath="//input[@placeholder='Enter Doctor Email id']")
	private WebElement Demailid;
	
	@FindBy(xpath="//input[@placeholder='New Password']")
	private WebElement Npass;
	
	@FindBy(xpath="//input[@placeholder='Confirm Password']")
	private WebElement confim;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement sumbit;
	
	public PomAddDocotor(WebDriver driver)
	{
	  PageFactory.initElements(driver,this);	
	}
	
	public void Ausername(String username1 )
	{
		Auser.sendKeys(username1);
	}
	public void Apassword(String password1)
	{
		Apass.sendKeys(password1);
	}
	public void log()
	{
		Aloign.click();
	}
	public void Doctor()
	{
		Doctors.click();
	}
	public void AddDoct()
	{
		AddDoct.click();
	}
	public void Doctspec()
	{
		wdu.select(DoctSpec, "Dentist");
	}
	public void Doctnames()
	{
		Doctname.sendKeys("sunilroa");
		
	}
	public void clinic()
	{
		Clini.sendKeys("#123 suraynagar T cheenai");
	}
	public void consultfees()
	{
		consulfee.sendKeys("4999");
   }
	public void contactno()
	{
		DContactno.sendKeys("8989765472");
	}
	public void DEmailid()
	{
		Demailid.sendKeys("sunil23@gmail.com");
	}
	public void newpass()
	{
		Npass.sendKeys("909998");
	}
	public void confime()
	{
		confim.sendKeys("909998");
	}
	public void sumbitb()
	{
		sumbit.click();
	}
}
