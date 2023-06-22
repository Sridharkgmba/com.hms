package Java_pragramm;

public class Multipl_First3no_WOBubbleshort 
{
	public static void main(String[] args)
	{
		int []a= {5,1,2,6,7,8};
		int fl=a[0];
		int sl=a[0];
		int tl=a[0];
		for( int i=0;i<a.length;i++)
		{
			if(a[i]<fl)
			{
				tl=sl;
				sl=fl;
				fl=a[i]; 	
			}
			else if(a[i]<sl)
			{
				tl=sl;
				sl=a[i];
			}
			else if(a[i]<tl)
			{

				tl=a[i];
			}
		}
		 System.out.println("first min "+ fl);
		 System.out.println("secon min "+sl);
		 System.out.println("thrid min "+tl);
		 
		 
		 int sum=fl*sl*tl;
		 
		 System.out.println("first 3no sum " +sum);
		 
	}
}



