package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Genericutility.Ipathconstant;
import com.Genericutility.JavaUtility;
import com.Genericutility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExecuteQuery 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver	  =new ChromeDriver();
		JavaUtility ju = new JavaUtility();
		driver.get(Ipathconstant.Hmsurl);
		WebdriverUtility wu = new  WebdriverUtility();
		wu.waitpagelod(driver);
		int ran = ju.Random();
		String con="9945616"+ran;
		PomQuery p = new PomQuery(driver);
		p.cclicl();
		p.fullname("Ugaram"+""+ran);
		p.emailid("Ugaram"+""+ran+"@gmail.com");
		p.mobilno(con);
		p.desc();
		p.sumbit();
		wu.acceptalert(driver);
		System.out.println("Ugaram"+""+ran);
		System.out.println("Ugaram"+""+ran+"@gmail.com");
		System.out.println("9945616"+ran);
	

	}

}
