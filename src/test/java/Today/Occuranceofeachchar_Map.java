package Today;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Occuranceofeachchar_Map 
{
	public static void main(String[] args)
	{

		String st="Testyantra";

		char ch[]=st.toCharArray();

		LinkedHashMap<Character,Integer> map=new LinkedHashMap< Character,Integer>();
		for(int i=0;i<ch.length;i++)
		{
			map.put(ch[i],i);
		}
		for(Entry<Character, Integer> s:map.entrySet()) 
		{
			int ct=0;
			for(int i=0;i<ch.length;i++) 
			{
				if(s.getKey()==ch[i])
					ct++;

			}
			//System.out.println(s.getKey()+" ="+ct);
			System.out.print(s.getKey());
			System.out.println(ct);
		}
	}
	         


}
