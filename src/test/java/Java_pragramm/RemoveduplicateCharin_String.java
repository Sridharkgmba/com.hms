package Java_pragramm;

import java.util.LinkedHashSet;

public class RemoveduplicateCharin_String {

	public static void main(String[] args)
	{
		String s="kannnada";
		      
		    LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		     for(int i=0;i<s.length();i++)
		    	 
		     {
		    	 set.add(s.charAt(i));
		     }for(Character ch:set)
		     {
		    	 System.out.print(ch+" ");
		     }
	
		

	}

}
