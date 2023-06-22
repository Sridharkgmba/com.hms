package Java_pragramm;

public class First_3max_W0Bubbleshort
{
	public static void main(String[] args)
	{
		int []a= {5,4,0,1,3};
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
		 
		 
	}

}
