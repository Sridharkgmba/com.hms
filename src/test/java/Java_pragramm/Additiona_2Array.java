package Java_pragramm;

public class Additiona_2Array
{
	public static void main(String[] args)
	{
		int []a= {4,5,6,7};
		int []b= {1,2,4,7,6};
		
		  int length=b.length;
		  if(b.length>a.length)
		  {
			     length=b.length;
		  }
		  for(int i=0;i<length;i++)
		  {
			  try {
				  System.out.print(a[i]+b[i]+" ");
			  }catch(Exception e)
			  {
				  if(a.length<b.length)
				  {
					  System.out.print(b[i]);
				  }else
				  {
					  System.out.print(a[i]);
				  }
			  }
		  }  
}
}

