package Pacti;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.internal.ITestInvoker.FailureContext;

import com.Genericutility.Baseclass;
   
public class Ts_02  
{
	@Test
	public void script3()
	{
		System.out.println("----testscript03----");
		throw new SkipException("no");
		
	}
	
	@Test
	
	public void script4()
	
	{
		
		System.out.println("no idea");
		
		
	}
}
	


