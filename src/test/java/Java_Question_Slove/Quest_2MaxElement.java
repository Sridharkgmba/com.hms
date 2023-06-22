package Java_Question_Slove;

public class Quest_2MaxElement 
{
	public static void main(String[] args) 
	{
		int[] a= {7,-3,0,2,1,-9};
		int fl=0;
		int sl=0;
		int tl=0;

		for(int i=0;i<a.length;i++)
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
			}else if(a[i]>tl)
			{
				tl=a[i];
			}
		}
		System.out.println(fl);
		System.out.println(sl);
		System.out.println(tl);

	}


}
