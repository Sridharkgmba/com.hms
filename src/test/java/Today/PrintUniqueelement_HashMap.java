package Today;

import java.util.HashMap;
import java.util.Map;

public class PrintUniqueelement_HashMap
{
	public static void main(String[] args) {
	
	
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
		        if(entry.getValue()==1)
		        {
		        	System.out.println(entry.getKey());
		        }
			}
		
			}
}
	
	
	
	
	
	
//	
//	
//	Set<Entry<String, Integer>> lset = map.entrySet();
//	for (Entry<String, Integer> entry : lset) 
//		if(entry.getValue()==1)
//		{
//			System.out.println(entry.getKey());	
//		}
//	}
//}
//
////output=am

