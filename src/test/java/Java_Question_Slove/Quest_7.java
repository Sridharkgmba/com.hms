package Java_Question_Slove;

import java.util.LinkedHashSet;

public class Quest_7 {

	public static void main(String[] args) 
	{
		String s="Malyalam";
		String st=s.toLowerCase();

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<st.length();i++)

		{
			set.add(st.charAt(i));
		}
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<st.length();i++)
			{
			if(ch==st.charAt(i))
			{
				count++;
			}
		}
			System.out.println(ch+" repeat"+count);

		}
	}

}
