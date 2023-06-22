package com.Genericutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	public String readdatafromexcel(String sheetname,int Rowno,int columnno) throws Throwable
	{

		FileInputStream fis = new FileInputStream(Ipathconstant.Excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh =wb.getSheet(sheetname);
		String value = sh.getRow(Rowno).getCell(columnno).getStringCellValue();
		return value;	                
	}
	
	
	public int getlastrow(String sheetname) throws Throwable
	{
		FileInputStream fis = new FileInputStream(Ipathconstant.Excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		int count = sh.getLastRowNum();
		return count;

	}
	
	public HashMap<String,String> readmultipledata(String sheetname) throws Throwable
	{
		FileInputStream fis = new FileInputStream(Ipathconstant.Excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		int count = sh.getLastRowNum();
		HashMap<String, String> Map = new HashMap<String,String>();
		for(int i=0;i<count;i++)
		{
			String key= sh.getRow(i).getCell(0).getStringCellValue();
			String value = sh.getRow(i).getCell(1).getStringCellValue();
			Map.put(key, value);
		}
		return Map;
	}
	
	public void writemultipledata(String sheetname) throws Throwable
	{
		FileInputStream fis = new FileInputStream(Ipathconstant.Excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		String v = sh.getRow(1).getCell(0).getStringCellValue();
		FileOutputStream fos = new FileOutputStream(Ipathconstant.Excelpath);
		 wb.write(fos);	 
		 
	 }

   public Object[][] DataProviderdata(String sheetname) throws Throwable
   {
	   FileInputStream fis = new FileInputStream(Ipathconstant.Excelpath);
	   Workbook wb = WorkbookFactory.create(fis);
	   Sheet sh = wb.getSheet(sheetname);
	   int lastRow = sh.getLastRowNum()+1;
	   int lastCell = sh.getRow(0).getLastCellNum();
	   Object[][] obj= new Object[lastRow][lastCell];
	    for(int i=0;i<lastRow;i++)
	    {
	    	for(int j=0;j<lastCell;j++)
	    	{
	    	 obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
	    	}
	    }
	    return obj;
   }
}


