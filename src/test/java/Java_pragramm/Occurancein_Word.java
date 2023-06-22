package Java_pragramm;

import java.util.LinkedHashSet;

public class Occurancein_Word
{
	public static void main(String[] args) {
		
	
	String st="i am  i am software engineer";
	String[]s=st.split("");
	 LinkedHashSet<String> set = new LinkedHashSet<String>();
	 for( int i=0;i<s.length;i++)
	 {
		 set.add(s[i]);
	 }
	 for(String str:set)
	 {
		 int count=0;
		 for(int i=0;i<s.length;i++)
		 {
			 if(str.equals(s[i]))
			 {
				 count++;
			 }
		 }
		 System.out.println(str+" is repeating "+count+" times");
	 }
	}
}
