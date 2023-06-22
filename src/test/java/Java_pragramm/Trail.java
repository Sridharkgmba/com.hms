package Java_pragramm;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Trail
{	 
	  	
	public static void main(String[] args) throws Throwable
	{
		int [] a= {1,3,4,5};
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(a[i]);
			}
		}

	}


}
	

		
	
