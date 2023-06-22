package Java_pragramm;

public class FindMaxLength_String 
{
	public static void main(String[] args) 
	{

		String []s= {"abc","abcdd","abcd","ab","bcded"};
		String max_length=s[0];
		for( int i=0;i<s.length;i++)  // i=3 compare each word 
		{
			if(max_length.length()<s[i].length())
			{
				max_length=s[i];	
			}
		}
		System.out.println(max_length); //// to print abcdd if bcded not thier 

		for( int i=0;i<s.length;i++)
		{
			if(max_length.length()==s[i].length())
			{
				System.out.println(s[i]);
			}
		}
	}
}



