package Java_Question_Slove;

import java.util.LinkedHashSet;

public class Quest_6 
{

	public static void main(String[] args) 
	{
		String s="aweeedfff";
	    LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	     for(int i=0;i<s.length();i++)
	    	 
	     {
	    	 set.add(s.charAt(i));
	     }for(Character ch:set)
	     {
	    	 int count=0;
	    	 for( int i=0;i<s.length();i++)
	    	 {
	    		 if(ch==s.charAt(i))
	    		 {
	    			 count++;
	    		 }
	    	 }
	    	 System.out.println(ch+"is repeating +"+count+" times");
	    	 
	     }

	}
	}
