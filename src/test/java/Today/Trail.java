package Today;


import java.util.Map;
import java.util.Map.Entry;

public class Trail
{
	public static void main(String[] args) 
	{
		String s="ssridharkg";
		int count=0;
		char [] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='a' && ch[i]!='e' && ch[i]!='i' && ch[i]!='o' && ch[i]!='u')
			{
				count++;
				System.out.println(ch[i]);
			}
				
		}
		System.out.println("="+count);
	}

}