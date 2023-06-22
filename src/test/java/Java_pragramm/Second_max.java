package Java_pragramm;

public class Second_max
{
	public static void main(String[] args) {
		
	
	int []a= {5,4,0,1,3};
	 int fl=0;
	 int sl=0;
	 
	 for( int i=0;i<a.length;i++)
	 {
		 if(a[i]>fl)
		 {
			 sl=fl;
			 fl=a[i];
		           
		 }
		 else if(a[i]>sl)
		 {
			sl=a[i];
		 }
	 }
	 System.out.println(sl);
	
}
}
