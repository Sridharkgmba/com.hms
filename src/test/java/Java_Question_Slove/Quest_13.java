package Java_Question_Slove;

public class Quest_13 {

	public static void main(String[] args) 
	{
		int []a= {7,2,12,15};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]+a[j]==9)
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}

	}

}
