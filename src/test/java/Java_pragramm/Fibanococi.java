package Java_pragramm;

public class Fibanococi 
{
	public static void main(String[] args) {
		
		int fib1=0;
		int fib2=1;
		int fib3;
		System.out.println(fib1+" "+fib2+"");
		for ( int i=0;i<=10;i++)
		{
			     fib3=fib1+fib2;
			     fib1=fib2;
			     fib2=fib3;
			     System.out.println(fib3+"");
		}
		
	}

}
