package Java_pragramm;

public class Reversethewords {

	public static void main(String[] args) {
		String s=" i am going to my native";
		String[]s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			String st=s1[i];
			for(int j=st.length()-1;j>=0;j--)
			{
				System.out.println(st.charAt(j));
			}
			
		}
		System.out.print(" ");

	}

}
