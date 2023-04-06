package Pacti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Genericutility.Baseclass;
import com.Genericutility.FileUtility;
import com.Genericutility.JavaUtility;
import com.Genericutility.WebdriverUtility;

import pom.PomDoctorLogin;
import pom.PomPatientloginpage;
import pom.PomUserSignup;

public class ExecuteBaseclass extends Baseclass
{
	WebdriverUtility wu = new WebdriverUtility();
	@Test(priority =1)
	public void Patientlogin() throws Throwable
	{
		//patinet login 
		
		FileUtility fu = new FileUtility();
		String puser =fu.readdataproperty("user");
		String ppass= fu.readdataproperty("password");
		PomPatientloginpage p=new PomPatientloginpage(driver);
		driver.findElement(By.xpath("//a[@href='hms/user-login.php']")).click();
		p.username_pass(puser, ppass);
		p.login();
		p.logout();
		p.Plogout();
	}
		
		@Test(priority = 2)
		public void usersignup()
		{
			driver.findElement(By.xpath("//a[@href='hms/user-login.php']")).click();
			JavaUtility ju      =new  JavaUtility();
			 
			int ran = ju.Random();
			PomUserSignup u = new PomUserSignup(driver);
			u.ucreate();
			u.ufullname("mahesh"+""+ran);
			u.uaddress();
			u.city("managlore"+""+ran);
			u.umale();
			u.uemail("mahes"+""+ran);
			u.upassword();
			u.upasswordagain();
			u.uagree();
			u.usumbit();
			wu.acceptalert(driver);
			driver.close();
			
		}
		
		@Test(priority =3)
		public void DoctorLogin() throws Throwable
		{
			driver.get(fu.readdataproperty("curl"));
			driver.findElement(By.xpath("//a[@href='hms/doctor/']")).click();
			Thread.sleep(2000);
		    String Duser = fu.readdataproperty("Dusername");
		    String Dpass = fu.readdataproperty("Dpassword");
		    PomDoctorLogin p1 = new PomDoctorLogin(driver); 
		     p1.Duser(Duser);
		     p1.Dpass(Dpass);
		     p1.login();
		     p1.logout();
		     p1.Alogout();
		     
		     
	}

}
