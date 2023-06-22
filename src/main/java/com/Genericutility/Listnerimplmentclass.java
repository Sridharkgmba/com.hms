package com.Genericutility;



import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Listnerimplmentclass  implements ITestListener
{
	 ExtentReports report;
	 ExtentTest test;

	
	public void onTestStart(ITestResult result) 
	{
		 String methodName = result.getMethod().getMethodName();
		   test = report.createTest(methodName);
		   Reporter.log(methodName+"----->test script exectted strated");
		
	}

	
	public void onTestSuccess(ITestResult result) 
	{
		  String methodName = result.getMethod().getMethodName();
		   test.log(Status.PASS, methodName+"___>pass");
		   Reporter.log(methodName+"....>test script executed scuscessfully");
		      
		
	}

	
	public void onTestFailure(ITestResult result) 
	{
//		
//		EventFiringWebDriver edriver = new EventFiringWebDriver(Baseclass.edriver);
//		String res=result.getName();
//
//		TakesScreenshot tss	=(TakesScreenshot)Baseclass.edriver;
//		File src = tss.getScreenshotAs(OutputType.FILE);
//		File file = new File("./screenshot/"+res+".jpeg");
//		try {
//			FileUtils.copyFile(file,src);
//		} catch (IOException e) 
//		{
//			
//			
//		}		
//	}
//	        
      try {
		String screenshotname=WebdriverUtility.getScreenShot(Baseclass.edriver,result.getMethod().getMethodName());
		test.addScreenCaptureFromPath(screenshotname);
		
	} catch (Throwable e) {
		
		e.printStackTrace();
	}
      test.log(Status.FAIL, result.getThrowable());
       Reporter.log("ts failed");
      
	}

	public void onTestSkipped(ITestResult result) 
	{
		 String methodName = result.getMethod().getMethodName();
		  test.log(Status.SKIP, methodName+".....skipped");
		  test.log(Status.SKIP, result.getThrowable());
		  Reporter.log("testscript skipped");
		
	}


	public void onStart(ITestContext context)
	{
      
		ExtentSparkReporter htmlreport = new ExtentSparkReporter("./ExtentReporter/report1.html");
		 htmlreport.config().setDocumentTitle("hms");
		 htmlreport.config().setTheme(Theme.DARK);
		 htmlreport.config().setReportName("Hospital Maget");
		  
		  report = new ExtentReports();
		   report.attachReporter(htmlreport);
		   report.setSystemInfo("browser","chrome");
		   report.setSystemInfo("os","windows");
		   report.setSystemInfo("url","http://rmgtestingserver/domain/Hospital_Management_System/");
		   report.setSystemInfo("reportet_name","sridhar");
		   
		
	}

	public void onFinish(ITestContext context) 
	{
		report.flush();
	}

		
	}
    

