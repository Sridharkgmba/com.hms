package Java_pragramm;

public class RemovetheDuplicateWordsStin {

	public static void main(String[] args) 
	{
		String st="i is is am i am software Enigineering i am";
		String[]s=st.split(" ");
		

		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
				{
					s[j]="yes";
				}
			}
		}
		
	
		for(int k=0;k<s.length;k++)
		{
			if(s[k]!="yes")
			{
			 
				System.out.print(s[k]+" ");
			}

		}
	
	}

}
