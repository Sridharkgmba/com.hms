package Java_pragramm;

import org.testng.annotations.Test;

public class ReverseStringsothers
{
	@Test()    
	public void test()
	{
		String s="software";
		  char[] rev=s.toCharArray();
		  for(int i=rev.length-1;i>=0;i--)
		  {
			  System.out.print(rev[i]);
		  }
	}

@Test

public void test1() // using variable count
{
	String s="software";
	   char[] rev=s.toCharArray();
	   int count=0;
	   for( char c:rev)
	   {
		   count++;
	   }
	   for(int i=count-1;i>=0;i--)
	   {
		   System.out.print(rev[i]);
		   
	   }
	
}

@Test
public void test2()
{
	   StringBuffer s = new StringBuffer("software");
	   System.out.println(s.reverse());
}	   
	   
	   
}
