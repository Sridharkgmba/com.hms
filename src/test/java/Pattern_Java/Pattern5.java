package Pattern_Java;

public class Pattern5
{
	public static void main(String[] args)
	{
       
		int space=3;
		int star=1;
		for(int i=1;i<=4;i++)
		{
			
		char a='A';
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(a);
				a++;
			}
			space=space-1;
			star=star+2;
			System.out.println();
		}
		int space1=5;
		int star1=0;
		for(int i=1;i<=4;i++)
		{
			
		char a='A';
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star1;k++)
			{
				System.out.print(a);
				a++;
			}
			space=space+1;
			star=star-2;
			System.out.println();
		}
	}
}
