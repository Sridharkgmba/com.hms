package Java_pragramm;

import java.util.LinkedHashSet;

public class CountVowel_W_0_Duplicate 
{
	public static void main(String[] args) {
		
		String s="Engineer";
		String str=	s.toLowerCase();
		char[] ch = str.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<ch.length;i++)

		{
			set.add(ch[i]);
		}
		int count=0;
		for(Character chs:set)

			if(chs=='a' || chs=='e' || chs=='i' ||chs=='0' || chs=='u')
			{
				count++;

				System.out.println(chs);

			}
		if(count>1)
	
	     System.out.println(count);
	}
}
