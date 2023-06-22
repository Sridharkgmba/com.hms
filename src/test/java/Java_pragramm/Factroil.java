package Java_pragramm;

public class Factroil 
{
	public static void main(String[] args) {
		int no=145;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			int fact=1;

			for(int i=rem;i>=1;i--)
			{
				fact=fact*i;
				sum=sum+fact;
				{
					no=no/10;
				}
			}
			System.out.println(fact);
		}
	}
}
