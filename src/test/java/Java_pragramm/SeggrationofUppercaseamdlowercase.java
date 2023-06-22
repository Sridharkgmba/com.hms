package Java_pragramm;

public class SeggrationofUppercaseamdlowercase 
{
	public static void main(String[] args) {
		
			String st="@abcd89#$%D";
			 char []ch=st.toCharArray();
			 String a="";
			 String n="";
			 String s=""; 
			 
			 for( int i=0;i<ch.length;i++)
			 {
				 if(ch[i]>='0' && ch[i]<='9')
				 {
					 n=n+ch[i];
				 }
			 else if(ch[i]>='a' && ch[i]<='z'|| ch[i]>'A' && ch[i]<='Z')
			 {
				 a=a+ch[i];
			 }
			 else 
			 {
				s=s+ch[i]; 
			 }
			 }
			//  System.out.println(a);
			  System.out.println(n);
			//  System.out.println(s);
		}
	}
			  
			