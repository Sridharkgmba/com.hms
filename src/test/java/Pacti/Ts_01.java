package Pacti;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Genericutility.Baseclass;

public class Ts_01  
{
	@Test(groups = {"reression"})
	public void script1()
	{
		System.out.println("----testscript01----");
		Assert.fail();
		System.out.println("----testscript02 ----");
	}
//	@Test
//	public void script2()
//	{
//		System.out.println("----testscript02----");
//	}

}
