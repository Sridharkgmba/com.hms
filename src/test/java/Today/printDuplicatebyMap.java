 package Today;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class printDuplicatebyMap 
{
	public static void main(String[] args) 
	{
		String str="sridhar sridhar i am i";
		String [] s=str.split(" ");
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		for(int i=0;i<s.length;i++)
		{

			if(map.containsKey(s[i]))
			{
				int count=map.get(s[i])+1;
				map.put(s[i],count);
			}else
			{
				map.put(s[i],1);
			}
		}	
		

		for(Map.Entry<String,Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey());
			}
		}
		}


	}


