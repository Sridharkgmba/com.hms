package Java_pragramm;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args) 
	{
		
String st="race";
String st1="care";
if(st.length()==st1.length())
{
	char[] ch=st.toCharArray();
	char[] ch1=st1.toCharArray();

Arrays.sort(ch);
Arrays.sort(ch1);
boolean result = Arrays.equals(ch,ch1);
if(result)
{
	System.out.println(st+" "+st1+" are anagram");
}else
{
	System.out.println(st+""+st1+"not are anagram");
}


}
         
}
}
	 


