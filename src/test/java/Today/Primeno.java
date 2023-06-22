package Today;

public class Primeno
{
	public static void main(String[] args)
	{
		int []a= {1,5,7,8,9};
		for(int i=0;i<a.length;i++)
		{
			int count=0;

			if(a[i]>1)
			{
				for(int j=1;j<=a[i];j++)
				{
					if(a[i]%j==0)

						count++;
				}
			}
			if(count==2)
			{
				System.out.println(a[i]+" ");
			}

		}
	}
}


