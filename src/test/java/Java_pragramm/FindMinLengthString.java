package Java_pragramm;

public class FindMinLengthString 
{

	public static void main(String[] args) 
	{

		String []s= {"abc","abcdd","abcd","ab","bc"};
		String min_length=s[0];
		for( int i=0;i<s.length;i++)  // i=3 compare each word 
		{
			if(min_length.length()>s[i].length())
			{
				min_length=s[i];	
			}	 
		}
		System.out.println(min_length); // to print ab if bc not thier 
		
		for( int i=0;i<s.length;i++)  // i=3 compare each word 
		{
			if(min_length.length()==s[i].length())
			{
				System.out.println(s[i]+"");   // to print ab bc
			}

		}
	}
}
