package pom;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Genericutility.FileUtility;
import com.Genericutility.Ipathconstant;
import com.Genericutility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcutePomAddDoctor 
{
	public static void main(String[] args) throws Throwable 
	{
		FileUtility fu = new FileUtility();
		String Ausername = fu.readdataproperty("username1");
		String Apass = fu.readdataproperty("password1");
		WebdriverUtility wdu=new WebdriverUtility();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		wdu.maximizewindow(driver);
		wdu.waitpagelod(driver);
		driver.get(Ipathconstant.Hmsurl);
		driver.findElement(By.xpath("//h3[.='Admin Login']/../descendant::a[.='Click Here']")).click();
		
		PomAddDocotor p = new PomAddDocotor(driver);
		p.Ausername(Ausername);
		p.Apassword(Apass);
		p.log();
		p.Doctor();
		p.AddDoct();
		p.Doctspec();
		p.Doctnames();
		p.clinic();
		p.consultfees();
		p.contactno();
		p.DEmailid();
		p.newpass();
		p.confime();
		p.sumbitb();
		wdu.acceptalert(driver);
		
		
		
		
		
		
		 
		
	}

}
