package Today;

public class Remainderof_Array 
{
	public static void main(String[] args) {
		
	
	int []a= {4,5,6,2};
	int []b= {3,4,7,9};
	 int n1=0;
	 int n2=0;
	 for(int i=0;i<a.length;i++)
	 {
		 n1=(n1*10)+a[i];
	 }
	 for(int i=0;i<b.length;i++)
	 {
		 n2=(n2*10)+b[i];
	 }
	 int out=n1+n2;
	 
	 System.out.println(out);

}
}


