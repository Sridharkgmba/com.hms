package Pacti;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Genericutility.Baseclass;

public class TestNg1_Script  extends Baseclass
{
	@Test
	public void Creat()
	{
		Reporter.log("...data creted...",true);
	}
	@Test
	public void Edit()
	{
		Reporter.log("...data editable...",true);
	}
	@Test
	public void Delete()
	{
		Reporter.log("...data deletebaled",true);
	}
	

}
