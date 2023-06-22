package Java_pragramm;

public class AppendAtthe_lastno 
{
	public static void main(String[] args)
	{
		int[]a= {4,0,2,0,5,0};   //op 425000

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)	
			{
				if(a[i]==0)

				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;	 
				}
			}
		}

		for( int k=0;k<a.length;k++)
		{
			System.out.print(a[k]);
		}

	}
}

//
//int[]a= {4,0,2,0,5,0};   //op 000425
//
//for(int i=0;i<a.length;i++)
//{
//	for(int j=i+1;j<a.length;j++)	
//	{
//		if(a[i]==0)
//
//		{
//			int temp=a[i];
//			a[i]=a[j];
//			a[j]=temp;	 
//		}
//	}
//}
//
//for( int k=0;k<a.length;k++)
//{
//	System.out.println(a[k]);
//}
//
//}
//}

			
