package Pacti;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest
{
	@BeforeSuite
	public void connectto_DB()
	{
		System.out.println("---connect to DB---");
	}
	@BeforeTest
	public void openbrowser()
	{
		System.out.println("---prallel---");
	}
	@BeforeClass
	public void Broswerlunch()
	{
		System.out.println("---browser luch----");
	}
	@BeforeMethod
	public void loginto_App()
	{
		System.out.println("---logintApp---");
	}
	@Test
	public void Execute()
	{
		System.out.println("---Execute---");
	}
	
	@AfterMethod
	public void CloseE()
	{
		System.out.println("---Logout App---");
	}
	@AfterClass
	public void close_Browser()
	{
		System.out.println("---close browswer--");
	}
	
	@AfterSuite
	public void DiscconecttoDb()
	{
		System.out.println("---Disconnect to Db");
	}
	
	

}
