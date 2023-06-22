package Today;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Orderoccuranceofmap_Sentence {
	public static void main(String[] args)
	{
		String s="i i am word";
		String[]str=s.split(" ");
		LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();

		for(String word:str)
		{

			if(map.containsKey(word))
			{
				map.put(word,map.get(word)+1);
			}else
			{
				map.put(word,1);
			}

		}
		System.out.print(map);

		for(Entry<String,Integer>s2:map.entrySet())
		{
			System.out.println(s2);
		}


	}

}
