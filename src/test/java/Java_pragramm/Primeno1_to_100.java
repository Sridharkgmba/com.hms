package Java_pragramm;

public class Primeno1_to_100 
{
	public static void main(String[] args) 
	{
	   for(int i=1;i<=100;i++)
	   {
		   int no=i;
		   int count=0;
		   for(int j=1;j<=no;j++)
		   {
			   if(no%j==0)
			   {
				   count++;
			   }
		   }if(count==2)
		   {
			   System.out.println(no+"is prime no");
		   }
	   }
	}
}
	