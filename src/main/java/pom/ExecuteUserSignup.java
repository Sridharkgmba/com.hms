package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Genericutility.Ipathconstant;
import com.Genericutility.JavaUtility;
import com.Genericutility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExecuteUserSignup 
{
	public static void main(String[] args) {
		
	
	  WebdriverUtility wu = new WebdriverUtility();
	  JavaUtility ju = new JavaUtility();
	   int ran = ju.Random();
	      WebDriverManager.chromedriver().setup();
	     WebDriver driver =new ChromeDriver();
	     wu.maximizewindow(driver);
	     wu.waitpagelod(driver);
	     driver.get(Ipathconstant.Hmsurl);
	     driver.findElement(By.xpath("//h3[.='Patients']/../descendant::a[.='Click Here']")).click();
	     
	     PomUserSignup p = new PomUserSignup(driver);
	     p.ucreate();
	     p.ufullname("mahesh"+""+ran);
	     p.uaddress();
	     p.city("managlore"+""+ran);
	     p.umale();
	     p.uemail("mahes"+""+ran+"@gmail.com");
	     p.upassword();
	     p.upasswordagain();
	     p.uagree();
	     p.usumbit();
	     wu.acceptalert(driver);
	     System.out.println("mahesh"+""+ran);
	     System.out.println("managlore"+""+ran);
	     System.out.println("mahes"+""+ran+"@gmail.com");

}
}