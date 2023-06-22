package Today;

public class ReverseString2 
{
	public static void main(String[] args) {
		
	
	String s="kannada";
	     String rev="";
	     for(int i=s.length()-1;i>=1;i++)
	     {
	    	 rev=rev+s.charAt(i);
	     }
	     System.out.println(rev);
			
	}
}
