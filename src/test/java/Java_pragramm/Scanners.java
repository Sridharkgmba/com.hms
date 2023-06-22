package Java_pragramm;

import java.util.Scanner;

public class Scanners 
{
	public static void main(String[] args) {
		
		for(;;)
		{
		 Scanner sc = new Scanner(System.in);
		 String n = sc.next();
		 int fact=1;
		 for(int i=1;i<10;i++)
		 {
			 fact=fact*i;
		 }
		 System.out.println(fact);
	}
	}
}
