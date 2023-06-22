package Java_Question_Slove;

import java.util.LinkedHashSet;

public class Quest_4 
{
	public static void main(String[] args) 
	{

		String st="my name is rishav it contains ri and shav";
		String[]s=st.split("");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for( int i=0;i<s.length;i++)

		{
			set.add(s[i]);
		}
		for(String str:set)
		{
			int count=0;
			for( int i=0;i<s.length;i++)
			{
				if(str.equals(s[i]))
				{
					count++;
				}
			}
			System.out.println(str+" is repeating "+count+" times");
		}
		
	}

}
