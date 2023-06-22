package Java_Question_Slove;

public class Quest_9 
{
	public static void main(String[] args)
	{
		int []a= {1,2,3,2,8,9,10};
		for( int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]+a[j]==11)
              {
	             System.out.println(a[i]+" "+a[j]);
               }		
			}
		}
	}
}
