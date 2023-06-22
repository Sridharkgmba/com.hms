package Pacti;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.Genericutility.Baseclass;

public class Ts_03  
{
	@Test(groups = {"reression"})
	public void script5()
	{
		System.out.println("----testscript05----");
		throw new SkipException("no");
	}
	@Test(groups = {"reression"})
	public void script6()
	{
		System.out.println("----testscript06----");
		
	}

}


