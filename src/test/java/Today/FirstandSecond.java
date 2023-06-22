package Today;

public class FirstandSecond 
{
	public static void main(String[] args)
	{
		int []a= {5,4,0,1,3,0,1};
		int fl=a[0];
		int sl=a[0];
		for( int i=0;i<a.length;i++)
		{
			if(a[i]<fl)
			{
				if(a[i]<fl)
				{
					sl=fl;
				}
				fl=a[i];
			}
			else if(fl==sl || sl>a[i])
			{
				sl=a[i];
			}
		}
		System.out.println(fl);
		System.out.println(sl);
	}
}
