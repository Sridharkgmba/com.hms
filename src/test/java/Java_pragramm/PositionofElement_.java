package Java_pragramm;

import java.util.LinkedHashSet;

public class PositionofElement_ {

	public static void main(String[] args) 
	{
		String s="kannada";      //O/P //k=1 a=7 d=6 n=4
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)

		{
			set.add(s.charAt(i));
		}for(Character ch:set)
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+"is prsent in "+(i+1));
					break;
				}
			}
		}
	}
}
