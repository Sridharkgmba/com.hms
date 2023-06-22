package Java_pragramm;

public class CountofVowel 
{
	public static void main(String[] args)
	{
		String s="Engineer";
		String str=	s.toLowerCase();
		char[] ch = str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)

		{

			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' ||ch[i]=='0' || ch[i]=='u')
			{
				count++;

				System.out.println(ch[i]);

			}

		}	
		System.out.println("="+count);
	}
}
