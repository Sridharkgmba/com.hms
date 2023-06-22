package Java_pragramm;

public class Swap1stand_lastwords 
{
	public static void main(String[] args) {
		
	
	String s="i am going to my native";
	String[]st=s.split(" ");
	//st[0]=I st[1]=am st[3]=going  ...
	 String temp=st[0];
	st[0]=st[st.length-1];
    st[st.length-1]=temp;
    for(int i=0;i<st.length;i++)
    {
    	System.out.print(st[i]+" ");
    }

}
}
