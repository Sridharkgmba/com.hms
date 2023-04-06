package General;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.Genericutility.ExcelUtility;

public class GenericMultipleReadExcel 
{
	   public static void main(String[] args) throws Throwable 
	   {
		    ExcelUtility exu = new ExcelUtility();
		    HashMap<String, String> map = exu.readmultipledata("sheet1");
		    for(Entry<String, String> set:map.entrySet())
		    {
		    	System.out.println(set.getKey()+" "+set.getValue());
		    }
		    

	}

}
