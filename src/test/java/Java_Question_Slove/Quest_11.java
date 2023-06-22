package Java_Question_Slove;

public class Quest_11
{
	public static void main(String[] args) 
	{
		String a="i love programming";
		String []a1=a.split(" ");

		for( int i=0;i<a1.length;i++)
		{
			
			 String s2=a1[i];
			String rev="";
			for(int j=s2.length()-1;j>=0;j--)
			{

				rev=rev+s2.charAt(j);
			}
			
			
				System.out.println(rev);
		
			}
			}
		}


