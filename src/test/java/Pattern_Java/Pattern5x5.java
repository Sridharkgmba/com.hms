package Pattern_Java;

public class Pattern5x5 {

	public static void main(String[] args) {
//		* * * * * *
//		* * * * * *
//		* * * * * *
//		* * * * * *
//		* * * * * *
		for(int i=1;i<=5;i++)
		{
			// 1<=5 enter in next for loop
			for(int j=1;j<=5;j++)
		//		1<5 print        * * * * * *  
			//	2<5 print one star to next
				
			{
				System.out.print("* ");
			}
			System.out.println("");  // next line
		}

	}

}
