package Today;

import Java_pragramm.Trail;

public class Metod_Rev 
{
	public String revstring(String s)
	{
		if(s==null || s.length()<=1)
		{
			return s;
		}
		return revstring(s.substring(1))+s.charAt(0);
	}	
	
	
	public static void main(String[] args) 
	{
		String s="TestYantra";
		
		    Metod_Rev t = new Metod_Rev();
	System.out.println(t.revstring(s));
			
}
}


