package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Genericutility.FileUtility;
import com.Genericutility.Ipathconstant;
import com.Genericutility.JavaUtility;
import com.Genericutility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExecuteDoctorlogin 
{
	public static void main(String[] args) throws Throwable 
	{
		WebdriverUtility wdu = new WebdriverUtility();
		JavaUtility ju = new JavaUtility();
		int ran = ju.Random();
		String con="898"+ran+2+ran;
		FileUtility fu = new FileUtility();
		String user = fu.readdataproperty("Dusername");
		String pass = fu.readdataproperty("Dpassword");

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(Ipathconstant.Hmsurl);
		wdu.maximizewindow(driver);
		wdu.waitpagelod(driver);
		driver.findElement(By.xpath("//a[@href='hms/doctor/']")).click();
		
		 PomDoctorLogin p = new PomDoctorLogin(driver);
		 p.Duser(user);
		 p.Dpass(pass);
		 p.login();
		 p.logout();
		 
		 PomDoctorAddPatient pd = new PomDoctorAddPatient(driver);
		 pd.patients();
		 pd.Addpatient();
		 pd.pname("nitesh"+""+ran);
		 pd.pcontactno(con);
		
		 pd.pemailid("niteshs"+""+ran+"@gmail.com");
		 pd.clickmale();
		 pd.paddresss();
		 pd.pAge();
		 pd.pmedical();
		 pd.psumnit();
		 System.out.println("nitesh"+""+ran);
		 System.out.println("niteshs"+""+ran+"@gmail.com");
		 System.out.println(con);
		 
		 
		
		
	}
		
}
