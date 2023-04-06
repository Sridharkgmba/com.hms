package Pacti;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsse
{
	public class HardAssertions1
	{
		@Test
		public void test()
		{
			System.out.println("--test_01__");
			System.out.println("--test_02__");
			   SoftAssert sa = new SoftAssert();
			    sa.assertEquals("TY","TY1");
			System.out.println("--test_04__");
			System.out.println("--test_05__");
			sa.assertAll();
		}
		@Test
		public void test1()
		{
			int a=10;
		  System.out.println("--test_06__");
		   assertEquals(66, a);
		}
		

	}
}
