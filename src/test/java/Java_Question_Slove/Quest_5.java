package Java_Question_Slove;

public class Quest_5 
{
	public static void main(String[] args) {


		for(int j=0;j<100;j++)
		{
			int no=j;
			int count=0;
			for(int i=1;i<=no;i++)
			{
				if(no%i==0)
					count++;
			}
					if(count==2)
					{
						System.out.println(no+"prime no");
					}
				}
			}
		
	
}
