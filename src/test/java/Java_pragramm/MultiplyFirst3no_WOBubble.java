package Java_pragramm;

public class MultiplyFirst3no_WOBubble 
{
	public static void main(String[] args)
	{
	
		int []a= {5,0,2,6,7,8};
		int fl=0;
		int sl=0;
		int tl=0;
		for( int i=0;i<a.length;i++)
		{
			if(a[i]>fl)
			{
				tl=sl;
				sl=fl;
				fl=a[i]; 	
			}
			else if(a[i]>sl)
			{
				tl=sl;
				sl=a[i];
			}
			else if(a[i]>tl)
			{

				tl=a[i];
			}
		}
		 System.out.println("first largest "+ fl);
		 System.out.println("secon largest "+sl);
		 System.out.println("thrid largest "+tl);
		 
		 int sum=fl*sl*tl;
		 
		 System.out.println("first 3no sum " +sum);
		 
	}
}
