package Pattern_Java;

public class Pattern_Number5 
{
	public static void main(String[] args) {
//	
//		1
//		22
//		111
//		2222
//		11111

		
	
	for(int i=1;i<=5;i++)
	{
		
		for(int j=1;j<=i;j++)
			if(i%2==0)
		{
			System.out.print("2");
		}else
		{
			System.out.print("1");
		}
		
	
	System.out.println("");
	}	
}

}


