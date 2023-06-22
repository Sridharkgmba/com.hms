package Pacti;

public class Stringthe_sentence 
{
	public static void main(String[] args) {
		
	
	String s="i am praksh";
	String rev="",wc="";
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=' ')
		{
			rev=rev+s.charAt(i);
		}else
		{
			wc=rev+" "+wc;
			rev="";
		}
	}
	System.out.println(rev+" "+wc);


}


}
