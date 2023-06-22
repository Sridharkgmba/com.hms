package Today;

import java.util.Arrays;

public class Remove_Duplicate_nocollection 
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,10,10,56,56};
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					 int temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[k]=a[i];
				k++;
			}
		}
		a[k]=a[a.length-1];
		for(int i=0;i<=k;i++)
		{
			System.out.println(a[i]);
			
		}
		System.out.println(Arrays.toString(a));
		
	}

}
