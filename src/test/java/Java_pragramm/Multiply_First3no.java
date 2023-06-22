package Java_pragramm;

public class Multiply_First3no
{
	public static void main(String[] args)
	{
		int []a= {5,4,0,1,3};
		for( int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i] =  a[j];
					a[j]=temp;
				}	
			}
		}
			int mult=1;
			for(int i1=0;i1<3;i1++)
			{
				mult=mult*a[i1];
			}
			System.out.println(mult);

		}

	}



