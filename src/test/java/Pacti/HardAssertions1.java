package Pacti;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class HardAssertions1
{
	@Test
	public void test()
	{
		System.out.println("--test_01__");
		System.out.println("--test_02__");
		assertEquals("test","exuted");
		System.out.println("--test_04__");
		System.out.println("--test_05__");
	}
	@Test
	public void test1()
	{
		int a=10;
	  System.out.println("--test_06__");
	   assertEquals(66, a);
	}
	

}
