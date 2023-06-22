package Today;

import java.util.HashMap;

public class Duplicate_Map
{
	public static void main(String[] args) {
		int []a= {10,5,10,5,7,8,7};
		HashMap  map=new HashMap();


		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==15)
				{
					if(map.containsKey(a[i])==false)
					{
						if(map.containsValue(a[i])==false)
						{
							map.put(a[i], a[j]);
						}
					}
				}	
			}
		}
		System.err.println(map);
	}
}
